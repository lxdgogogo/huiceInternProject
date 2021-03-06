/*
 * This file is generated by jOOQ.
 */
package com.hc.summer.db.tables.records;


import com.hc.summer.db.tables.SysUser;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysUserRecord extends UpdatableRecordImpl<SysUserRecord> implements Record9<Long, String, String, String, String, Long, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 24786502;

    /**
     * Setter for <code>fdk_user2.sys_user.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>fdk_user2.sys_user.user_name</code>. 用户姓名|文弟友|2021-01-18
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.user_name</code>. 用户姓名|文弟友|2021-01-18
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>fdk_user2.sys_user.user_phone</code>. 用户手机号|文弟友|2021-01-18
     */
    public void setUserPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.user_phone</code>. 用户手机号|文弟友|2021-01-18
     */
    public String getUserPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>fdk_user2.sys_user.password</code>. 登录密码|文弟友|2021-01-18
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.password</code>. 登录密码|文弟友|2021-01-18
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>fdk_user2.sys_user.salt</code>. 密码加盐hash值|文弟友|2021-01-18
     */
    public void setSalt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.salt</code>. 密码加盐hash值|文弟友|2021-01-18
     */
    public String getSalt() {
        return (String) get(4);
    }

    /**
     * Setter for <code>fdk_user2.sys_user.user_pid</code>. 员工上级ID|文弟友|2021-01-18
     */
    public void setUserPid(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.user_pid</code>. 员工上级ID|文弟友|2021-01-18
     */
    public Long getUserPid() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>fdk_user2.sys_user.delete_flag</code>. 删除符号|@0：未删除；@1：有删除|文弟友|2021-01-18
     */
    public void setDeleteFlag(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.delete_flag</code>. 删除符号|@0：未删除；@1：有删除|文弟友|2021-01-18
     */
    public Byte getDeleteFlag() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>fdk_user2.sys_user.created</code>.
     */
    public void setCreated(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.created</code>.
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>fdk_user2.sys_user.modified</code>.
     */
    public void setModified(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user.modified</code>.
     */
    public LocalDateTime getModified() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, Long, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, String, Long, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SysUser.SYS_USER.ID;
    }

    @Override
    public Field<String> field2() {
        return SysUser.SYS_USER.USER_NAME;
    }

    @Override
    public Field<String> field3() {
        return SysUser.SYS_USER.USER_PHONE;
    }

    @Override
    public Field<String> field4() {
        return SysUser.SYS_USER.PASSWORD;
    }

    @Override
    public Field<String> field5() {
        return SysUser.SYS_USER.SALT;
    }

    @Override
    public Field<Long> field6() {
        return SysUser.SYS_USER.USER_PID;
    }

    @Override
    public Field<Byte> field7() {
        return SysUser.SYS_USER.DELETE_FLAG;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return SysUser.SYS_USER.CREATED;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return SysUser.SYS_USER.MODIFIED;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserName();
    }

    @Override
    public String component3() {
        return getUserPhone();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public String component5() {
        return getSalt();
    }

    @Override
    public Long component6() {
        return getUserPid();
    }

    @Override
    public Byte component7() {
        return getDeleteFlag();
    }

    @Override
    public LocalDateTime component8() {
        return getCreated();
    }

    @Override
    public LocalDateTime component9() {
        return getModified();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserName();
    }

    @Override
    public String value3() {
        return getUserPhone();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public String value5() {
        return getSalt();
    }

    @Override
    public Long value6() {
        return getUserPid();
    }

    @Override
    public Byte value7() {
        return getDeleteFlag();
    }

    @Override
    public LocalDateTime value8() {
        return getCreated();
    }

    @Override
    public LocalDateTime value9() {
        return getModified();
    }

    @Override
    public SysUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SysUserRecord value2(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public SysUserRecord value3(String value) {
        setUserPhone(value);
        return this;
    }

    @Override
    public SysUserRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public SysUserRecord value5(String value) {
        setSalt(value);
        return this;
    }

    @Override
    public SysUserRecord value6(Long value) {
        setUserPid(value);
        return this;
    }

    @Override
    public SysUserRecord value7(Byte value) {
        setDeleteFlag(value);
        return this;
    }

    @Override
    public SysUserRecord value8(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SysUserRecord value9(LocalDateTime value) {
        setModified(value);
        return this;
    }

    @Override
    public SysUserRecord values(Long value1, String value2, String value3, String value4, String value5, Long value6, Byte value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysUserRecord
     */
    public SysUserRecord() {
        super(SysUser.SYS_USER);
    }

    /**
     * Create a detached, initialised SysUserRecord
     */
    public SysUserRecord(Long id, String userName, String userPhone, String password, String salt, Long userPid, Byte deleteFlag, LocalDateTime created, LocalDateTime modified) {
        super(SysUser.SYS_USER);

        set(0, id);
        set(1, userName);
        set(2, userPhone);
        set(3, password);
        set(4, salt);
        set(5, userPid);
        set(6, deleteFlag);
        set(7, created);
        set(8, modified);
    }
}
