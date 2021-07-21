package com.hc.summer.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description 接口返回值规范
 * @Author liuyuqing
 * @Date 2020/10/30 10:21
 **/
@Data
@NoArgsConstructor
@ApiModel("接口出参")
@ToString
public class Result<T> {

    public static final int SUCCESS = 200;
    public static final int HALF_SUCCESS = 2000;

    @ApiModelProperty("状态码")
    private int code;
    @ApiModelProperty("提示")
    private String msg;
    @ApiModelProperty("业务数据")
    private T data;

    private Result(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static <T> Result<T> ok() {
        return new Result(SUCCESS, null, "操作成功");
    }

    public static <T> Result<T> ok(String msg) {
        return new Result(SUCCESS, null, msg);
    }

    public static <T> Result<T> ok(T data) {
        return new Result(SUCCESS, data, "操作成功");
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

    public static <T> Result<T> error(ErrorMsg errorMsg) {
        return new Result(errorMsg.getCode(), null, errorMsg.getMsg());
    }

    public static <T> Result<T> error(Result<?> result) {
        return new Result(result.getCode(), null, result.getMsg());
    }

    public static <T> Result<T> error(ErrorMsg errorMsg, T data) {
        return new Result(errorMsg.getCode(), data, errorMsg.getMsg());
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return msg;
    }
}
