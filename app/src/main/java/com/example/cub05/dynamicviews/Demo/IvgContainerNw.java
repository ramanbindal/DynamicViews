package com.example.cub05.dynamicviews.Demo;

/**
 * Created by cub11 on 3/20/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IvgContainerNw {

    private long id;
    private String typeCd;
    private String height;
    private String bgColor;
    private String alpha;
    private long parId;
    private long demoId;
    private List<SectionNw> sections = null;

    /**
     * No args constructor for use in serialization
     */
    public IvgContainerNw() {
    }
    public IvgContainerNw(long id, String typeCd, String height, String bgColor, String alpha, long parId, List<SectionNw> sections) {
        this.id = id;
        this.typeCd = typeCd;
        this.height = height;
        this.bgColor = bgColor;
        this.alpha = alpha;
        this.parId = parId;
        this.sections = sections;
    }

    public IvgContainerNw(long id, String typeCd, String height, String bgColor, String alpha, List<SectionNw> sections, long demoId) {
        this.id = id;
        this.typeCd = typeCd;
        this.height = height;
        this.bgColor = bgColor;
        this.alpha = alpha;
        this.demoId = demoId;
        this.sections = sections;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getAlpha() {
        return alpha;
    }

    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    public long getParId() {
        return parId;
    }

    public void setParId(long parId) {
        this.parId = parId;
    }

    public long getDemoId() {
        return demoId;
    }

    public void setDemoId(long demoId) {
        this.demoId = demoId;
    }

    public List<SectionNw> getSections() {
        return sections;
    }

    public void setSections(List<SectionNw> sections) {
        this.sections = sections;
    }

}
