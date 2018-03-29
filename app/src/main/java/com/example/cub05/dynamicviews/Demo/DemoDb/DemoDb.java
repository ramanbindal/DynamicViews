package com.example.cub05.dynamicviews.Demo.DemoDb;

import android.content.ContentValues;

/**
 * Created by cub11 on 3/20/2018.
 */

public class DemoDb {
    public static final String TABLE="demo_table";
    public static final String DEMO_ID="demo_id";

    private long id;

    public DemoDb(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public static final class Builder{
        private final ContentValues values=new ContentValues();
        public Builder id(long id){
            values.put(DEMO_ID,id);
            return this;
        }
        public ContentValues build(){
            return values;
        }
    }
}
