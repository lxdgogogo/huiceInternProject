/*
 * This file is generated by jOOQ.
 */
package com.hc.summer.db.tables.records;


import com.hc.summer.db.tables.SysUserRole;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class SysUserRoleRecord extends UpdatableRecordImpl<SysUserRoleRecord> implements Record4<Long, Long, Long, LocalDateTime> {

    private static final long serialVersionUID = 583337724;

    /**
     * Setter for <code>fdk_user2.sys_user_role.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user_role.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>fdk_user2.sys_user_role.user_id</code>. 用户ID|文弟友|2021-01-18
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user_role.user_id</code>. 用户ID|文弟友|2021-01-18
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>fdk_user2.sys_user_role.role_id</code>. 角色ID|文弟友|2021-01-18
     */
    public void setRoleId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user_role.role_id</code>. 角色ID|文弟友|2021-01-18
     */
    public Long getRoleId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>fdk_user2.sys_user_role.modified</code>.
     */
    public void setModified(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>fdk_user2.sys_user_role.modified</code>.
     */
    public LocalDateTime getModified() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, Long, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SysUserRole.SYS_USER_ROLE.ID;
    }

    @Override
    public Field<Long> field2() {
        return SysUserRole.SYS_USER_ROLE.USER_ID;
    }

    @Override
    public Field<Long> field3() {
        return SysUserRole.SYS_USER_ROLE.ROLE_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return SysUserRole.SYS_USER_ROLE.MODIFIED;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUserId();
    }

    @Override
    public Long component3() {
        return getRoleId();
    }

    @Override
    public LocalDateTime component4() {
        return getModified();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUserId();
    }

    @Override
    public Long value3() {
        return getRoleId();
    }

    @Override
    public LocalDateTime value4() {
        return getModified();
    }

    @Override
    public SysUserRoleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SysUserRoleRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public SysUserRoleRecord value3(Long value) {
        setRoleId(value);
        return this;
    }

    @Override
    public SysUserRoleRecord value4(LocalDateTime value) {
        setModified(value);
        return this;
    }

    @Override
    public SysUserRoleRecord values(Long value1, Long value2, Long value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysUserRoleRecord
     */
    public SysUserRoleRecord() {
        super(SysUserRole.SYS_USER_ROLE);
    }

    /**
     * Create a detached, initialised SysUserRoleRecord
     */
    public SysUserRoleRecord(Long id, Long userId, Long roleId, LocalDateTime modified) {
        super(SysUserRole.SYS_USER_ROLE);

        set(0, id);
        set(1, userId);
        set(2, roleId);
        set(3, modified);
    }
}
