package com.huice.service_fdk.common;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Result<T> {

    public static final int SUCCESS = 200;
    public static final int HALFSUCCESS = 2000;

    private int code;

    private String msg;

    private T data;

    private Result(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static <T> Result<T> ok() {
        return new Result(SUCCESS, null, null);
    }

    public static <T> Result<T> ok(String msg) {
        return new Result(SUCCESS, null, msg);
    }

    public static <T> Result<T> ok(T data) {
        return new Result(SUCCESS, data, null);
    }

    public static <T> Result<T> ok(T data, String msg) {
        return new Result(SUCCESS, data, msg);
    }

    public static <T> Result<T> error(int code, String errorMsg) {
        return new Result(code, null, errorMsg);
    }

    public static <T> Result<T> error(int code, String errorMsg, T data) {
        return new Result(code, data, errorMsg);
    }



    public static <T> Result<T> error(Result<?> result) {
        return new Result(result.getCode(), null, result.getMsg());
    }



    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}


