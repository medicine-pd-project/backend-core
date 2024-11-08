/*
 * This file is generated by jOOQ.
*/
package com.crm.corecrm.domain.db.tables.records;


import com.crm.corecrm.domain.db.tables.Chat;

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
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ChatRecord extends UpdatableRecordImpl<ChatRecord> implements Record5<Integer, Long, Long, Long, String> {

    private static final long serialVersionUID = 2027229561;

    /**
     * Setter for <code>PUBLIC.CHAT.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.CHAT.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CHAT.TG_CHAT_ID</code>.
     */
    public void setTgChatId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.CHAT.TG_CHAT_ID</code>.
     */
    public Long getTgChatId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CHAT.CREATOR_BY</code>.
     */
    public void setCreatorBy(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.CHAT.CREATOR_BY</code>.
     */
    public Long getCreatorBy() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CHAT.CREATED_AT</code>.
     */
    public void setCreatedAt(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.CHAT.CREATED_AT</code>.
     */
    public Long getCreatedAt() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>PUBLIC.CHAT.STATUS</code>.
     */
    public void setStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.CHAT.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Long, Long, Long, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Long, Long, Long, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Chat.CHAT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Chat.CHAT.TG_CHAT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Chat.CHAT.CREATOR_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Chat.CHAT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Chat.CHAT.STATUS;
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
        return getTgChatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getCreatorBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getStatus();
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
        return getTgChatId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getCreatorBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value2(Long value) {
        setTgChatId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value3(Long value) {
        setCreatorBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value4(Long value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord value5(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ChatRecord values(Integer value1, Long value2, Long value3, Long value4, String value5) {
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
     * Create a detached ChatRecord
     */
    public ChatRecord() {
        super(Chat.CHAT);
    }

    /**
     * Create a detached, initialised ChatRecord
     */
    public ChatRecord(Integer id, Long tgChatId, Long creatorBy, Long createdAt, String status) {
        super(Chat.CHAT);

        set(0, id);
        set(1, tgChatId);
        set(2, creatorBy);
        set(3, createdAt);
        set(4, status);
    }
}
