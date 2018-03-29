package com.example.cub05.dynamicviews.Demo.DemoDb;

import android.content.ContentValues;

/**
 * Created by cub11 on 3/21/2018.
 */

public class SectionDb {
    public static final String TABLE="demo_section_table";
    public static final String SECTION_ID="section_id";
    public static final String SECTION_HEIGHT="section_height";
    public static final String SECTION_WIDTH="section_width";
    public static final String SECTION_ALPHA="section_alpha";
    public static final String SECTION_SEQ_NUM="section_seq_num";
    public static final String SECTION_BGCOLOR="section_bg_color";
    public static final String SECTION_CONTAINER_ID="section_container_id";
    public static final String SECTION_DEMO_GROUP_ID="section_demo_group_id";
    private long id;
    private String height;
    private String width;
    private String alpha;
    private Integer seqNum;
    private String bgColor;
    private long containerId;
    private long demoGroupId;

    public SectionDb(long id, String height, String width, String alpha, Integer seqNum, String bgColor, long containerId, long demoGroupId) {
        this.id = id;
        this.height = height;
        this.width = width;
        this.alpha = alpha;
        this.seqNum = seqNum;
        this.bgColor = bgColor;
        this.containerId = containerId;
        this.demoGroupId = demoGroupId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public long getContainerId() {
        return containerId;
    }

    public void setContainerId(long containerId) {
        this.containerId = containerId;
    }

    public long getDemoGroupId() {
        return demoGroupId;
    }

    public void setDemoGroupId(long demoGroupId) {
        this.demoGroupId = demoGroupId;
    }

    public static final class Builder{
        private final ContentValues values=new ContentValues();
        public Builder id(long id){
            values.put(SECTION_ID,id);
            return this;
        }
        public Builder height(String height){
            values.put(SECTION_HEIGHT,height);
            return this;
        }
        public Builder width(String width){
            values.put(SECTION_WIDTH,width);
            return this;
        }
        public Builder alpha(String alpha){
            values.put(SECTION_ALPHA,alpha);
            return this;
        }
        public Builder seqNum(Integer seqNum){
            values.put(SECTION_SEQ_NUM,seqNum);
            return this;
        }
        public Builder bgColor(String bgColor){
            values.put(SECTION_BGCOLOR,bgColor);
            return this;
        }
        public Builder containerId(long containerId){
            values.put(SECTION_CONTAINER_ID,containerId);
            return this;
        }
        public Builder demoGroupId(long demoGroupId){
            values.put(SECTION_DEMO_GROUP_ID,demoGroupId);
            return this;
        }
        public ContentValues build(){
            return values;
        }
    }

}
