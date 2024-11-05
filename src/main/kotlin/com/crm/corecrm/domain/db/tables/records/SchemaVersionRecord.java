/*
 * This file is generated by jOOQ.
*/
package com.crm.corecrm.domain.db.tables.records;


import com.crm.corecrm.domain.db.tables.SchemaVersion;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class SchemaVersionRecord extends UpdatableRecordImpl<SchemaVersionRecord> implements Record11<Integer, Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> {

    private static final long serialVersionUID = 512162420;

    /**
     * Setter for <code>PUBLIC.schema_version.version_rank</code>.
     */
    public void setVersionRank(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.version_rank</code>.
     */
    public Integer getVersionRank() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.installed_rank</code>.
     */
    public void setInstalledRank(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.installed_rank</code>.
     */
    public Integer getInstalledRank() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.version</code>.
     */
    public void setVersion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.version</code>.
     */
    public String getVersion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.type</code>.
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.type</code>.
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.script</code>.
     */
    public void setScript(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.script</code>.
     */
    public String getScript() {
        return (String) get(5);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.checksum</code>.
     */
    public void setChecksum(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.checksum</code>.
     */
    public Integer getChecksum() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.installed_by</code>.
     */
    public void setInstalledBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.installed_by</code>.
     */
    public String getInstalledBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.installed_on</code>.
     */
    public void setInstalledOn(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.installed_on</code>.
     */
    public Timestamp getInstalledOn() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.execution_time</code>.
     */
    public void setExecutionTime(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.execution_time</code>.
     */
    public Integer getExecutionTime() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>PUBLIC.schema_version.success</code>.
     */
    public void setSuccess(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>PUBLIC.schema_version.success</code>.
     */
    public Boolean getSuccess() {
        return (Boolean) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, String, String, String, Integer, String, Timestamp, Integer, Boolean> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SchemaVersion.SCHEMA_VERSION.VERSION_RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SchemaVersion.SCHEMA_VERSION.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SchemaVersion.SCHEMA_VERSION.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SchemaVersion.SCHEMA_VERSION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SchemaVersion.SCHEMA_VERSION.SCRIPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return SchemaVersion.SCHEMA_VERSION.CHECKSUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SchemaVersion.SCHEMA_VERSION.INSTALLED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return SchemaVersion.SCHEMA_VERSION.INSTALLED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return SchemaVersion.SCHEMA_VERSION.EXECUTION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return SchemaVersion.SCHEMA_VERSION.SUCCESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getVersionRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getInstalledRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getScript();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getChecksum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getInstalledBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getInstalledOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getExecutionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getVersionRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getInstalledRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getScript();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getChecksum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getInstalledBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getInstalledOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getExecutionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getSuccess();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value1(Integer value) {
        setVersionRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value2(Integer value) {
        setInstalledRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value3(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value5(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value6(String value) {
        setScript(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value7(Integer value) {
        setChecksum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value8(String value) {
        setInstalledBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value9(Timestamp value) {
        setInstalledOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value10(Integer value) {
        setExecutionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord value11(Boolean value) {
        setSuccess(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaVersionRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, Integer value7, String value8, Timestamp value9, Integer value10, Boolean value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemaVersionRecord
     */
    public SchemaVersionRecord() {
        super(SchemaVersion.SCHEMA_VERSION);
    }

    /**
     * Create a detached, initialised SchemaVersionRecord
     */
    public SchemaVersionRecord(Integer versionRank, Integer installedRank, String version, String description, String type, String script, Integer checksum, String installedBy, Timestamp installedOn, Integer executionTime, Boolean success) {
        super(SchemaVersion.SCHEMA_VERSION);

        set(0, versionRank);
        set(1, installedRank);
        set(2, version);
        set(3, description);
        set(4, type);
        set(5, script);
        set(6, checksum);
        set(7, installedBy);
        set(8, installedOn);
        set(9, executionTime);
        set(10, success);
    }
}
