package com.hc.summer.common.exception;


import com.hc.summer.common.ErrorCode;
import com.hc.summer.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.util.stream.Collectors;

/**
 * 全局异常处理
 *
 * @author wendiyou
 * @date 2021-01-21
 */
@RestControllerAdvice
@Configuration
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 注解验证参数校验异常
     *
     * @param e 异常
     *
     * @return Result
     */
    @ExceptionHandler({ValidationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Result validationExceptionExceptionHandler(ValidationException e) {
        // 从异常对象中拿到ObjectError对象
        String message;
        if (e instanceof ConstraintViolationException) {
            message = ((ConstraintViolationException) e).getConstraintViolations()
                    .stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.joining());
        } else {
            message = e.getMessage();
        }

        return Result.error(ErrorCode.BAD_REQUEST, message);
    }

    /**
     * 方法参数校验异常
     *
     * @param e 异常
     *
     * @return Result
     */
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Result methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return Result.error(ErrorCode.BAD_REQUEST, objectError.getDefaultMessage());
    }

    /**
     * 请求体读取异常
     *
     * @param e 异常
     *
     * @return Result
     */
    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Result handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        return Result.error(ErrorCode.BAD_REQUEST, "请求格式有误");
    }

    /**
     * 捕获应用级异常 异常code统一规范，2000-2999是用户的异常代码段
     *
     * @param e 异常
     *
     * @return Result
     */
    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Result handleApplicationRuntimeException(ServiceException e) {
        log.error("统一系统运行时异常:", e);
        if (e.getCode() != null) {
            return Result.error(e.getCode(), e.getMessage());
        } else {
            return Result.error(0, e.getMessage());
        }
    }

    /**
     * 请求方法有误
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public Result handleMethodErrorException(HttpRequestMethodNotSupportedException e) {
        log.error("请求方法有误");
        return Result.error(0, "请求方法有误");
    }


    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Result<?> handleException(Throwable t) {
        log.error("统一服务内部异常处理:", t);
        return Result.error(ErrorCode.GLOBAL_ERROR);
    }
}
