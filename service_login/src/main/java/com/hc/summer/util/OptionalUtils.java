/*
 * Copyright 2019-2020 北京掌上先机网络科技有限公司
 */

package com.hc.summer.util;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Function;

import static java.util.Objects.requireNonNull;

/**
 * @Description 处理对象为null时的默认值
 * @Author liuyuqing
 * @Date 2020/10/30 10:21
 **/
public class OptionalUtils {

    /**
     * 如果为null返回默认值 ""
     *
     * @param value 原值
     *
     * @return 原值或默认值
     */
    public static String valueOrDefault(String value) {
        return Optional.ofNullable(value).orElse("");
    }

    /**
     * 如果为 null 或 "" 返回 "无"
     *
     * @param value 原值
     *
     * @return 原值或 "无"
     */
    public static String valueOrNone(String value) {
        String result = Optional.ofNullable(value).orElse("");
        if ("".equals(result)) {
            return "无";
        }
        return value;
    }

    /**
     * 如果为null返回默认值0
     *
     * @param value 原值
     *
     * @return 原值或默认值
     */
    public static Integer valueOrDefault(Integer value) {
        return Optional.ofNullable(value).orElse(0);
    }

    /**
     * 如果为null返回默认值0
     *
     * @param value 原值
     *
     * @return 原值或默认值
     */
    public static Byte valueOrDefault(Byte value) {
        return Optional.ofNullable(value).orElse((byte) 0);
    }

    /**
     * 如果为null返回默认值0
     *
     * @param value 原值
     *
     * @return 原值或默认值
     */
    public static Short valueOrDefault(Short value) {
        return Optional.ofNullable(value).orElse(((short) 0));
    }

    /**
     * 如果为null返回默认值0
     *
     * @param value 原值
     *
     * @return 原值或默认值
     */
    public static Long valueOrDefault(Long value) {
        return Optional.ofNullable(value).orElse(((long) 0));
    }

    /**
     * 如果为null返回默认值0
     *
     * @param value 原值
     *
     * @return 原值或默认值
     */
    public static BigDecimal valueOrDefault(BigDecimal value) {
        return Optional.ofNullable(value).orElse(BigDecimal.ZERO);
    }

    /**
     * 如果为null返回默认值
     *
     * @param value 原值
     *
     * @return 原值或默认值
     */
    public static LocalDate valueOrDefault(LocalDate value, LocalDate date) {
        return Optional.ofNullable(value).orElse(date);
    }

    /**
     * 如果为null返回默认值 false
     *
     * @param value 原值
     *
     * @return 原值或默认值
     */
    public static Boolean valueOrDefault(Boolean value) {
        return Optional.ofNullable(value).orElse(Boolean.FALSE);
    }

    /**
     * 如果为null返回默认值
     *
     * @param value        原值
     * @param defaultValue 默认值
     *
     * @return 原值或默认值
     */
    public static <T> T valueOrDefault(T value, T defaultValue) {
        return Optional.ofNullable(value).orElse(defaultValue);
    }

    /**
     * 如果为null返回默认值
     *
     * @param value        原值
     * @param defaultValue 默认值
     *
     * @return 原值或默认值
     */
    public static <E, T> T valueOrDefault(E value, Function<E, T> mapper, T defaultValue) {
        return Optional.ofNullable(value).map(requireNonNull(mapper)).orElse(defaultValue);
    }
}
