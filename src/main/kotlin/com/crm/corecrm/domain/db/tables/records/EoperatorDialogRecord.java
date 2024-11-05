/*
 * This file is generated by jOOQ.
*/
package com.crm.corecrm.domain.db.tables.records;


import com.crm.corecrm.domain.db.tables.EoperatorDialog;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EoperatorDialogRecord extends UpdatableRecordImpl<EoperatorDialogRecord> implements Record3<Integer, Long, Long> {

    private static final long serialVersionUID = 629303149;

    /**
     * Setter for <code>PUBLIC.EOPERATOR_DIALOG.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.EOPERATOR_DIALOG.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.EOPERATOR_DIALOG.SUPPORT_ID</code>.
     */
    public void setSupportId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.EOPERATOR_DIALOG.SUPPORT_ID</code>.
     */
    public Long getSupportId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>PUBLIC.EOPERATOR_DIALOG.DIALOG_ID</code>.
     */
    public void setDialogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.EOPERATOR_DIALOG.DIALOG_ID</code>.
     */
    public Long getDialogId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EoperatorDialog.EOPERATOR_DIALOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return EoperatorDialog.EOPERATOR_DIALOG.SUPPORT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return EoperatorDialog.EOPERATOR_DIALOG.DIALOG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getSupportId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getDialogId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getSupportId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getDialogId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EoperatorDialogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EoperatorDialogRecord value2(Long value) {
        setSupportId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EoperatorDialogRecord value3(Long value) {
        setDialogId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EoperatorDialogRecord values(Integer value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EoperatorDialogRecord
     */
    public EoperatorDialogRecord() {
        super(EoperatorDialog.EOPERATOR_DIALOG);
    }

    /**
     * Create a detached, initialised EoperatorDialogRecord
     */
    public EoperatorDialogRecord(Integer id, Long supportId, Long dialogId) {
        super(EoperatorDialog.EOPERATOR_DIALOG);

        set(0, id);
        set(1, supportId);
        set(2, dialogId);
    }
}
