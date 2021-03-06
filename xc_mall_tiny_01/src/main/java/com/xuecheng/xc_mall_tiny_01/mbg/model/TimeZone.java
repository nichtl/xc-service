package com.xuecheng.xc_mall_tiny_01.mbg.model;

import java.io.Serializable;

public class TimeZone implements Serializable {
    private Integer timeZoneId;

    private String useLeapSeconds;

    private static final long serialVersionUID = 1L;

    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public String getUseLeapSeconds() {
        return useLeapSeconds;
    }

    public void setUseLeapSeconds(String useLeapSeconds) {
        this.useLeapSeconds = useLeapSeconds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", timeZoneId=").append(timeZoneId);
        sb.append(", useLeapSeconds=").append(useLeapSeconds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}