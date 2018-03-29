package com.example.cub05.dynamicviews.Demo;

/**
 * Created by cub11 on 3/20/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProdFeatureGroupNw {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("seq_num")
    @Expose
    private Integer seqNum;
    @SerializedName("par_id")
    @Expose
    private long parId;
    @SerializedName("created_by")
    @Expose
    private Integer createdBy;
    @SerializedName("updated_by")
    @Expose
    private Integer updatedBy;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("features")
    @Expose
    private List<FeatureNw> features = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProdFeatureGroupNw() {
    }

    /**
     *
     * @param updatedAt
     * @param seqNum
     * @param id
     * @param createdBy
     * @param createdAt
     * @param name
     * @param features
     * @param displayName
     * @param updatedBy
     * @param parId
     */
    public ProdFeatureGroupNw(long id, String name, String displayName, Integer seqNum, long parId, Integer createdBy, Integer updatedBy, String createdAt, String updatedAt, List<FeatureNw> features) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.seqNum = seqNum;
        this.parId = parId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.features = features;
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

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<FeatureNw> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeatureNw> features) {
        this.features = features;
    }
}