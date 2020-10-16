package com.xuecheng.xc_mall_tiny_01.mbg.model;

import java.io.Serializable;

public class GtidExecuted implements Serializable {
    /**
     * uuid of the source where the transaction was originally executed.
     *
     * @mbggenerated
     */
    private String sourceUuid;

    /**
     * First number of interval.
     *
     * @mbggenerated
     */
    private Long intervalStart;

    /**
     * Last number of interval.
     *
     * @mbggenerated
     */
    private Long intervalEnd;

    private static final long serialVersionUID = 1L;

    public String getSourceUuid() {
        return sourceUuid;
    }

    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
    }

    public Long getIntervalStart() {
        return intervalStart;
    }

    public void setIntervalStart(Long intervalStart) {
        this.intervalStart = intervalStart;
    }

    public Long getIntervalEnd() {
        return intervalEnd;
    }

    public void setIntervalEnd(Long intervalEnd) {
        this.intervalEnd = intervalEnd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sourceUuid=").append(sourceUuid);
        sb.append(", intervalStart=").append(intervalStart);
        sb.append(", intervalEnd=").append(intervalEnd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}