package com.hc.summer.common.constant;

/**
 * @author zhengbaole
 */
public class RedisKeys {

    /**
     * 去拿货
     */
    public static final String GO_TO_FETCH = "go_to_fetch";

    /**
     * 去退货
     */
    public static final String GO_TO_RETURN = "go_to_return";

    /**
     * 取消拿货
     */
    public static final String CANCEL_FETCH = "cancel_fetch";

    /**
     * 取消退货
     */
    public static final String CANCEL_RETURN = "cancel_return";

    /**
     * 扫描小标签
     */
    public static final String SCAN_TAG = "scan_tag@@@%s";

    /**
     * key：档口 id、货号、规格名
     */
    public static final String KEY_GOODS_BIZ_MAPPING = "goods_biz_mapping@@@%s@%s@%s";

    /**
     * key：档口 id、货号
     */
    public static final String KEY_GOODS_SPU_MAPPING = "goods_spu_mapping@@@%s%s";

    /**
     * 小标签自增序号（每天第一个小标签前归零）
     */
    public static final String REDIS_KEY_TAG_FETCH_PREFIX = "tag_fetch_index@%s";

    /**
     * 删除之前日期的小标签key
     */
    public static final String REDIS_KEY_TAG_FETCH_LAST_KEY = "tag_fetch_index_last_key";
}
