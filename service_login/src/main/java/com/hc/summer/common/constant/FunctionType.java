package com.hc.summer.common.constant;

/**
 * 菜单类型
 *
 * @author wendiyou
 * @date 2021-06-04
 */
public enum FunctionType {
    /**
     * Web端菜单
     */
    WEB(0),
    /**
     * APP端菜单
     */
    APP(1)
    ;
    private Byte k;

    FunctionType(int k) {
        this.k = (byte) k;
    }

    public Byte getK() {
        return this.k;
    }
}
