package com.hc.summer.util;


import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Base64Utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.Key;

/**
 * @author liuyuqing
 */
@Slf4j
public class EncryptUtil {

    private static final String AES = "AES";
    /**
     * 加解密统一使用的编码方式
      */
    private final static String ENCODING = "UTF-8";

    /**
     *  密钥长度为16位
     */
    public static String aesEncode(String secretKey, String plainText) {
        String result = null;
        try {
            Key aesKey = new SecretKeySpec(secretKey.getBytes(), AES);
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            byte[] encryptData = cipher.doFinal(plainText.getBytes(ENCODING));
            result = Base64Utils.encodeToString(encryptData);
        } catch (Exception e) {
            log.error("AesEncode error : {}", e.getMessage());
        }
        return result;
    }

    public static String aesDecode(String secretKey, String encryptText) {
        String result = null;
        try {
            Key aesKey = new SecretKeySpec(secretKey.getBytes(), AES);
            Cipher cipher = Cipher.getInstance(AES);
            cipher.init(Cipher.DECRYPT_MODE, aesKey);
            byte[] decryptData = cipher.doFinal(Base64Utils.decodeFromString(encryptText));
            result = new String(decryptData, ENCODING);
        } catch (Exception e) {
            log.error("AesDecode error : {}", e.getMessage());
        }
        return result;
    }

    public static String md5Of(String plainText) {
        try {
            return MD5Util.encryptMd5(plainText);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
         return org.springframework.util.DigestUtils.md5DigestAsHex(plainText.getBytes());
    }

    public static String md5Encode(String plainText, String salt) {
        return md5Of(md5Of(plainText) + salt);
    }

}
