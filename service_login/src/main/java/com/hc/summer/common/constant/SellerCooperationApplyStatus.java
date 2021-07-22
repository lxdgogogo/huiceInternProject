package com.hc.summer.common.constant;

/**
 * 销售商合作申请状态
 *
 * @author wendiyou
 * @date 2021-06-07
 */
public enum SellerCooperationApplyStatus {

    /**
     * 待审核
     */
    PENDING_REVIEW(0),
    /**
     * 审核通过
     */
    PASSED(1),
    /**
     * 审核拒绝
     */
    REJECTED(2),
    ;
    Byte k;

    SellerCooperationApplyStatus(int k) {
        this.k = (byte)k;
    }

    public Byte getK() {
        return this.k;
    }
}
