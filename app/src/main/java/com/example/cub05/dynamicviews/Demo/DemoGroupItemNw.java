package com.example.cub05.dynamicviews.Demo;

/**
 * Created by cub11 on 3/20/2018.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DemoGroupItemNw {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("type_cd")
    @Expose
    private String typeCd;
    @SerializedName("att_id")
    @Expose
    private long attId;
    @SerializedName("thumbnail_att_id")
    @Expose
    private long thumbnailAttId;
    @SerializedName("att_type_cd")
    @Expose
    private String attTypeCd;
    @SerializedName("seq_num")
    @Expose
    private Integer seqNum;
    @SerializedName("demo_group_id")
    @Expose
    private long demoGroupId;
    @SerializedName("prod_feature_grp_id")
    @Expose
    private long prodFeatureGrpId;
    @SerializedName("prod_feature_group")
    @Expose
    private ProdFeatureGroupNw prodFeatureGroup;

    /**
     * No args constructor for use in serialization
     */
    public DemoGroupItemNw() {
    }

    /**
     * @param prodFeatureGroup
     * @param seqNum
     * @param id
     * @param attTypeCd
     * @param name
     * @param demoGroupId
     * @param displayName
     * @param thumbnailAttId
     * @param prodFeatureGrpId
     * @param attId
     * @param typeCd
     */
    public DemoGroupItemNw(long id, String name, String displayName, String typeCd, long attId, long thumbnailAttId, String attTypeCd, Integer seqNum, long demoGroupId, long prodFeatureGrpId, ProdFeatureGroupNw prodFeatureGroup) {
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
        this.prodFeatureGroup = prodFeatureGroup;
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

    public ProdFeatureGroupNw getProdFeatureGroup() {
        return prodFeatureGroup;
    }

    public void setProdFeatureGroup(ProdFeatureGroupNw prodFeatureGroup) {
        this.prodFeatureGroup = prodFeatureGroup;
    }
}
