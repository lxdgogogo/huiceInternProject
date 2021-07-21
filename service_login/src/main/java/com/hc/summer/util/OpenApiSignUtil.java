package com.hc.summer.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 外部接口签名验签工具类
 *
 * @author wendiyou
 * @date 2021-07-01
 */
public class OpenApiSignUtil {

    /**
     * 获取签名
     * @param data 请求体数据
     * @param timestamp 请求时间戳
     * @param appKey 应用Key
     * @param appSecret 应用Secret
     * @return 签名
     */
    public static String sign(String data,String timestamp,String appKey,String appSecret) {
        // 1、请求体 JSON 字符串去除 所有 \r / \n / \t及空格 后得到的字符串
        data = data.replaceAll("\\s*","");

        // 2、将appKey=value、data=value、timestamp=value拼接在一起
        String str = "appKey=" + appKey + "data=" + data + "timestamp=" + timestamp;
        // 3、将密钥附在上一步字符串尾后
        str = str + appSecret;
        // 4、将上一步的字符串进行MD5得到签名
        String sign = DigestUtils.md5Hex(str);

        return sign;
    }
}
