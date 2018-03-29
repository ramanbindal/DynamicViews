package com.example.cub05.dynamicviews.Demo.DemoDb;

import android.content.ContentValues;

/**
 * Created by cub11 on 3/20/2018.
 */

public class IvgContainerDb {
    public static final String TABLE="ivg_container_table";
    public static final String IVG_ID="ivg_id";
    public static final String IVG_TYPE_CD="ivg_type_cd";
    public static final String IVG_HEIGHT="ivg_height";
    public static final String IVG_BGCOLOR="ivg_bgcolor";
    public static final String IVG_ALPHA="ivg_alpha";
    public static final String IVG_PAR_ID="ivg_par_id";
    public static final String IVG_DEMO_ID="ivg_demo_id";

    private long id;
    private String typeCd;
    private String height;
    private String bgColor;
    private String alpha;
    private long parId;
    private long demoId;

    public IvgContainerDb(long id, String typeCd, String height, String bgColor, String alpha, long parId, long demoId) {
        this.id = id;
        this.typeCd = typeCd;
        this.height = height;
        this.bgColor = bgColor;
        this.alpha = alpha;
        this.parId = parId;
        this.demoId = demoId;
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

    public static final class Builder{
        private final ContentValues values=new ContentValues();
        public Builder id(long id){
            values.put(IVG_ID,id);
            return this;
        }
        public Builder typeCd(String typeCd){
            values.put(IVG_TYPE_CD,typeCd);
            return this;
        }
        public Builder height(String height){
            values.put(IVG_HEIGHT,height);
            return this;
        }
        public Builder bgColor(String bgColor){
            values.put(IVG_BGCOLOR,bgColor);
            return this;
        }
        public Builder alpha(String alpha){
            values.put(IVG_ALPHA,alpha);
            return this;
        }
        public Builder parId(long parId){
            values.put(IVG_PAR_ID,parId);
            return this;
        }
        public Builder demoId(long demoId){
            values.put(IVG_DEMO_ID,demoId);
            return this;
        }
        public ContentValues build(){
            return values;
        }
    }
}
