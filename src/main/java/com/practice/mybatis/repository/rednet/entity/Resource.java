package com.practice.mybatis.repository.rednet.entity;

import java.util.Date;

public class Resource {
    private Long resourceId;

    private Byte rank;

    private String valueTypes;

    private Integer intrinsicHeight;

    private Integer intrinsicWidth;

    private String intrinsicTitle;

    private String intrinsicAuthor;

    private String intrinsicShootPlace;

    private String intrinsicCopyrightDescription;

    private Integer durationLength;

    private String previewObjectpath;

    private String keyframeObjectpath;

    private String constitutiveAudioObjectpath;

    private String audioRippleObjectpath;

    private Date updateTime;

    private Date createTime;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Byte getRank() {
        return rank;
    }

    public void setRank(Byte rank) {
        this.rank = rank;
    }

    public String getValueTypes() {
        return valueTypes;
    }

    public void setValueTypes(String valueTypes) {
        this.valueTypes = valueTypes == null ? null : valueTypes.trim();
    }

    public Integer getIntrinsicHeight() {
        return intrinsicHeight;
    }

    public void setIntrinsicHeight(Integer intrinsicHeight) {
        this.intrinsicHeight = intrinsicHeight;
    }

    public Integer getIntrinsicWidth() {
        return intrinsicWidth;
    }

    public void setIntrinsicWidth(Integer intrinsicWidth) {
        this.intrinsicWidth = intrinsicWidth;
    }

    public String getIntrinsicTitle() {
        return intrinsicTitle;
    }

    public void setIntrinsicTitle(String intrinsicTitle) {
        this.intrinsicTitle = intrinsicTitle == null ? null : intrinsicTitle.trim();
    }

    public String getIntrinsicAuthor() {
        return intrinsicAuthor;
    }

    public void setIntrinsicAuthor(String intrinsicAuthor) {
        this.intrinsicAuthor = intrinsicAuthor == null ? null : intrinsicAuthor.trim();
    }

    public String getIntrinsicShootPlace() {
        return intrinsicShootPlace;
    }

    public void setIntrinsicShootPlace(String intrinsicShootPlace) {
        this.intrinsicShootPlace = intrinsicShootPlace == null ? null : intrinsicShootPlace.trim();
    }

    public String getIntrinsicCopyrightDescription() {
        return intrinsicCopyrightDescription;
    }

    public void setIntrinsicCopyrightDescription(String intrinsicCopyrightDescription) {
        this.intrinsicCopyrightDescription = intrinsicCopyrightDescription == null ? null : intrinsicCopyrightDescription.trim();
    }

    public Integer getDurationLength() {
        return durationLength;
    }

    public void setDurationLength(Integer durationLength) {
        this.durationLength = durationLength;
    }

    public String getPreviewObjectpath() {
        return previewObjectpath;
    }

    public void setPreviewObjectpath(String previewObjectpath) {
        this.previewObjectpath = previewObjectpath == null ? null : previewObjectpath.trim();
    }

    public String getKeyframeObjectpath() {
        return keyframeObjectpath;
    }

    public void setKeyframeObjectpath(String keyframeObjectpath) {
        this.keyframeObjectpath = keyframeObjectpath == null ? null : keyframeObjectpath.trim();
    }

    public String getConstitutiveAudioObjectpath() {
        return constitutiveAudioObjectpath;
    }

    public void setConstitutiveAudioObjectpath(String constitutiveAudioObjectpath) {
        this.constitutiveAudioObjectpath = constitutiveAudioObjectpath == null ? null : constitutiveAudioObjectpath.trim();
    }

    public String getAudioRippleObjectpath() {
        return audioRippleObjectpath;
    }

    public void setAudioRippleObjectpath(String audioRippleObjectpath) {
        this.audioRippleObjectpath = audioRippleObjectpath == null ? null : audioRippleObjectpath.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}