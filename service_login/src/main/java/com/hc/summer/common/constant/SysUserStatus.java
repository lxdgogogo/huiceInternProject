package com.hc.summer.common.constant;

/**
 * 用户状态
 *
 * @author wendiyou
 * @date 2021-06-03
 */
public enum SysUserStatus {

    /**
     * 用户状态-默认：正常未删除
     */
    DEFAULT(0),
    /**
     * 已禁用
     */
    DELETED(1),
    /**
     * 待审核
     */
    WAIT_AUDIT(2),
    ;

    private Byte k;

    SysUserStatus(int k) {
        this.k = (byte)k;
    }

    public Byte getK() {
        return this.k;
    }

    public byte k() {
        return this.k;
    }
}
