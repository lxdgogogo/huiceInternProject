package com.hc.summer.common.constant;

/**
 * @ClassName
 * @Description
 * @Author caoruiqi
 * @Date 2021/6/8 14:23
 */
public enum UserRoleType {

    /**
     * 数据资源类型
     **/
    ADMIN(1L, "ADMIN"),
    MANAGER(2L, "MANAGER"),
    EMP(3L, "EMP"),
    ;

    private final Long value;
    private final String desc;

    UserRoleType(Long value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Long k() {
        return value;
    }

    public Long value() {
        return value;
    }
    public Integer intValue() {
        return value.intValue();
    }

    public String v() {
        return desc;
    }



    /**
     * 通过value取枚举
     * @param value
     * @return
     */
    public static UserRoleType getTypeByValue(Long value){
        if (value ==null){
            return null;
        }

        for (UserRoleType enums : UserRoleType.values()) {
            if (enums.value.equals(value)) {
                return enums;
            }
        }
        return null;
    }


}
