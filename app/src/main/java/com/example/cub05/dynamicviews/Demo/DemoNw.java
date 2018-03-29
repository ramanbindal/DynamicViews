package com.example.cub05.dynamicviews.Demo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by cub11 on 3/20/2018.
 */


public class DemoNw {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("demo_groups")
    @Expose
    private List<DemoGroupNw> demoGroups = null;
    @SerializedName("ivg_containers")
    @Expose
    private List<IvgContainerNw> ivgContainers = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public DemoNw() {
    }

    /**
     *
     * @param id
     * @param ivgContainers
     * @param demoGroups
     */
    public DemoNw(long id, List<DemoGroupNw> demoGroups, List<IvgContainerNw> ivgContainers) {
        super();
        this.id = id;
        this.demoGroups = demoGroups;
        this.ivgContainers = ivgContainers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<DemoGroupNw> getDemoGroups() {
        return demoGroups;
    }

    public void setDemoGroups(List<DemoGroupNw> demoGroups) {
        this.demoGroups = demoGroups;
    }

    public List<IvgContainerNw> getIvgContainers() {
        return ivgContainers;
    }

    public void setIvgContainers( List<IvgContainerNw> ivgContainers) {
        this.ivgContainers = ivgContainers;
    }

}
