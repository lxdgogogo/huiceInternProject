package com.hc.summer.common.exception;

import com.hc.summer.common.ErrorMsg;

/**
 * @Description 类描述
 * @Author fengquan@huice.com
 * @Date 2020-11-05
 **/
public class ApplicationBaseException extends ServiceException {

    private Integer code;

    public ApplicationBaseException() {
        super();
    }

    public ApplicationBaseException(String message, Integer code) {
        super(message);

        this.code = code;
    }

    public ApplicationBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationBaseException(String message) {
        super(message);
    }

    public ApplicationBaseException(ErrorMsg errorMsg) {
        super(errorMsg.getMsg());

        this.code = errorMsg.getCode();
    }

    public ApplicationBaseException(Throwable cause) {
        super(cause.getMessage(), cause);
    }

    @Override
    public Integer getCode() {
        return this.code;
    }
}