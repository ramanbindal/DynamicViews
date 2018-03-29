package com.example.cub05.dynamicviews.Demo.DemoDb;

import android.content.ContentValues;

/**
 * Created by cub05 on 3/21/2018.
 */

public class ProdFeatureGroupDb {

    public static final String TABLE = "prod_feature_group_table";

    public static final String ID = "prod_feature_group_id";
    public static final String NAME = "prod_feature_group_name";
    public static final String DISPLAY_NAME = "prod_feature_group_display_name";
    public static final String SEQ_NUM = "prod_feature_group_seq_num";
    public static final String PAR_ID = "prod_feature_group_par_id";
    public static final String CREATED_BY = "created_by";
    public static final String UPDATED_BY = "updated_by";
    public static final String CREATED_AT = "created_at";
    public static final String UPDATED_AT = "updated_at";

    private long id;
    private String name;
    private String displayName;
    private Integer seqNum;
    private long parId;
    private long createdBy;
    private long updatedBy;
    private String createdAt;
    private String updatedAt;

    public ProdFeatureGroupDb(long id, String name, String displayName, Integer seqNum, long parId, long createdBy, long updatedBy, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
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

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public long getParId() {
        return parId;
    }

    public void setParId(long parId) {
        this.parId = parId;
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

        public ProdFeatureGroupDb.Builder id(long id) {
            values.put(ID, id);
            return this;
        }

        public ProdFeatureGroupDb.Builder name(String name) {
            values.put(NAME, name);
            return this;
        }

        public ProdFeatureGroupDb.Builder displayName(String displayName) {
            values.put(DISPLAY_NAME, displayName);
            return this;
        }

        public ProdFeatureGroupDb.Builder seqNum(Integer seqNum) {
            values.put(SEQ_NUM, seqNum);
            return this;
        }

        public ProdFeatureGroupDb.Builder parId(long parId) {
            values.put(PAR_ID, parId);
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
