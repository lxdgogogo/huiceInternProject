package com.huice.service_dyna.config;

import org.jooq.ExecuteContext;
import org.springframework.stereotype.Component;

/**
 * Created by huangqian on 2020/11/12 4:40 下午
 *
 * @author huangqian
 */
@Component
public class MerchantCheckListener extends SqlExecuteListener {

    private static final String MERCHANT = "merchant_id";

    @Override
    public void renderEnd(ExecuteContext ctx) {
        super.renderEnd(ctx);
        String[] split = ctx.sql().split("WHERE|where");
        if (split.length > 1 && !split[1].contains(MERCHANT)) {
            throw new EmptyMerchantIdException();
        }
    }

    private static class EmptyMerchantIdException extends RuntimeException {

        @Override
        public String getMessage() {
            return "Operation without condition of merchant_id cannot be executed.";
        }
    }
}
