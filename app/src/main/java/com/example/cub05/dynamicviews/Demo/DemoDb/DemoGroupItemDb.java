package com.example.cub05.dynamicviews.Demo.DemoDb;

import android.content.ContentValues;

/**
 * Created by cub05 on 3/21/2018.
 */

public class DemoGroupItemDb {

    public static final String TABLE = "demo_group_item_table";

    public static final String ID = "demo_group_item_id";
    public static final String NAME = "demo_group_item_name";
    public static final String DISPLAY_NAME = "demo_group_item_display_name";
    public static final String TYPE_CD = "demo_group_item_type_cd";
    public static final String ATT_ID = "demo_group_item_att_id";
    public static final String THUMBNAIL_ATT_ID = "demo_group_item_thumbnail_att_id";
    public static final String ATT_TYPE_CD = "demo_group_item_att_type_cd";
    public static final String SEQ_NUM = "demo_group_item_seq_num";
    public static final String DEMO_GROUP_ID = "demo_group_ID";
    public static final String PROD_FEATURE_GRP_ID = "demo_group_item_prod_feature_grp_id";


    private long id;
    private String name;
    private String displayName;
    private String typeCd;
    private long attId;
    private long thumbnailAttId;
    private String attTypeCd;
    private Integer seqNum;
    private long demoGroupId;
    private long prodFeatureGrpId;

    public DemoGroupItemDb(long id, String name, String displayName, String typeCd, long attId, long thumbnailAttId, String attTypeCd, Integer seqNum, long demoGroupId, long prodFeatureGrpId) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.typeCd = typeCd;
        this.attId = attId;
        this.thumbnailAttId = thumbnailAttId;
        this.attTypeCd = attTypeCd;
        this.seqNum = seqNum;
        this.demoGroupId = demoGroupId;
        this.prodFeatureGrpId = prodFeatureGrpId;
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

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public long getAttId() {
        return attId;
    }

    public void setAttId(long attId) {
        this.attId = attId;
    }

    public long getThumbnailAttId() {
        return thumbnailAttId;
    }

    public void setThumbnailAttId(long thumbnailAttId) {
        this.thumbnailAttId = thumbnailAttId;
    }

    public String getAttTypeCd() {
        return attTypeCd;
    }

    public void setAttTypeCd(String attTypeCd) {
        this.attTypeCd = attTypeCd;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public long getDemoGroupId() {
        return demoGroupId;
    }

    public void setDemoGroupId(long demoGroupId) {
        this.demoGroupId = demoGroupId;
    }

    public long getProdFeatureGrpId() {
        return prodFeatureGrpId;
    }

    public void setProdFeatureGrpId(long prodFeatureGrpId) {
        this.prodFeatureGrpId = prodFeatureGrpId;
    }

    public static final class Builder {

        private final ContentValues values = new ContentValues();

        public DemoGroupItemDb.Builder id(long id) {
            values.put(ID, id);
            return this;
        }

        public DemoGroupItemDb.Builder name(String name) {
            values.put(NAME, name);
            return this;
        }

        public DemoGroupItemDb.Builder displayName(String displayName) {
            values.put(DISPLAY_NAME, displayName);
            return this;
        }

        public DemoGroupItemDb.Builder typeCd(String typeCd) {
            values.put(TYPE_CD, typeCd);
            return this;
        }

        public DemoGroupItemDb.Builder attId(long attId) {
            values.put(ATT_ID, attId);
            return this;
        }

        public DemoGroupItemDb.Builder thumbnailAttId(long thumbnailAttId) {
            values.put(THUMBNAIL_ATT_ID, thumbnailAttId);
            return this;
        }

        public DemoGroupItemDb.Builder attTypeCd(String attTypeCd) {
            values.put(ATT_TYPE_CD, attTypeCd);
            return this;
        }

        public DemoGroupItemDb.Builder seqNum(Integer seqNum) {
            values.put(SEQ_NUM, seqNum);
            return this;
        }

        public DemoGroupItemDb.Builder demoGroupId(long demoGroupId) {
            values.put(DEMO_GROUP_ID, demoGroupId);
            return this;
        }

        public DemoGroupItemDb.Builder prodFeatureGrpId(long prodFeatureGrpId) {
            values.put(PROD_FEATURE_GRP_ID, prodFeatureGrpId);
            return this;
        }

        public ContentValues build() {
            return values;
        }
    }

}
