package com.example.cub05.dynamicviews.Demo;

/**
 * Created by cub11 on 3/20/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemNw {

    private long id;
    private String name;
    private String typeCd;
    private String width;
    private String height;
    private String xCoordinate;
    private String yCoordinate;
    private String alpha;
    private long attId;
    private String descText;
    private String descTextFontName;
    private String descTextFontStyle;
    private String descTextFontSize;
    private String descTextFontColor;
    private Integer seqNum;
    private long demoGroupDtlId;
    private long thumbnailAttId;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemNw() {
    }

    public ItemNw(long id, String name, String typeCd, String width, String height, String xCoordinate, String yCoordinate, String alpha, long attId, String descText, String descTextFontName, String descTextFontStyle, String descTextFontSize, String descTextFontColor, Integer seqNum, long demoGroupDtlId, long thumbnailAttId) {
        this.id = id;
        this.name = name;
        this.typeCd = typeCd;
        this.width = width;
        this.height = height;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.alpha = alpha;
        this.attId = attId;
        this.descText = descText;
        this.descTextFontName = descTextFontName;
        this.descTextFontStyle = descTextFontStyle;
        this.descTextFontSize = descTextFontSize;
        this.descTextFontColor = descTextFontColor;
        this.seqNum = seqNum;
        this.demoGroupDtlId = demoGroupDtlId;
        this.thumbnailAttId = thumbnailAttId;
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

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(String xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public String getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(String yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    public long getAttId() {
        return attId;
    }

    public void setAttId(long attId) {
        this.attId = attId;
    }

    public String getDescText() {
        return descText;
    }

    public void setDescText(String descText) {
        this.descText = descText;
    }

    public String getDescTextFontName() {
        return descTextFontName;
    }

    public void setDescTextFontName(String descTextFontName) {
        this.descTextFontName = descTextFontName;
    }

    public String getDescTextFontStyle() {
        return descTextFontStyle;
    }

    public void setDescTextFontStyle(String descTextFontStyle) {
        this.descTextFontStyle = descTextFontStyle;
    }

    public String getDescTextFontSize() {
        return descTextFontSize;
    }

    public void setDescTextFontSize(String descTextFontSize) {
        this.descTextFontSize = descTextFontSize;
    }

    public String getDescTextFontColor() {
        return descTextFontColor;
    }

    public void setDescTextFontColor(String descTextFontColor) {
        this.descTextFontColor = descTextFontColor;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public long getDemoGroupDtlId() {
        return demoGroupDtlId;
    }

    public void setDemoGroupDtlId(long demoGroupDtlId) {
        this.demoGroupDtlId = demoGroupDtlId;
    }

    public long getThumbnailAttId() {
        return thumbnailAttId;
    }

    public void setThumbnailAttId(long thumbnailAttId) {
        this.thumbnailAttId = thumbnailAttId;
    }
}
