/*
 * This file is generated by jOOQ.
 */
package com.hc.summer.db.tables.records;


import com.hc.summer.db.tables.SysRoleFunction;

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
public class SysRoleFunctionRecord extends UpdatableRecordImpl<SysRoleFunctionRecord> implements Record4<Long, Long, Long, LocalDateTime> {

    private static final long serialVersionUID = 728365748;

    /**
     * Setter for <code>fdk_user.sys_role_function.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role_function.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>fdk_user.sys_role_function.role_id</code>. 角色ID|文弟友|2021-01-18
     */
    public void setRoleId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role_function.role_id</code>. 角色ID|文弟友|2021-01-18
     */
    public Long getRoleId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>fdk_user.sys_role_function.function_id</code>. 菜单ID|文弟友|2021-01-18
     */
    public void setFunctionId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role_function.function_id</code>. 菜单ID|文弟友|2021-01-18
     */
    public Long getFunctionId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>fdk_user.sys_role_function.modified</code>.
     */
    public void setModified(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>fdk_user.sys_role_function.modified</code>.
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
        return SysRoleFunction.SYS_ROLE_FUNCTION.ID;
    }

    @Override
    public Field<Long> field2() {
        return SysRoleFunction.SYS_ROLE_FUNCTION.ROLE_ID;
    }

    @Override
    public Field<Long> field3() {
        return SysRoleFunction.SYS_ROLE_FUNCTION.FUNCTION_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return SysRoleFunction.SYS_ROLE_FUNCTION.MODIFIED;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getRoleId();
    }

    @Override
    public Long component3() {
        return getFunctionId();
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
        return getRoleId();
    }

    @Override
    public Long value3() {
        return getFunctionId();
    }

    @Override
    public LocalDateTime value4() {
        return getModified();
    }

    @Override
    public SysRoleFunctionRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SysRoleFunctionRecord value2(Long value) {
        setRoleId(value);
        return this;
    }

    @Override
    public SysRoleFunctionRecord value3(Long value) {
        setFunctionId(value);
        return this;
    }

    @Override
    public SysRoleFunctionRecord value4(LocalDateTime value) {
        setModified(value);
        return this;
    }

    @Override
    public SysRoleFunctionRecord values(Long value1, Long value2, Long value3, LocalDateTime value4) {
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
     * Create a detached SysRoleFunctionRecord
     */
    public SysRoleFunctionRecord() {
        super(SysRoleFunction.SYS_ROLE_FUNCTION);
    }

    /**
     * Create a detached, initialised SysRoleFunctionRecord
     */
    public SysRoleFunctionRecord(Long id, Long roleId, Long functionId, LocalDateTime modified) {
        super(SysRoleFunction.SYS_ROLE_FUNCTION);

        set(0, id);
        set(1, roleId);
        set(2, functionId);
        set(3, modified);
    }
}
