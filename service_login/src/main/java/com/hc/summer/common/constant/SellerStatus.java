package com.hc.summer.common.constant;

/**
 * 销售商状态
 *
 * @author wendiyou
 * @date 2021-06-07
 */
public enum SellerStatus {

    /**
     * 默认状态：有效
     */
    DEFAULT(0),
    /**
     * 已删除
     */
    DELETED(1),
    /**
     * 待审核
     */
    PENDING_REVIEW(2),
    ;
    Byte k;

    SellerStatus(int k) {
        this.k = (byte)k;
    }

    public Byte getK() {
        return this.k;
    }
}
