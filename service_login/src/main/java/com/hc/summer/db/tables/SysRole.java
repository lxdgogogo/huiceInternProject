/*
 * This file is generated by jOOQ.
 */
package com.hc.summer.db.tables;


import com.hc.summer.db.FdkUser;
import com.hc.summer.db.Indexes;
import com.hc.summer.db.Keys;
import com.hc.summer.db.tables.records.SysRoleRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class SysRole extends TableImpl<SysRoleRecord> {

    private static final long serialVersionUID = 1775267252;

    /**
     * The reference instance of <code>fdk_user.sys_role</code>
     */
    public static final SysRole SYS_ROLE = new SysRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysRoleRecord> getRecordType() {
        return SysRoleRecord.class;
    }

    /**
     * The column <code>fdk_user.sys_role.id</code>.
     */
    public final TableField<SysRoleRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>fdk_user.sys_role.role_name</code>. 角色名|文弟友|2021-01-27
     */
    public final TableField<SysRoleRecord, String> ROLE_NAME = createField(DSL.name("role_name"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "角色名|文弟友|2021-01-27");

    /**
     * The column <code>fdk_user.sys_role.type</code>. 角色类型|@0：发得快账号；@1：代拿账号|文弟友|2021-01-27
     */
    public final TableField<SysRoleRecord, Byte> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(
            DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "角色类型|@0：发得快账号；@1：代拿账号|文弟友|2021-01-27");

    /**
     * The column <code>fdk_user.sys_role.created</code>. 创建时间|文弟友|2021-01-27
     */
    public final TableField<SysRoleRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(
            DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "创建时间|文弟友|2021-01-27");

    /**
     * The column <code>fdk_user.sys_role.modified</code>. 修改时间|文弟友|2021-01-27
     */
    public final TableField<SysRoleRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(
            DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "修改时间|文弟友|2021-01-27");

    /**
     * Create a <code>fdk_user.sys_role</code> table reference
     */
    public SysRole() {
        this(DSL.name("sys_role"), null);
    }

    /**
     * Create an aliased <code>fdk_user.sys_role</code> table reference
     */
    public SysRole(String alias) {
        this(DSL.name(alias), SYS_ROLE);
    }

    /**
     * Create an aliased <code>fdk_user.sys_role</code> table reference
     */
    public SysRole(Name alias) {
        this(alias, SYS_ROLE);
    }

    private SysRole(Name alias, Table<SysRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysRole(Name alias, Table<SysRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SysRole(Table<O> child, ForeignKey<O, SysRoleRecord> key) {
        super(child, key, SYS_ROLE);
    }

    @Override
    public Schema getSchema() {
        return FdkUser.FDK_USER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_ROLE_PRIMARY, Indexes.SYS_ROLE_ROLE_NAME);
    }

    @Override
    public Identity<SysRoleRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_ROLE;
    }

    @Override
    public UniqueKey<SysRoleRecord> getPrimaryKey() {
        return Keys.KEY_SYS_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SysRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<SysRoleRecord>>asList(Keys.KEY_SYS_ROLE_PRIMARY, Keys.KEY_SYS_ROLE_ROLE_NAME);
    }

    @Override
    public SysRole as(String alias) {
        return new SysRole(DSL.name(alias), this);
    }

    @Override
    public SysRole as(Name alias) {
        return new SysRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysRole rename(String name) {
        return new SysRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysRole rename(Name name) {
        return new SysRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}