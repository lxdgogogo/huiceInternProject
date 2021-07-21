package com.hc.summer.common.exception;

import com.hc.summer.common.ErrorCode;
import com.hc.summer.common.ErrorMsg;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 业务层异常
 * @Author liuyuqing
 * @Date 2020/11/20 15:45
 **/
@Getter
public class ServiceException extends RuntimeException {

    private Integer code;
    private String description;
    private List<String> args = new ArrayList<>();
    private Object data;

    public ServiceException() { }

    public ServiceException(String description) {
        super(description);
        this.description = description;
    }

    public ServiceException(String description, Object data) {
        super(description);
        this.description = description;
        this.data = data;
    }

    public ServiceException(ErrorMsg errorMsg) {
        this(errorMsg.getCode(), errorMsg.getMsg());
    }

    public ServiceException(ErrorCode errorCode, String... args) {
        this.code = errorCode.getCode();
        this.description = errorCode.getMsg();
        this.args = Arrays.asList(args);
    }

    public ServiceException(ErrorCode errorCode, Object data) {
        this.code = errorCode.getCode();
        this.description = errorCode.getMsg();
        this.data = data;
    }

    public ServiceException(int code, String description) {
        super(description);
        this.description = description;
        this.code = code;
    }

    public ServiceException(int code, Throwable cause) {
        this(code, cause.getMessage());
    }

    public Integer getCode() {
        return null == code ? 400 : code;
    }
}
