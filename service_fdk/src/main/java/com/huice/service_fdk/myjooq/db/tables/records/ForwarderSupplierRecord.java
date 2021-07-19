/*
 * This file is generated by jOOQ.
 */
package com.huice.service_fdk.myjooq.db.tables.records;


import com.huice.service_fdk.myjooq.db.tables.ForwarderSupplier;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 销售商已创建的代拿供货商|刘宇晴|2021-06-08
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForwarderSupplierRecord extends UpdatableRecordImpl<ForwarderSupplierRecord> implements Record14<Long, Long, Long, String, Long, String, Long, String, Long, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.merchant_id</code>. 销售商merchant_id|刘宇晴|2021-06-08
     */
    public void setMerchantId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.merchant_id</code>. 销售商merchant_id|刘宇晴|2021-06-08
     */
    public Long getMerchantId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.forwarder_supplier_id</code>. 代拿端供货商id |刘宇晴|2021-06-08
     */
    public void setForwarderSupplierId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.forwarder_supplier_id</code>. 代拿端供货商id |刘宇晴|2021-06-08
     */
    public Long getForwarderSupplierId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.city</code>. 城市 |刘宇晴|2021-06-08
     */
    public void setCity(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.city</code>. 城市 |刘宇晴|2021-06-08
     */
    public String getCity() {
        return (String) get(3);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.city_code</code>. 城市编码 |刘宇晴|2021-06-08
     */
    public void setCityCode(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.city_code</code>. 城市编码 |刘宇晴|2021-06-08
     */
    public Long getCityCode() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.market</code>. 市场 |刘宇晴|2021-06-08
     */
    public void setMarket(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.market</code>. 市场 |刘宇晴|2021-06-08
     */
    public String getMarket() {
        return (String) get(5);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.market_code</code>. 市场编码 |刘宇晴|2021-06-08
     */
    public void setMarketCode(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.market_code</code>. 市场编码 |刘宇晴|2021-06-08
     */
    public Long getMarketCode() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.floor</code>. 楼层 |刘宇晴|2021-06-08
     */
    public void setFloor(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.floor</code>. 楼层 |刘宇晴|2021-06-08
     */
    public String getFloor() {
        return (String) get(7);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.floor_code</code>. 楼层编码 |刘宇晴|2021-06-08
     */
    public void setFloorCode(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.floor_code</code>. 楼层编码 |刘宇晴|2021-06-08
     */
    public Long getFloorCode() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.business</code>. 档口 |刘宇晴|2021-06-08
     */
    public void setBusiness(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.business</code>. 档口 |刘宇晴|2021-06-08
     */
    public String getBusiness() {
        return (String) get(9);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.supplier_name</code>. 供货商全名 |刘宇晴|2021-06-08
     */
    public void setSupplierName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.supplier_name</code>. 供货商全名 |刘宇晴|2021-06-08
     */
    public String getSupplierName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.group_name</code>. 分组 |刘宇晴|2021-06-08
     */
    public void setGroupName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.group_name</code>. 分组 |刘宇晴|2021-06-08
     */
    public String getGroupName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>fdk_goods2.forwarder_supplier.modified</code>.
     */
    public void setModified(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>fdk_goods2.forwarder_supplier.modified</code>.
     */
    public LocalDateTime getModified() {
        return (LocalDateTime) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, Long, Long, String, Long, String, Long, String, Long, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Long, Long, Long, String, Long, String, Long, String, Long, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.ID;
    }

    @Override
    public Field<Long> field2() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.MERCHANT_ID;
    }

    @Override
    public Field<Long> field3() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.FORWARDER_SUPPLIER_ID;
    }

    @Override
    public Field<String> field4() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.CITY;
    }

    @Override
    public Field<Long> field5() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.CITY_CODE;
    }

    @Override
    public Field<String> field6() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.MARKET;
    }

    @Override
    public Field<Long> field7() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.MARKET_CODE;
    }

    @Override
    public Field<String> field8() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.FLOOR;
    }

    @Override
    public Field<Long> field9() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.FLOOR_CODE;
    }

    @Override
    public Field<String> field10() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.BUSINESS;
    }

    @Override
    public Field<String> field11() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.SUPPLIER_NAME;
    }

    @Override
    public Field<String> field12() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.GROUP_NAME;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.CREATED;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return ForwarderSupplier.FORWARDER_SUPPLIER.MODIFIED;
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
        return getForwarderSupplierId();
    }

    @Override
    public String component4() {
        return getCity();
    }

    @Override
    public Long component5() {
        return getCityCode();
    }

    @Override
    public String component6() {
        return getMarket();
    }

    @Override
    public Long component7() {
        return getMarketCode();
    }

    @Override
    public String component8() {
        return getFloor();
    }

    @Override
    public Long component9() {
        return getFloorCode();
    }

    @Override
    public String component10() {
        return getBusiness();
    }

    @Override
    public String component11() {
        return getSupplierName();
    }

    @Override
    public String component12() {
        return getGroupName();
    }

    @Override
    public LocalDateTime component13() {
        return getCreated();
    }

    @Override
    public LocalDateTime component14() {
        return getModified();
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
        return getForwarderSupplierId();
    }

    @Override
    public String value4() {
        return getCity();
    }

    @Override
    public Long value5() {
        return getCityCode();
    }

    @Override
    public String value6() {
        return getMarket();
    }

    @Override
    public Long value7() {
        return getMarketCode();
    }

    @Override
    public String value8() {
        return getFloor();
    }

    @Override
    public Long value9() {
        return getFloorCode();
    }

    @Override
    public String value10() {
        return getBusiness();
    }

    @Override
    public String value11() {
        return getSupplierName();
    }

    @Override
    public String value12() {
        return getGroupName();
    }

    @Override
    public LocalDateTime value13() {
        return getCreated();
    }

    @Override
    public LocalDateTime value14() {
        return getModified();
    }

    @Override
    public ForwarderSupplierRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value2(Long value) {
        setMerchantId(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value3(Long value) {
        setForwarderSupplierId(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value4(String value) {
        setCity(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value5(Long value) {
        setCityCode(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value6(String value) {
        setMarket(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value7(Long value) {
        setMarketCode(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value8(String value) {
        setFloor(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value9(Long value) {
        setFloorCode(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value10(String value) {
        setBusiness(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value11(String value) {
        setSupplierName(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value12(String value) {
        setGroupName(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value13(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord value14(LocalDateTime value) {
        setModified(value);
        return this;
    }

    @Override
    public ForwarderSupplierRecord values(Long value1, Long value2, Long value3, String value4, Long value5, String value6, Long value7, String value8, Long value9, String value10, String value11, String value12, LocalDateTime value13, LocalDateTime value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ForwarderSupplierRecord
     */
    public ForwarderSupplierRecord() {
        super(ForwarderSupplier.FORWARDER_SUPPLIER);
    }

    /**
     * Create a detached, initialised ForwarderSupplierRecord
     */
    public ForwarderSupplierRecord(Long id, Long merchantId, Long forwarderSupplierId, String city, Long cityCode, String market, Long marketCode, String floor, Long floorCode, String business, String supplierName, String groupName, LocalDateTime created, LocalDateTime modified) {
        super(ForwarderSupplier.FORWARDER_SUPPLIER);

        setId(id);
        setMerchantId(merchantId);
        setForwarderSupplierId(forwarderSupplierId);
        setCity(city);
        setCityCode(cityCode);
        setMarket(market);
        setMarketCode(marketCode);
        setFloor(floor);
        setFloorCode(floorCode);
        setBusiness(business);
        setSupplierName(supplierName);
        setGroupName(groupName);
        setCreated(created);
        setModified(modified);
    }
}
