package com.example.cub05.dynamicviews.Demo.DemoDb;

import android.content.ContentValues;

/**
 * Created by cub11 on 3/20/2018.
 */

public class DemoGroupDb {
    public static final String TABLE="demo_group_table";
    public static final String DEMO_GROUP_ID="demo_group_id";
    public static final String DEMO_GROUP_DISPLAY_NAME="demo_group_display_name";
    public static final String DEMO_TYPE_CD="demo_type_cd";
    public static final String DEMO_GROUP_TYPE_CD="demo_group_type_cd";
    public static final String DEMO_GROUP_ATT_ID="demo_group_att_id";
    public static final String DEMO_GROUP_SEQ_NUM="demo_group_seq_num";
    public static final String DEMO_GROUP_PAR_ID="demo_group_par_id";
    public static final String DEMO_ID ="demoid";

    private long id;
    private String displayName;
    private String typeCd;
    private String groupTypeCd;
    private long attId;
    private Integer seqNum;
    private long demoId;
    private long parId;

    public DemoGroupDb(long id, String displayName, String typeCd, String groupTypeCd, long attId, Integer seqNum, long demoId, long parId) {
        this.id = id;
        this.displayName = displayName;
        this.typeCd = typeCd;
        this.groupTypeCd = groupTypeCd;
        this.attId = attId;
        this.seqNum = seqNum;
        this.demoId = demoId;
        this.parId=parId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getGroupTypeCd() {
        return groupTypeCd;
    }

    public void setGroupTypeCd(String groupTypeCd) {
        this.groupTypeCd = groupTypeCd;
    }

    public long getAttId() {
        return attId;
    }

    public void setAttId(long attId) {
        this.attId = attId;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public long getDemoId() {
        return demoId;
    }

    public void setDemoId(long demoId) {
        this.demoId = demoId;
    }

    public long getParId() {
        return parId;
    }

    public void setParId(long parId) {
        this.parId = parId;
    }

    public static final class Builder{
        private final ContentValues values=new ContentValues();
        public Builder id(long id){
            values.put(DEMO_GROUP_ID,id);
            return this;
        }
        public Builder attId(long attId){
            values.put(DEMO_GROUP_ATT_ID,attId);
            return this;
        }
        public Builder demoId(long demoId){
            values.put(DEMO_ID,demoId);
            return this;
        }
        public Builder seqNum(long seqNum){
            values.put(DEMO_GROUP_SEQ_NUM,seqNum);
            return this;
        }

        public Builder displayName(String displayName){
            values.put(DEMO_GROUP_DISPLAY_NAME,displayName);
            return this;
        }

        public Builder typeCd(String typeCd){
            values.put(DEMO_TYPE_CD,typeCd);
            return this;
        }

        public Builder groupTypeCd(String groupTypeCd){
            values.put(DEMO_GROUP_TYPE_CD,groupTypeCd);
            return this;
        }
        public Builder parId(long parId){
            values.put(DEMO_GROUP_PAR_ID,parId);
            return this;
        }

        public ContentValues build(){
            return values;
        }
    }
}
