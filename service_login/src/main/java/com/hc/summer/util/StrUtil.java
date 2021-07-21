package com.hc.summer.util;

import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * String工具类
 *
 * @author wendiyou
 * @date 2021-04-20
 */
public class StrUtil {

    public static String list2String(List<String> list) {
        if (CollectionUtils.isEmpty(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(0));
        for (int i = 1;i < list.size();i++) {
            sb.append(",").append(list.get(i));
        }
        return sb.toString();
    }
}
