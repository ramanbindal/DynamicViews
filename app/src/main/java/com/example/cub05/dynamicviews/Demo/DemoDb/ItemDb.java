package com.example.cub05.dynamicviews.Demo.DemoDb;

import android.content.ContentValues;

/**
 * Created by cub01 on 3/21/2018.
 */

public class ItemDb {

    public static final String TABLE = "item_table";

    public static final String ID = "item_id";
    public static final String NAME = "item_name";
    public static final String TYPE_CD = "item_type_cd";
    public static final String WIDTH = "width";
    public static final String HEIGHT = "height";
    public static final String X_COORDINATE = "x_coordinate";
    public static final String Y_COORDINATE = "y_coordinate";
    public static final String ALPHA = "alpha";
    public static final String ATT_ID = "att_id";
    public static final String DESC_TEXT = "desc_text";
    public static final String DESC_TEXT_FONT_NAME = "desc_text_font_name";
    public static final String DESC_TEXT_FONT_STYLE = "desc_text_font_style";
    public static final String DESC_TEXT_FONT_SIZE = "desc_text_font_size";
    public static final String DESC_TEXT_FONT_COLOR = "desc_text_font_color";
    public static final String SEQ_NUM = "seq_num";
    public static final String DEMO_GROUP_DTL_ID = "demo_group_dtl_id";
    public static final String THUMBNAIL_ATT_ID = "thumbnail_att_id";

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
    private long seqNum;
    private long demoGroupDtlId;
    private long thumbnailAttId;

    public ItemDb(long id, String name, String typeCd, String width, String height, String xCoordinate, String yCoordinate, String alpha, long attId, String descText, String descTextFontName, String descTextFontStyle, String descTextFontSize, String descTextFontColor, long seqNum, long demoGroupDtlId, long thumbnailAttId) {
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

    public String getName() {
        return name;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getxCoordinate() {
        return xCoordinate;
    }

    public String getyCoordinate() {
        return yCoordinate;
    }

    public String getAlpha() {
        return alpha;
    }

    public long getAttId() {
        return attId;
    }

    public String getDescText() {
        return descText;
    }

    public String getDescTextFontName() {
        return descTextFontName;
    }

    public String getDescTextFontStyle() {
        return descTextFontStyle;
    }

    public String getDescTextFontSize() {
        return descTextFontSize;
    }

    public String getDescTextFontColor() {
        return descTextFontColor;
    }

    public long getSeqNum() {
        return seqNum;
    }

    public long getDemoGroupDtlId() {
        return demoGroupDtlId;
    }

    public long getThumbnailAttId() {
        return thumbnailAttId;
    }


    public static final class Builder {
        private final ContentValues values = new ContentValues();

        public Builder id(long id) {
            values.put(ID, id);
            return this;
        }

        public Builder name(String name) {
            values.put(NAME, name);
            return this;
        }

        public Builder typeCd(String typeCd) {
            values.put(TYPE_CD, typeCd);
            return this;
        }

        public Builder width(String width) {
            values.put(WIDTH, width);
            return this;
        }

        public Builder height(String height) {
            values.put(HEIGHT, height);
            return this;
        }

        public Builder xCoordinate(String xCoordinate) {
            values.put(X_COORDINATE, xCoordinate);
            return this;
        }

        public Builder yCoordinate(String yCoordinate) {
            values.put(Y_COORDINATE, yCoordinate);
            return this;
        }

        public Builder alpha(String alpha) {
            values.put(ALPHA, alpha);
            return this;
        }

        public Builder descText(String descText) {
            values.put(DESC_TEXT, descText);
            return this;
        }


        public Builder attId(long attId) {
            values.put(ATT_ID, attId);
            return this;
        }

        public Builder seqNum(long seqNum) {
            values.put(SEQ_NUM, seqNum);
            return this;
        }

        public Builder demoGroupDtlId(long demoGroupDtlId) {
            values.put(DEMO_GROUP_DTL_ID, demoGroupDtlId);
            return this;
        }

        public Builder thumbnailAttId(long thumbnailAttId) {
            values.put(THUMBNAIL_ATT_ID, thumbnailAttId);
            return this;
        }

        public Builder descTextFontName(String descTextFontName) {
            values.put(DESC_TEXT_FONT_NAME, descTextFontName);
            return this;
        }

        public Builder descTextFontStyle(String descTextFontStyle) {
            values.put(DESC_TEXT_FONT_STYLE, descTextFontStyle);
            return this;
        }

        public Builder descTextFontSize(String descTextFontSize) {
            values.put(DESC_TEXT_FONT_SIZE, descTextFontSize);
            return this;
        }

        public Builder descTextFontColor(String descTextFontColor) {
            values.put(DESC_TEXT_FONT_COLOR, descTextFontColor);
            return this;
        }


        public ContentValues build() {
            return values;
        }
    }
}
