package com.example.cub05.dynamicviews.Demo.DemoDb;

import android.content.ContentValues;

/**
 * Created by cub01 on 3/21/2018.
 */

public class FeatureDb {


    public static final String TABLE = "feature_table";

    public static final String ID = "feature_id";
    public static final String NAME = "feature_name";
    public static final String VALUE = "value";
    public static final String SEQ_NUM = "seq_num";
    public static final String PAR_ID = "par_id";
    public static final String CREATED_BY = "created_by";
    public static final String UPDATED_BY = "updated_by";
    public static final String CREATED_AT = "created_at";
    public static final String UPDATED_AT = "updated_at";

    private long id;
    private String name;
    private String value;
    private long seqNum;
    private long parId;
    private long createdBy;
    private long updatedBy;
    private String createdAt;
    private String updatedAt;

    public FeatureDb(long id, String name, String value, long seqNum, long parId, long createdBy, long updatedBy, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.seqNum = seqNum;
        this.parId = parId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public long getSeqNum() {
        return seqNum;
    }

    public long getParId() {
        return parId;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public long getUpdatedBy() {
        return updatedBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public static final class Builder {
        private final ContentValues values = new ContentValues();

        public Builder id(long id) {
            values.put(ID, id);
            return this;
        }

        public Builder name(String name) {
            values.put(NAME, name);
            return this;
        }

        public Builder value(String value) {
            values.put(VALUE, value);
            return this;
        }

        public Builder parId(long parId) {
            values.put(PAR_ID, parId);
            return this;
        }


        public Builder seqNum(long seqNum) {
            values.put(SEQ_NUM, seqNum);
            return this;
        }
        public Builder createdBy(String createdBy) {
            values.put(CREATED_BY, createdBy);
            return this;
        }

        public Builder updatedBy(String updatedBy) {
            values.put(UPDATED_BY, updatedBy);
            return this;
        }

        public Builder createdAt(String createdAt) {
            values.put(CREATED_AT, createdAt);
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            values.put(UPDATED_AT, updatedAt);
            return this;
        }


        public ContentValues build() {
            return values;
        }
    }

}
