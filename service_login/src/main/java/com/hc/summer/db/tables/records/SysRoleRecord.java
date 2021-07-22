/*
 * This file is generated by jOOQ.
 */
package com.hc.summer.db.tables.records;


import com.hc.summer.db.tables.SysRole;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class SysRoleRecord extends UpdatableRecordImpl<SysRoleRecord> implements Record5<Long, String, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -345417580;

    /**
     * Setter for <code>fdk_user.sys_role.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>fdk_user.sys_role.role_name</code>. 角色名|文弟友|2021-01-27
     */
    public void setRoleName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role.role_name</code>. 角色名|文弟友|2021-01-27
     */
    public String getRoleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>fdk_user.sys_role.type</code>. 角色类型|@0：发得快账号；@1：代拿账号|文弟友|2021-01-27
     */
    public void setType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role.type</code>. 角色类型|@0：发得快账号；@1：代拿账号|文弟友|2021-01-27
     */
    public Byte getType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>fdk_user.sys_role.created</code>. 创建时间|文弟友|2021-01-27
     */
    public void setCreated(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role.created</code>. 创建时间|文弟友|2021-01-27
     */
    public LocalDateTime getCreated() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>fdk_user.sys_role.modified</code>. 修改时间|文弟友|2021-01-27
     */
    public void setModified(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role.modified</code>. 修改时间|文弟友|2021-01-27
     */
    public LocalDateTime getModified() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SysRole.SYS_ROLE.ID;
    }

    @Override
    public Field<String> field2() {
        return SysRole.SYS_ROLE.ROLE_NAME;
    }

    @Override
    public Field<Byte> field3() {
        return SysRole.SYS_ROLE.TYPE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return SysRole.SYS_ROLE.CREATED;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SysRole.SYS_ROLE.MODIFIED;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getRoleName();
    }

    @Override
    public Byte component3() {
        return getType();
    }

    @Override
    public LocalDateTime component4() {
        return getCreated();
    }

    @Override
    public LocalDateTime component5() {
        return getModified();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getRoleName();
    }

    @Override
    public Byte value3() {
        return getType();
    }

    @Override
    public LocalDateTime value4() {
        return getCreated();
    }

    @Override
    public LocalDateTime value5() {
        return getModified();
    }

    @Override
    public SysRoleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SysRoleRecord value2(String value) {
        setRoleName(value);
        return this;
    }

    @Override
    public SysRoleRecord value3(Byte value) {
        setType(value);
        return this;
    }

    @Override
    public SysRoleRecord value4(LocalDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public SysRoleRecord value5(LocalDateTime value) {
        setModified(value);
        return this;
    }

    @Override
    public SysRoleRecord values(Long value1, String value2, Byte value3, LocalDateTime value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SysRoleRecord
     */
    public SysRoleRecord() {
        super(SysRole.SYS_ROLE);
    }

    /**
     * Create a detached, initialised SysRoleRecord
     */
    public SysRoleRecord(Long id, String roleName, Byte type, LocalDateTime created, LocalDateTime modified) {
        super(SysRole.SYS_ROLE);

        set(0, id);
        set(1, roleName);
        set(2, type);
        set(3, created);
        set(4, modified);
    }
}