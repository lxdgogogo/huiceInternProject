package com.huice.service_dyna.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 接口返回值规范
 * @Author liuyuqing
 * @Date 2020/10/30 10:21
 **/
@Data
@NoArgsConstructor
public class Result<T> {

    public static final int SUCCESS = 200;
    public static final int HALF_SUCCESS = 2000;
    private static final String DEFAULT_SUCCESS_MSG = "操作成功";

    private int code;

    private String msg;

    private T data;

    private Result(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static <T> Result<T> ok() {
        return new Result(SUCCESS, null, DEFAULT_SUCCESS_MSG);
    }

//    public static Result ok(Runnable runnable) {
//        runnable.run();
//        return ok();
//    }

    public static <T> Result<T> ok(T data) {
        return new Result(SUCCESS, data, DEFAULT_SUCCESS_MSG);
    }

    public static <T> Result<T> ok(T data, String msg) {
        return new Result(SUCCESS, data, msg);
    }

    public static <T> Result<T> halfSuccess(T data, String msg) {
        return new Result(HALF_SUCCESS, data, msg);
    }

    public static <T> Result<T> error(int code, String errorMsg) {
        return new Result(code, null, errorMsg);
    }

    public static <T> Result<T> error(int code, String errorMsg, T data) {
        return new Result(code, data, errorMsg);
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
