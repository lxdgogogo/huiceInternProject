package com.huice.service_gateway.filter;

import com.alibaba.fastjson.JSONObject;
import com.huice.service_gateway.common.Result;
import com.huice.service_gateway.config.IgnoreUrl;
import com.huice.service_gateway.util.JwtUtil;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Component
@Slf4j
public class AuthorizeFilter implements GlobalFilter, Ordered {

    private static final String AUTHORIZE_TOKEN = "token";

    @Autowired
    IgnoreUrl ignoreUrl;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1. 获取请求
        ServerHttpRequest request = exchange.getRequest();
        //2. 则获取响应
        ServerHttpResponse response = exchange.getResponse();

        boolean flag = false;
        List<IgnoreUrl.Permission> list = ignoreUrl.getList();
        for (IgnoreUrl.Permission permission : list) {
            if (request.getURI().getPath().contains(permission.getPath())) {
                flag = true;
            }
        }
        //3. 如果是登录请求 或者其他不要验证token的请求则放行
        if (flag) {
            return chain.filter(exchange);
        }

        //4. 获取请求头
        HttpHeaders headers = request.getHeaders();
        List<String> stringToken = request.getQueryParams().get("token");
        //5. 请求头中获取令牌
        String token = headers.getFirst(AUTHORIZE_TOKEN);

        //6. 判断请求头中是否有令牌
        if (StringUtils.isEmpty(token)) {
            if (stringToken != null && stringToken.size() > 0) {
                token = stringToken.get(0);
            } else {
                //7. 响应中放入返回的状态吗, 没有权限访问
                response.setStatusCode(HttpStatus.UNAUTHORIZED);
                //8. 返回
                return authError(response,"未登录");
            }
        }

        String userId;
        String userName;
        String roleType;

        //9. 如果请求头中有令牌则解析令牌
        try {
            Claims claimsBody = JwtUtil.getClaimsBody(token);
            userId = claimsBody.get("userId") == null ? "" : claimsBody.get("userId").toString();
            userName = claimsBody.get("userName") == null ? "" : claimsBody.get("userName").toString();
            userName = URLEncoder.encode(userName, "UTF-8");
            roleType = claimsBody.get("roleType") == null ? "" : claimsBody.get("roleType").toString();
        } catch (Exception e) {
            //10. 解析jwt令牌出错, 说明令牌过期或者伪造等不合法情况出现
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            //11. 返回
            return authError(response,"认证失败");
        }

        //放入公共参数
        URI uri = exchange.getRequest().getURI();
        StringBuilder query = new StringBuilder();
        query.append('&').append("userId").append('=').append(userId);
        query.append('&').append("merchantId").append('=').append(userId);
        query.append('&').append("userName").append('=').append(userName);
        query.append('&').append("roleType").append('=').append(roleType);

        //把请求参数重新拼接回去，并放入request中传递到过滤链的下一个请求中去
        return chainFilter(exchange, chain, uri, query);
    }

    private Mono<Void> chainFilter(ServerWebExchange exchange, GatewayFilterChain chain, URI uri, StringBuilder query) {
        try {
            URI newUri = UriComponentsBuilder.fromUri(uri)
                    .replaceQuery(query.toString()).build(true).toUri();

            ServerHttpRequest newRequest = exchange.getRequest().mutate().uri(newUri)
                    .build();
            //12. 放行
            return chain.filter(exchange.mutate().request(newRequest).build());
        } catch (RuntimeException ex) {
            throw new IllegalStateException(
                    "Invalid URI query: \"" + query.toString() + "\"");
        }
    }

    /**
     * 认证错误输出
     * @param resp 响应对象
     * @param message 错误信息
     * @return
     */
    private Mono<Void> authError(ServerHttpResponse resp,String message) {
        resp.setStatusCode(HttpStatus.UNAUTHORIZED);
        resp.getHeaders().add("Content-Type","application/json;charset=UTF-8");
        String json = JSONObject.toJSONString(Result.error(HttpStatus.UNAUTHORIZED.value(), message));
        DataBuffer buffer = resp.bufferFactory().wrap(json.getBytes(StandardCharsets.UTF_8));
        return resp.writeWith(Flux.just(buffer));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
