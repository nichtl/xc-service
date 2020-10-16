package com.xuecheng.xc_mall_tiny_01.mbg.model;

import java.io.Serializable;

public class Scenic implements Serializable {
    private String scenicId;

    private String scenicName;

    private Integer scenicNum;

    private String scenicLocation;

    private static final long serialVersionUID = 1L;

    public String getScenicId() {
        return scenicId;
    }

    public void setScenicId(String scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public Integer getScenicNum() {
        return scenicNum;
    }

    public void setScenicNum(Integer scenicNum) {
        this.scenicNum = scenicNum;
    }

    public String getScenicLocation() {
        return scenicLocation;
    }

    public void setScenicLocation(String scenicLocation) {
        this.scenicLocation = scenicLocation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scenicId=").append(scenicId);
        sb.append(", scenicName=").append(scenicName);
        sb.append(", scenicNum=").append(scenicNum);
        sb.append(", scenicLocation=").append(scenicLocation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}