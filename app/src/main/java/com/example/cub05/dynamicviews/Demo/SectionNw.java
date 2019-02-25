package com.example.cub05.dynamicviews.Demo;

/**
 * Created by cub11 on 3/20/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SectionNw {

    private long id;
    private String height;
    private String width;
    private String alpha;
    private Integer seqNum;
    private String bgColor;
    private long containerId;
    private long demoGroupId;
    private List<ItemNw> items = null;

    /**
     * No args constructor for use in serialization
     */
    public SectionNw() {
    }

    public SectionNw(long id, String height, String width, String alpha, Integer seqNum, String bgColor, long containerId, long demoGroupId, List<ItemNw> items) {
        this.id = id;
        this.height = height;
        this.width = width;
        this.alpha = alpha;
        this.seqNum = seqNum;
        this.bgColor = bgColor;
        this.containerId = containerId;
        this.demoGroupId = demoGroupId;
        this.items = items;
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

    public List<ItemNw> getItems() {
        return items;
    }

    public void setItems(List<ItemNw> items) {
        this.items = items;
    }
}
