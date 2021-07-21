package com.hc.summer.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

import java.security.MessageDigest;
import java.security.Security;

/**
 * @author caoruiqi
 * @创建时间 2020/10/14
 * @描述
 */
public class SHAUtil {

    /**
     * SHA-224加密
     *
     * @param data 待加密数据
     *
     * @return byte[] 消息摘要
     *
     * @throws Exception
     */
    public static byte[] encodeSHA224(byte[] data) throws Exception {
        // 加入BouncyCastleProvider支持
        Security.addProvider(new BouncyCastleProvider());

        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("SHA-224");

        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * SHA-224加密
     *
     * @param data 待加密数据
     *
     * @return byte[] 消息摘要
     *
     * @throws Exception
     */
    public static String encodeSHA224Hex(byte[] data) throws Exception {

        // 执行消息摘要
        byte[] b = encodeSHA224(data);

        // 做十六进制编码处理
        return new String(Hex.encode(b));

    }

    /**
     * SHA256加密
     *
     * @param data 待加密数据
     *
     * @return byte[] 消息摘要
     *
     * @throws Exception
     */
    public static byte[] encodeSHA256(String data) throws Exception {

        // 执行消息摘要
        return DigestUtils.sha256(data);
    }

    /**
     * SHA256Hex加密
     *
     * @param data 待加密数据
     *
     * @return String 消息摘要
     *
     * @throws Exception
     */
    public static String encodeSHA256Hex(String data) throws Exception {

        // 执行消息摘要
        return DigestUtils.sha256Hex(data);
    }

    /**
     * SHA384加密
     *
     * @param data 待加密数据
     *
     * @return byte[] 消息摘要
     *
     * @throws Exception
     */
    public static byte[] encodeSHA384(String data) throws Exception {

        // 执行消息摘要
        return DigestUtils.sha384(data);
    }

    /**
     * SHA384Hex加密
     *
     * @param data 待加密数据
     *
     * @return String 消息摘要
     *
     * @throws Exception
     */
    public static String encodeSHA384Hex(String data) throws Exception {

        // 执行消息摘要
        return DigestUtils.sha384Hex(data);
    }

    /**
     * SHA512Hex加密
     *
     * @param data 待加密数据
     *
     * @return byte[] 消息摘要
     *
     * @throws Exception
     */
    public static byte[] encodeSHA512(String data) throws Exception {

        // 执行消息摘要
        return DigestUtils.sha512(data);
    }

    /**
     * SHA512Hex加密
     *
     * @param data 待加密数据
     *
     * @return String 消息摘要
     *
     * @throws Exception
     */
    public static String encodeSHA512Hex(String data) throws Exception {

        // 执行消息摘要
        return DigestUtils.sha512Hex(data);
    }

}
