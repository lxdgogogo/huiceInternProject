package com.hc.summer.common.constant;

/**
 * @ClassName
 * @Description  用户权限资源枚举
 * @Author caoruiqi
 * @Date 2021/6/8 13:53
 */
public enum UserResourcesType {

    /**
     * 数据资源类型 城市
     **/
    CITY(1, "city"),
    /**
     * 市场
     */
    MARKET(2, "market"),
    /**
     * 楼层
     */
    FLOOR(3, "floor"),
    /**
     * 档口商户
     */
    BUSINESS(4, "business"),
    ;

    private final Integer value;
    private final String desc;

    UserResourcesType(int value, String desc) {
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

    /**
     * 通过value取枚举
     * @param value
     * @return
     */
    public static UserResourcesType getTypeByValue(int value){
        if (value == 0){
            return null;
        }

        for (UserResourcesType enums : UserResourcesType.values()) {
            if (enums.value.equals(value)) {
                return enums;
            }
        }
        return null;
    }

}
