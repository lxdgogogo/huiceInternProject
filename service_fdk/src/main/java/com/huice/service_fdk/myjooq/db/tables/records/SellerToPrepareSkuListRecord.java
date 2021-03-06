/*
 * This file is generated by jOOQ.
 */
package com.huice.service_fdk.myjooq.db.tables.records;


import com.huice.service_fdk.myjooq.db.tables.SellerToPrepareSkuList;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 销售商待备货列表|孟炜彬|2020-11-20
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SellerToPrepareSkuListRecord extends UpdatableRecordImpl<SellerToPrepareSkuListRecord> implements Record19<Long, Long, Long, Byte, Long, Long, Long, String, Long, String, BigDecimal, Byte, LocalDateTime, LocalDateTime, LocalDateTime, Byte, Integer, Byte, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.id</code>. 自增ID
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.id</code>. 自增ID
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.merchant_id</code>. 商户id|郑保乐|2020-11-03
     */
    public void setMerchantId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.merchant_id</code>. 商户id|郑保乐|2020-11-03
     */
    public Long getMerchantId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.supplier_id</code>. 供货商 id (supplier_user）的 id |郑保乐|2020-11-13
     */
    public void setSupplierId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.supplier_id</code>. 供货商 id (supplier_user）的 id |郑保乐|2020-11-13
     */
    public Long getSupplierId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.status</code>. 配货状态｜@1：等待备货 @2：备货中  @4：取消备货（要备货前终止）@5：终止备货（要备货后终止）@6: 已发货|郑保乐|2020-12-10
     */
    public void setStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.status</code>. 配货状态｜@1：等待备货 @2：备货中  @4：取消备货（要备货前终止）@5：终止备货（要备货后终止）@6: 已发货|郑保乐|2020-12-10
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.seller_sku_id</code>. 销售商系统SKU ID|郑保乐|2020-11-03
     */
    public void setSellerSkuId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.seller_sku_id</code>. 销售商系统SKU ID|郑保乐|2020-11-03
     */
    public Long getSellerSkuId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.seller_sku_child_id</code>. 销售商系统SKU ID（盘TA前的）|郑保乐|2020-12-10
     */
    public void setSellerSkuChildId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.seller_sku_child_id</code>. 销售商系统SKU ID（盘TA前的）|郑保乐|2020-12-10
     */
    public Long getSellerSkuChildId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.trade_id</code>. 系统订单id|郑保乐|2020-11-03
     */
    public void setTradeId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.trade_id</code>. 系统订单id|郑保乐|2020-11-03
     */
    public Long getTradeId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.trade_no</code>. 系统单号|郑保乐|2020-11-13
     */
    public void setTradeNo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.trade_no</code>. 系统单号|郑保乐|2020-11-13
     */
    public String getTradeNo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.order_id</code>. 系统子单id|郑保乐|2020-11-03
     */
    public void setOrderId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.order_id</code>. 系统子单id|郑保乐|2020-11-03
     */
    public Long getOrderId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.order_no</code>. 系统子单号|郑保乐|2020-11-13
     */
    public void setOrderNo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.order_no</code>. 系统子单号|郑保乐|2020-11-13
     */
    public String getOrderNo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.sku_num</code>. 系统子单中的SKU数量|郑保乐|2020-11-03
     */
    public void setSkuNum(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.sku_num</code>. 系统子单中的SKU数量|郑保乐|2020-11-03
     */
    public BigDecimal getSkuNum() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.delete_flag</code>. 是否删除|@0: 未删除 @1:已删除 | 孟炜彬|2020-11-20
     */
    public void setDeleteFlag(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.delete_flag</code>. 是否删除|@0: 未删除 @1:已删除 | 孟炜彬|2020-11-20
     */
    public Byte getDeleteFlag() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.pay_time</code>. 订单的付款时间|孟炜彬|2020-11-27
     */
    public void setPayTime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.pay_time</code>. 订单的付款时间|孟炜彬|2020-11-27
     */
    public LocalDateTime getPayTime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.created</code>. 创建时间|孟炜彬|2020-11-20
     */
    public void setCreated(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.created</code>. 创建时间|孟炜彬|2020-11-20
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.modified</code>. 修改时间|孟炜彬|2020-11-20
     */
    public void setModified(LocalDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.modified</code>. 修改时间|孟炜彬|2020-11-20
     */
    public LocalDateTime getModified() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.manual_complete_flag</code>. 是否执行过手动人工备齐|郑保乐|2021-01-29
     */
    public void setManualCompleteFlag(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.manual_complete_flag</code>. 是否执行过手动人工备齐|郑保乐|2021-01-29
     */
    public Byte getManualCompleteFlag() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.trade_flag</code>. 订单标记 @0 订单没有标记 |孟炜彬|2021-03-23
     */
    public void setTradeFlag(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.trade_flag</code>. 订单标记 @0 订单没有标记 |孟炜彬|2021-03-23
     */
    public Integer getTradeFlag() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.prior_delivery_flag</code>. 优先发货标记 @0 普通发货；@1优先发货| 孟炜彬 | 2021-04-27
     */
    public void setPriorDeliveryFlag(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.prior_delivery_flag</code>. 优先发货标记 @0 普通发货；@1优先发货| 孟炜彬 | 2021-04-27
     */
    public Byte getPriorDeliveryFlag() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>fdk_goods2.seller_to_prepare_sku_list.take_goods_type</code>. 子单中的货品拿货类型 @0 自拿；@1 代拿|孟炜彬|2021-06-08
     */
    public void setTakeGoodsType(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>fdk_goods2.seller_to_prepare_sku_list.take_goods_type</code>. 子单中的货品拿货类型 @0 自拿；@1 代拿|孟炜彬|2021-06-08
     */
    public Byte getTakeGoodsType() {
        return (Byte) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, Long, Long, Byte, Long, Long, Long, String, Long, String, BigDecimal, Byte, LocalDateTime, LocalDateTime, LocalDateTime, Byte, Integer, Byte, Byte> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<Long, Long, Long, Byte, Long, Long, Long, String, Long, String, BigDecimal, Byte, LocalDateTime, LocalDateTime, LocalDateTime, Byte, Integer, Byte, Byte> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.ID;
    }

    @Override
    public Field<Long> field2() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MERCHANT_ID;
    }

    @Override
    public Field<Long> field3() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SUPPLIER_ID;
    }

    @Override
    public Field<Byte> field4() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.STATUS;
    }

    @Override
    public Field<Long> field5() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_ID;
    }

    @Override
    public Field<Long> field6() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SELLER_SKU_CHILD_ID;
    }

    @Override
    public Field<Long> field7() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TRADE_ID;
    }

    @Override
    public Field<String> field8() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TRADE_NO;
    }

    @Override
    public Field<Long> field9() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.ORDER_ID;
    }

    @Override
    public Field<String> field10() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.ORDER_NO;
    }

    @Override
    public Field<BigDecimal> field11() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.SKU_NUM;
    }

    @Override
    public Field<Byte> field12() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.DELETE_FLAG;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.PAY_TIME;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.CREATED;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MODIFIED;
    }

    @Override
    public Field<Byte> field16() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.MANUAL_COMPLETE_FLAG;
    }

    @Override
    public Field<Integer> field17() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TRADE_FLAG;
    }

    @Override
    public Field<Byte> field18() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.PRIOR_DELIVERY_FLAG;
    }

    @Override
    public Field<Byte> field19() {
        return SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST.TAKE_GOODS_TYPE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getMerchantId();
    }

    @Override
    public Long component3() {
        return getSupplierId();
    }

    @Override
    public Byte component4() {
        return getStatus();
    }

    @Override
    public Long component5() {
        return getSellerSkuId();
    }

    @Override
    public Long component6() {
        return getSellerSkuChildId();
    }

    @Override
    public Long component7() {
        return getTradeId();
    }

    @Override
    public String component8() {
        return getTradeNo();
    }

    @Override
    public Long component9() {
        return getOrderId();
    }

    @Override
    public String component10() {
        return getOrderNo();
    }

    @Override
    public BigDecimal component11() {
        return getSkuNum();
    }

    @Override
    public Byte component12() {
        return getDeleteFlag();
    }

    @Override
    public LocalDateTime component13() {
        return getPayTime();
    }

    @Override
    public LocalDateTime component14() {
        return getCreated();
    }

    @Override
    public LocalDateTime component15() {
        return getModified();
    }

    @Override
    public Byte component16() {
        return getManualCompleteFlag();
    }

    @Override
    public Integer component17() {
        return getTradeFlag();
    }

    @Override
    public Byte component18() {
        return getPriorDeliveryFlag();
    }

    @Override
    public Byte component19() {
        return getTakeGoodsType();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getMerchantId();
    }

    @Override
    public Long value3() {
        return getSupplierId();
    }

    @Override
    public Byte value4() {
        return getStatus();
    }

    @Override
    public Long value5() {
        return getSellerSkuId();
    }

    @Override
    public Long value6() {
        return getSellerSkuChildId();
    }

    @Override
    public Long value7() {
        return getTradeId();
    }

    @Override
    public String value8() {
        return getTradeNo();
    }

    @Override
    public Long value9() {
        return getOrderId();
    }

    @Override
    public String value10() {
        return getOrderNo();
    }

    @Override
    public BigDecimal value11() {
        return getSkuNum();
    }

    @Override
    public Byte value12() {
        return getDeleteFlag();
    }

    @Override
    public LocalDateTime value13() {
        return getPayTime();
    }

    @Override
    public LocalDateTime value14() {
        return getCreated();
    }

    @Override
    public LocalDateTime value15() {
        return getModified();
    }

    @Override
    public Byte value16() {
        return getManualCompleteFlag();
    }

    @Override
    public Integer value17() {
        return getTradeFlag();
    }

    @Override
    public Byte value18() {
        return getPriorDeliveryFlag();
    }

    @Override
    public Byte value19() {
        return getTakeGoodsType();
    }

    @Override
    public SellerToPrepareSkuListRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value2(Long value) {
        setMerchantId(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value3(Long value) {
        setSupplierId(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value5(Long value) {
        setSellerSkuId(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value6(Long value) {
        setSellerSkuChildId(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value7(Long value) {
        setTradeId(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value8(String value) {
        setTradeNo(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value9(Long value) {
        setOrderId(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value10(String value) {
        setOrderNo(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value11(BigDecimal value) {
        setSkuNum(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value12(Byte value) {
        setDeleteFlag(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value13(LocalDateTime value) {
        setPayTime(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value14(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value15(LocalDateTime value) {
        setModified(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value16(Byte value) {
        setManualCompleteFlag(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value17(Integer value) {
        setTradeFlag(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value18(Byte value) {
        setPriorDeliveryFlag(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord value19(Byte value) {
        setTakeGoodsType(value);
        return this;
    }

    @Override
    public SellerToPrepareSkuListRecord values(Long value1, Long value2, Long value3, Byte value4, Long value5, Long value6, Long value7, String value8, Long value9, String value10, BigDecimal value11, Byte value12, LocalDateTime value13, LocalDateTime value14, LocalDateTime value15, Byte value16, Integer value17, Byte value18, Byte value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SellerToPrepareSkuListRecord
     */
    public SellerToPrepareSkuListRecord() {
        super(SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST);
    }

    /**
     * Create a detached, initialised SellerToPrepareSkuListRecord
     */
    public SellerToPrepareSkuListRecord(Long id, Long merchantId, Long supplierId, Byte status, Long sellerSkuId, Long sellerSkuChildId, Long tradeId, String tradeNo, Long orderId, String orderNo, BigDecimal skuNum, Byte deleteFlag, LocalDateTime payTime, LocalDateTime created, LocalDateTime modified, Byte manualCompleteFlag, Integer tradeFlag, Byte priorDeliveryFlag, Byte takeGoodsType) {
        super(SellerToPrepareSkuList.SELLER_TO_PREPARE_SKU_LIST);

        setId(id);
        setMerchantId(merchantId);
        setSupplierId(supplierId);
        setStatus(status);
        setSellerSkuId(sellerSkuId);
        setSellerSkuChildId(sellerSkuChildId);
        setTradeId(tradeId);
        setTradeNo(tradeNo);
        setOrderId(orderId);
        setOrderNo(orderNo);
        setSkuNum(skuNum);
        setDeleteFlag(deleteFlag);
        setPayTime(payTime);
        setCreated(created);
        setModified(modified);
        setManualCompleteFlag(manualCompleteFlag);
        setTradeFlag(tradeFlag);
        setPriorDeliveryFlag(priorDeliveryFlag);
        setTakeGoodsType(takeGoodsType);
    }
}
