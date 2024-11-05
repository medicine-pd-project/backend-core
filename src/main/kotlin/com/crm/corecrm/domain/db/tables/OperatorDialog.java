/*
 * This file is generated by jOOQ.
*/
package com.crm.corecrm.domain.db.tables;


import com.crm.corecrm.domain.db.Indexes;
import com.crm.corecrm.domain.db.Keys;
import com.crm.corecrm.domain.db.Public;
import com.crm.corecrm.domain.db.tables.records.OperatorDialogRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
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
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OperatorDialog extends TableImpl<OperatorDialogRecord> {

    private static final long serialVersionUID = -837043977;

    /**
     * The reference instance of <code>PUBLIC.OPERATOR_DIALOG</code>
     */
    public static final OperatorDialog OPERATOR_DIALOG = new OperatorDialog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OperatorDialogRecord> getRecordType() {
        return OperatorDialogRecord.class;
    }

    /**
     * The column <code>PUBLIC.OPERATOR_DIALOG.ID</code>.
     */
    public final TableField<OperatorDialogRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.OPERATOR_DIALOG.SUPPORT_ID</code>.
     */
    public final TableField<OperatorDialogRecord, Long> SUPPORT_ID = createField("SUPPORT_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>PUBLIC.OPERATOR_DIALOG.DIALOG_ID</code>.
     */
    public final TableField<OperatorDialogRecord, Long> DIALOG_ID = createField("DIALOG_ID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>PUBLIC.OPERATOR_DIALOG</code> table reference
     */
    public OperatorDialog() {
        this(DSL.name("OPERATOR_DIALOG"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.OPERATOR_DIALOG</code> table reference
     */
    public OperatorDialog(String alias) {
        this(DSL.name(alias), OPERATOR_DIALOG);
    }

    /**
     * Create an aliased <code>PUBLIC.OPERATOR_DIALOG</code> table reference
     */
    public OperatorDialog(Name alias) {
        this(alias, OPERATOR_DIALOG);
    }

    private OperatorDialog(Name alias, Table<OperatorDialogRecord> aliased) {
        this(alias, aliased, null);
    }

    private OperatorDialog(Name alias, Table<OperatorDialogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_2, Indexes.CONSTRAINT_INDEX_27, Indexes.PRIMARY_KEY_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OperatorDialogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OPERATOR_DIALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OperatorDialogRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OperatorDialogRecord>> getKeys() {
        return Arrays.<UniqueKey<OperatorDialogRecord>>asList(Keys.CONSTRAINT_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<OperatorDialogRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OperatorDialogRecord, ?>>asList(Keys.CONSTRAINT_27, Keys.CONSTRAINT_274);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorDialog as(String alias) {
        return new OperatorDialog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OperatorDialog as(Name alias) {
        return new OperatorDialog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OperatorDialog rename(String name) {
        return new OperatorDialog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OperatorDialog rename(Name name) {
        return new OperatorDialog(name, null);
    }
}
