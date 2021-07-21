package com.hc.summer.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.UnsupportedEncodingException;

/**
 * SQBSDK-md5工具类
 *
 * @since 2020-11-19
 */
public class MD5Util {

    public static String encryptMd5(String string) throws UnsupportedEncodingException {
        return encryptMd5(string, "UTF-8");
    }

    public static String encryptMd5(String string, String charSet) throws UnsupportedEncodingException {
        return DigestUtils.md5Hex(string.getBytes(charSet));
    }
}
