package com.huice.service_forwarder.config;

import org.jooq.ExecuteContext;
import org.jooq.impl.DefaultExecuteListener;
import org.springframework.stereotype.Component;

/**
 * Created by huangqian on 2020/11/12 4:39 下午
 *
 * @author huangqian
 */
@Component
public class SqlExecuteListener extends DefaultExecuteListener {

    @Override
    public void renderEnd(ExecuteContext ctx) {
        if (ctx.sql().matches("^(?i:(UPDATE|DELETE)(?!.* WHERE ).*)$")) {
            throw new DeleteOrUpdateWithoutWhereException();
        }
    }

    private static class DeleteOrUpdateWithoutWhereException extends RuntimeException {

        @Override
        public String getMessage() {
            return "Delete or update operation without where cannot be executed.";
        }
    }
}
