package com.example.cub05.dynamicviews.Demo;

/**
 * Created by cub11 on 3/20/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemNw {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type_cd")
    @Expose
    private String typeCd;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("x_coordinate")
    @Expose
    private String xCoordinate;
    @SerializedName("y_coordinate")
    @Expose
    private String yCoordinate;
    @SerializedName("alpha")
    @Expose
    private String alpha;
    @SerializedName("att_id")
    @Expose
    private long attId;
    @SerializedName("desc_text")
    @Expose
    private String descText;
    @SerializedName("desc_text_font_name")
    @Expose
    private String descTextFontName;
    @SerializedName("desc_text_font_style")
    @Expose
    private String descTextFontStyle;
    @SerializedName("desc_text_font_size")
    @Expose
    private String descTextFontSize;
    @SerializedName("desc_text_font_color")
    @Expose
    private String descTextFontColor;
    @SerializedName("seq_num")
    @Expose
    private Integer seqNum;
    @SerializedName("demo_group_dtl_id")
    @Expose
    private long demoGroupDtlId;
    @SerializedName("thumbnail_att_id")
    @Expose
    private long thumbnailAttId;

    /**
     * No args constructor for use in serialization
     *
     */
    public ItemNw() {
    }

    /**
     *
     * @param demoGroupDtlId
     * @param seqNum
     * @param descTextFontColor
     * @param width
     * @param thumbnailAttId
     * @param attId
     * @param id
     * @param yCoordinate
     * @param height
     * @param descText
     * @param name
     * @param alpha
     * @param descTextFontSize
     * @param descTextFontStyle
     * @param descTextFontName
     * @param typeCd
     * @param xCoordinate
     */
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
