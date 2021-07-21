package com.hc.summer.common;

/**
 * @Description: BaseErrorMessage
 * @Author lishuaishuai
 * @Date 2020/11/2 上午10:54
 **/
public enum ErrorCode implements ErrorMsg {

    // 全局信息
    GLOBAL_ERROR(2001, "服务开小差了~"),
    SIGN_ERROR(2002, "验签失败"),
    BAD_REQUEST(400, "参数校验异常"),

    // 通用
    CODE_ERROR(1000, "验证码错误"),

    // 用户操作
    USER_PHONE_ALREADY_EXIST(1001, "手机号已经存在"),
    USER_LOGIN_ACCOUNT_ALREADY_EXIST(1002, "登录账号已经存在"),
    USER_NAME_ALREADY_EXIST(1002, "用户姓名已经存在"),
    USER_NOT_EXIST(1003, "用户不存在"),
    CANNOT_UPDATE_CUR_USER(1004, "该用户不能被修改，或无操作权限"),

    //用户登录
    USER_LOGIN_ACCOUNT_NOT_EXIST(1005, "登录账号不存在"),
    USER_LOGIN_PASSWORD_ERROR(1006, "密码错误"),
    USER_LOGIN_ERROR(1006, "账号或密码输入错误，请重新输入"),
    USER_PASSWORD_NEW_EQUAL_OLD(1007, "新旧密码相等"),
    USER_ROLE_NOT_EXIST(1008, "用户角色缺失"),
    USER_PHONE_NOT_EXIST(1009, "请先申请账号"),
    USER_ACCOUNT_WAITING_AUDIT(1210, "您的账号已禁用，请联系系统管理员"),

    // 代拿合作
    APPLY_CITY_NOT_EXIST(1300, "申请城市不存在"),
    APPLY_COOPERATION_RECORD_NOT_EXIST(1300, "合作申请记录不存在"),

    // 销售商
    SELLER_NOT_EXIST(1300, "销售商不存在"),
    SELLER_SHORT_NAME_EXIST(1300, "销售商简称已经存在"),

    SUCCESS(200, "成功"),

    EXAMPLE(3000, "示例"),
    INVALID_ENUM_TYPE(3333, "无效的枚举类型"),

    INVALID_PARAM(3009, "缺少必要参数"),
    ILLEGAL_PARAM(3010, "参数不合规 "),
    ILLEGAL_FILE(3010, "文件类型错误"),
    HTTP_METHOD_ERROR(3010, "请求方式错误"),
    HTTP_MEDIA_TYPE_ERROR(3010, "Content-Type错误"),
    ILLEGAL_STRING_LENGTH(3011, "货品名称、规格名称不能超过30个汉字,60个字母"),

    REDISSON_LOCK_EXCEPTION(3900, "LockError"),

    REDISSON_LOCK_TIME_OUT(3900, "正在执行，请稍后重试"),

    RECEIVE_MSG_FAILED(3910, "消息体错误"),

    RECEIVE_MSG_REPEAT(3911, "消息重复"),

    TAG_HAS_SCAN(3945, "小标签已被扫描过"),

    /* openApi错误码，code号段参照基础服务，1000-2000 */
    SYS_APP_KEY_ERROR(1001, "appkey不存在"),

    SYS_PARAMS_ERROR(1002, "参数缺失或异常"),

    SYS_TIMEOUT_ERROR(1003, "请求超时"),

    SYS_SIGN_VALID_ERROR(1004, "签名校验未通过"),

    // 档口保存校验操作
    CITY_CODE_NAME_ERROR(1001, "城市编码校验失败"),
    MARKET_CODE_NAME_ERROR(1002, "市场编码校验失败"),
    FLOOR_CODE_NAME_ERROR(1002, "楼层编码校验失败"),
    ;


    private int code;
    private String message;

    private ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.message;
    }

    public String getMsg(Object... args) {
        return String.format(this.message, args);
    }
}
