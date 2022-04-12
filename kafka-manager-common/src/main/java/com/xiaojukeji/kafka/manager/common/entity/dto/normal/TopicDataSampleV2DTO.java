package com.xiaojukeji.kafka.manager.common.entity.dto.normal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xiaojukeji.kafka.manager.common.constant.TopicSampleConstant;
import com.xiaojukeji.kafka.manager.common.utils.ValidateUtils;
import io.swagger.annotations.ApiModelProperty;

/**
 * Topic采样
 * @author xinglijie
 * @date 22/4/12
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopicDataSampleV2DTO {
    @ApiModelProperty(value = "分区Id")
    private Integer partitionId;

    @ApiModelProperty(value = "最大采样条数[必须小于100]")
    private Integer maxMsgNum;

    @ApiModelProperty(value = "采样超时时间[必须小于10000]")
    private Integer timeout;

    @ApiModelProperty(value = "是否按照timestamp进行采样，否表示按照offset")
    private Boolean isByTimestamp;

    @ApiModelProperty(value = "采样offset或timestamp")
    private Long timestampOrOffset;

    @ApiModelProperty(value = "是否是集群ID, 默认不是")
    private Boolean isPhysicalClusterId;

    public Integer getPartitionId() {
        return partitionId;
    }

    public void setPartitionId(Integer partitionId) {
        this.partitionId = partitionId;
    }

    public Integer getMaxMsgNum() {
        return maxMsgNum;
    }

    public void setMaxMsgNum(Integer maxMsgNum) {
        this.maxMsgNum = maxMsgNum;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Boolean getByTimestamp() {
        return isByTimestamp;
    }

    public void setByTimestamp(Boolean byTimestamp) {
        isByTimestamp = byTimestamp;
    }

    public Long getTimestampOrOffset() {
        return timestampOrOffset;
    }

    public void setTimestampOrOffset(Long timestampOrOffset) {
        this.timestampOrOffset = timestampOrOffset;
    }


    public Boolean getIsPhysicalClusterId() {
        return isPhysicalClusterId;
    }

    public void setIsPhysicalClusterId(Boolean isPhysicalClusterId) {
        this.isPhysicalClusterId = isPhysicalClusterId;
    }

    @Override
    public String toString() {
        return "TopicDataSampleV2DTO{" +
                "partitionId=" + partitionId +
                ", maxMsgNum=" + maxMsgNum +
                ", timeout=" + timeout +
                ", isByTimestamp=" + isByTimestamp +
                ", timestampOrOffset=" + timestampOrOffset +
                ", isPhysicalClusterId=" + isPhysicalClusterId +
                '}';
    }

    public void adjustConfig() {
        timeout = Math.min(timeout, TopicSampleConstant.MAX_TIMEOUT_UNIT_MS);
        maxMsgNum = Math.min(maxMsgNum, TopicSampleConstant.MAX_MSG_NUM);
        if (ValidateUtils.isNull(isPhysicalClusterId)) {
            isPhysicalClusterId = false;
        }
    }
}