package com.hc.summer.common.constant;

/**
 * @Description 类描述
 * @Author fengquan@huice.com
 * @Date 2021-02-26
 **/
public enum DeleteFlagType {

    /**
     * 删除标记
     **/
    UN_DELETE(0, "未删除"),
    DELETE(1, "删除"),
    ;

    private final Integer value;
    private final String desc;

    DeleteFlagType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer k() {
        return value;
    }

    public Byte value() {
        return value.byteValue();
    }


    public String v() {
        return desc;
    }
}
