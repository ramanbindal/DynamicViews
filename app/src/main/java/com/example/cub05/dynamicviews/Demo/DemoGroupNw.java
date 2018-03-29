package com.example.cub05.dynamicviews.Demo;

/**
 * Created by cub11 on 3/20/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DemoGroupNw {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("type_cd")
    @Expose
    private String typeCd;
    @SerializedName("group_type_cd")
    @Expose
    private String groupTypeCd;
    @SerializedName("att_id")
    @Expose
    private long attId;
    @SerializedName("seq_num")
    @Expose
    private Integer seqNum;

    @SerializedName("demo_id")
    private long demoId;
    @SerializedName("par_id")
    private long parId;
    @SerializedName("demo_group_items")
    @Expose
    private List<DemoGroupItemNw> demoGroupItems = null;
    @SerializedName("ivg_containers")
    @Expose
    private List<IvgContainerNw> ivgContainers = null;
    @SerializedName("demo_sub_groups")
    private List<DemoGroupNw> demoSubGroups = null;

    /**
     * No args constructor for use in serialization
     */
    public DemoGroupNw() {
    }

    public DemoGroupNw(long id, String displayName, String typeCd, String groupTypeCd, long attId, Integer seqNum, long demoId, long parId, List<DemoGroupItemNw> demoGroupItems, List<IvgContainerNw> ivgContainers, List<DemoGroupNw> demoSubGroups) {
        this.id = id;
        this.displayName = displayName;
        this.typeCd = typeCd;
        this.groupTypeCd = groupTypeCd;
        this.attId = attId;
        this.seqNum = seqNum;
        this.demoId = demoId;
        this.parId = parId;
        this.demoGroupItems = demoGroupItems;
        this.ivgContainers = ivgContainers;
        this.demoSubGroups = demoSubGroups;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getGroupTypeCd() {
        return groupTypeCd;
    }

    public void setGroupTypeCd(String groupTypeCd) {
        this.groupTypeCd = groupTypeCd;
    }

    public long getAttId() {
        return attId;
    }

    public void setAttId(long attId) {
        this.attId = attId;
    }

    public Integer getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Integer seqNum) {
        this.seqNum = seqNum;
    }

    public long getDemoId() {
        return demoId;
    }

    public void setDemoId(long demoId) {
        this.demoId = demoId;
    }

    public List<DemoGroupItemNw> getDemoGroupItems() {
        return demoGroupItems;
    }

    public void setDemoGroupItems(List<DemoGroupItemNw> demoGroupItems) {
        this.demoGroupItems = demoGroupItems;
    }

    public long getParId() {
        return parId;
    }

    public List<IvgContainerNw> getIvgContainers() {
        return ivgContainers;
    }

    public void setIvgContainers(List<IvgContainerNw> ivgContainers) {
        this.ivgContainers = ivgContainers;
    }

    public List<DemoGroupNw> getDemoSubGroups() {
        return demoSubGroups;
    }

    public void setDemoSubGroups(List<DemoGroupNw> demoSubGroups) {
        this.demoSubGroups = demoSubGroups;
    }

}
