/*
 * This file is generated by jOOQ.
*/
package com.crm.corecrm.domain.db;


import com.crm.corecrm.domain.db.tables.Chat;
import com.crm.corecrm.domain.db.tables.Customer;
import com.crm.corecrm.domain.db.tables.Message;
import com.crm.corecrm.domain.db.tables.Operator;
import com.crm.corecrm.domain.db.tables.OperatorDialog;
import com.crm.corecrm.domain.db.tables.SchemaVersion;
import com.crm.corecrm.domain.db.tables.records.ChatRecord;
import com.crm.corecrm.domain.db.tables.records.CustomerRecord;
import com.crm.corecrm.domain.db.tables.records.MessageRecord;
import com.crm.corecrm.domain.db.tables.records.OperatorDialogRecord;
import com.crm.corecrm.domain.db.tables.records.OperatorRecord;
import com.crm.corecrm.domain.db.tables.records.SchemaVersionRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ChatRecord, Integer> IDENTITY_CHAT = Identities0.IDENTITY_CHAT;
    public static final Identity<CustomerRecord, Integer> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;
    public static final Identity<MessageRecord, Integer> IDENTITY_MESSAGE = Identities0.IDENTITY_MESSAGE;
    public static final Identity<OperatorRecord, Integer> IDENTITY_OPERATOR = Identities0.IDENTITY_OPERATOR;
    public static final Identity<OperatorDialogRecord, Integer> IDENTITY_OPERATOR_DIALOG = Identities0.IDENTITY_OPERATOR_DIALOG;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ChatRecord> CONSTRAINT_1F = UniqueKeys0.CONSTRAINT_1F;
    public static final UniqueKey<ChatRecord> CONSTRAINT_1F8 = UniqueKeys0.CONSTRAINT_1F8;
    public static final UniqueKey<CustomerRecord> CONSTRAINT_5 = UniqueKeys0.CONSTRAINT_5;
    public static final UniqueKey<CustomerRecord> CONSTRAINT_52 = UniqueKeys0.CONSTRAINT_52;
    public static final UniqueKey<CustomerRecord> CONSTRAINT_52C = UniqueKeys0.CONSTRAINT_52C;
    public static final UniqueKey<MessageRecord> CONSTRAINT_6 = UniqueKeys0.CONSTRAINT_6;
    public static final UniqueKey<OperatorRecord> CONSTRAINT_1 = UniqueKeys0.CONSTRAINT_1;
    public static final UniqueKey<OperatorRecord> CONSTRAINT_10 = UniqueKeys0.CONSTRAINT_10;
    public static final UniqueKey<OperatorDialogRecord> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;
    public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = UniqueKeys0.SCHEMA_VERSION_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<MessageRecord, ChatRecord> CONSTRAINT_63 = ForeignKeys0.CONSTRAINT_63;
    public static final ForeignKey<OperatorDialogRecord, OperatorRecord> CONSTRAINT_27 = ForeignKeys0.CONSTRAINT_27;
    public static final ForeignKey<OperatorDialogRecord, ChatRecord> CONSTRAINT_274 = ForeignKeys0.CONSTRAINT_274;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ChatRecord, Integer> IDENTITY_CHAT = Internal.createIdentity(Chat.CHAT, Chat.CHAT.ID);
        public static Identity<CustomerRecord, Integer> IDENTITY_CUSTOMER = Internal.createIdentity(Customer.CUSTOMER, Customer.CUSTOMER.ID);
        public static Identity<MessageRecord, Integer> IDENTITY_MESSAGE = Internal.createIdentity(Message.MESSAGE, Message.MESSAGE.ID);
        public static Identity<OperatorRecord, Integer> IDENTITY_OPERATOR = Internal.createIdentity(Operator.OPERATOR, Operator.OPERATOR.ID);
        public static Identity<OperatorDialogRecord, Integer> IDENTITY_OPERATOR_DIALOG = Internal.createIdentity(OperatorDialog.OPERATOR_DIALOG, OperatorDialog.OPERATOR_DIALOG.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ChatRecord> CONSTRAINT_1F = Internal.createUniqueKey(Chat.CHAT, "CONSTRAINT_1F", Chat.CHAT.ID);
        public static final UniqueKey<ChatRecord> CONSTRAINT_1F8 = Internal.createUniqueKey(Chat.CHAT, "CONSTRAINT_1F8", Chat.CHAT.TG_CHAT_ID);
        public static final UniqueKey<CustomerRecord> CONSTRAINT_5 = Internal.createUniqueKey(Customer.CUSTOMER, "CONSTRAINT_5", Customer.CUSTOMER.ID);
        public static final UniqueKey<CustomerRecord> CONSTRAINT_52 = Internal.createUniqueKey(Customer.CUSTOMER, "CONSTRAINT_52", Customer.CUSTOMER.TG_ID);
        public static final UniqueKey<CustomerRecord> CONSTRAINT_52C = Internal.createUniqueKey(Customer.CUSTOMER, "CONSTRAINT_52C", Customer.CUSTOMER.FIRSTNAME);
        public static final UniqueKey<MessageRecord> CONSTRAINT_6 = Internal.createUniqueKey(Message.MESSAGE, "CONSTRAINT_6", Message.MESSAGE.ID);
        public static final UniqueKey<OperatorRecord> CONSTRAINT_1 = Internal.createUniqueKey(Operator.OPERATOR, "CONSTRAINT_1", Operator.OPERATOR.ID);
        public static final UniqueKey<OperatorRecord> CONSTRAINT_10 = Internal.createUniqueKey(Operator.OPERATOR, "CONSTRAINT_10", Operator.OPERATOR.LOGIN);
        public static final UniqueKey<OperatorDialogRecord> CONSTRAINT_2 = Internal.createUniqueKey(OperatorDialog.OPERATOR_DIALOG, "CONSTRAINT_2", OperatorDialog.OPERATOR_DIALOG.ID);
        public static final UniqueKey<SchemaVersionRecord> SCHEMA_VERSION_PK = Internal.createUniqueKey(SchemaVersion.SCHEMA_VERSION, "schema_version_pk", SchemaVersion.SCHEMA_VERSION.VERSION);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<MessageRecord, ChatRecord> CONSTRAINT_63 = Internal.createForeignKey(com.crm.corecrm.domain.db.Keys.CONSTRAINT_1F, Message.MESSAGE, "CONSTRAINT_63", Message.MESSAGE.CHAT_ID);
        public static final ForeignKey<OperatorDialogRecord, OperatorRecord> CONSTRAINT_27 = Internal.createForeignKey(com.crm.corecrm.domain.db.Keys.CONSTRAINT_1, OperatorDialog.OPERATOR_DIALOG, "CONSTRAINT_27", OperatorDialog.OPERATOR_DIALOG.SUPPORT_ID);
        public static final ForeignKey<OperatorDialogRecord, ChatRecord> CONSTRAINT_274 = Internal.createForeignKey(com.crm.corecrm.domain.db.Keys.CONSTRAINT_1F, OperatorDialog.OPERATOR_DIALOG, "CONSTRAINT_274", OperatorDialog.OPERATOR_DIALOG.CHAT_ID);
    }
}
