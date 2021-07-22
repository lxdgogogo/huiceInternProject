/*
 * This file is generated by jOOQ.
 */
package com.hc.summer.db.tables;


import com.hc.summer.db.FdkUser;
import com.hc.summer.db.Indexes;
import com.hc.summer.db.Keys;
import com.hc.summer.db.tables.records.SysFunctionRecord;

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
import org.jooq.Row10;
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
public class SysFunction extends TableImpl<SysFunctionRecord> {

    private static final long serialVersionUID = 191314894;

    /**
     * The reference instance of <code>fdk_user.sys_function</code>
     */
    public static final SysFunction SYS_FUNCTION = new SysFunction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysFunctionRecord> getRecordType() {
        return SysFunctionRecord.class;
    }

    /**
     * The column <code>fdk_user.sys_function.id</code>.
     */
    public final TableField<SysFunctionRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>fdk_user.sys_function.parent_id</code>. 父级ID|文弟友|2021-01-18
     */
    public final TableField<SysFunctionRecord, Long> PARENT_ID = createField(DSL.name("parent_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(
            DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "父级ID|文弟友|2021-01-18");

    /**
     * The column <code>fdk_user.sys_function.function_url</code>. 功能地址|文弟友|2021-01-18
     */
    public final TableField<SysFunctionRecord, String> FUNCTION_URL = createField(DSL.name("function_url"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(
            DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "功能地址|文弟友|2021-01-18");

    /**
     * The column <code>fdk_user.sys_function.function_icon</code>. 功能图标|文弟友|2021-01-18
     */
    public final TableField<SysFunctionRecord, String> FUNCTION_ICON = createField(DSL.name("function_icon"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(
            DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "功能图标|文弟友|2021-01-18");

    /**
     * The column <code>fdk_user.sys_function.function_name</code>. 功能名|文弟友|2021-01-18
     */
    public final TableField<SysFunctionRecord, String> FUNCTION_NAME = createField(DSL.name("function_name"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(
            DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "功能名|文弟友|2021-01-18");

    /**
     * The column <code>fdk_user.sys_function.function_level</code>. 功能层级|文弟友|2021-01-18
     */
    public final TableField<SysFunctionRecord, Byte> FUNCTION_LEVEL = createField(DSL.name("function_level"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(
            DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "功能层级|文弟友|2021-01-18");

    /**
     * The column <code>fdk_user.sys_function.sort</code>. 排序字段|文弟友|2021-01-18
     */
    public final TableField<SysFunctionRecord, Byte> SORT = createField(DSL.name("sort"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(
            DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "排序字段|文弟友|2021-01-18");

    /**
     * The column <code>fdk_user.sys_function.remark</code>. 备注|文弟友|2021-01-18
     */
    public final TableField<SysFunctionRecord, String> REMARK = createField(DSL.name("remark"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(
            DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "备注|文弟友|2021-01-18");

    /**
     * The column <code>fdk_user.sys_function.created</code>.
     */
    public final TableField<SysFunctionRecord, LocalDateTime> CREATED = createField(DSL.name("created"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(
            DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>fdk_user.sys_function.modified</code>.
     */
    public final TableField<SysFunctionRecord, LocalDateTime> MODIFIED = createField(DSL.name("modified"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(
            DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>fdk_user.sys_function</code> table reference
     */
    public SysFunction() {
        this(DSL.name("sys_function"), null);
    }

    /**
     * Create an aliased <code>fdk_user.sys_function</code> table reference
     */
    public SysFunction(String alias) {
        this(DSL.name(alias), SYS_FUNCTION);
    }

    /**
     * Create an aliased <code>fdk_user.sys_function</code> table reference
     */
    public SysFunction(Name alias) {
        this(alias, SYS_FUNCTION);
    }

    private SysFunction(Name alias, Table<SysFunctionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysFunction(Name alias, Table<SysFunctionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SysFunction(Table<O> child, ForeignKey<O, SysFunctionRecord> key) {
        super(child, key, SYS_FUNCTION);
    }

    @Override
    public Schema getSchema() {
        return FdkUser.FDK_USER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_FUNCTION_PRIMARY);
    }

    @Override
    public Identity<SysFunctionRecord, Long> getIdentity() {
        return Keys.IDENTITY_SYS_FUNCTION;
    }

    @Override
    public UniqueKey<SysFunctionRecord> getPrimaryKey() {
        return Keys.KEY_SYS_FUNCTION_PRIMARY;
    }

    @Override
    public List<UniqueKey<SysFunctionRecord>> getKeys() {
        return Arrays.<UniqueKey<SysFunctionRecord>>asList(Keys.KEY_SYS_FUNCTION_PRIMARY);
    }

    @Override
    public SysFunction as(String alias) {
        return new SysFunction(DSL.name(alias), this);
    }

    @Override
    public SysFunction as(Name alias) {
        return new SysFunction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysFunction rename(String name) {
        return new SysFunction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysFunction rename(Name name) {
        return new SysFunction(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, String, String, String, Byte, Byte, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
