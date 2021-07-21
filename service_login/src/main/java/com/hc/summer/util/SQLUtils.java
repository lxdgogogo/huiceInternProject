package com.hc.summer.util;

/**
 * @Description SqlUtils
 * @Author zhengbaole
 * @Date 2020/11/12
 **/
public class SQLUtils {


    /**
     * like %ABC%
     */
    public static String surroundingLike(String val) {
        return "%" + clean(val) + "%";
    }

    /**
     * like %ABC
     */
    public static String prefixLike(String val) {
        return "%" + clean(val);
    }

    /**
     * like ABC%
     */
    public static String suffixLike(String val) {
        return clean(val) + "%";
    }

    /**
     * 转义 "%"、"_"
     */
    public static String clean(String val) {
        return
                val.replaceAll("%", "\\\\%")
                        .replaceAll("_", "\\\\_");
    }
}
