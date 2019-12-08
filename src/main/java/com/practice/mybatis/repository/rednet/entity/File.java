package com.practice.mybatis.repository.rednet.entity;

import java.util.Date;

public class File {
    private Long resourceId;

    private Long parentId;

    private Long memberId;

    private Long tenantId;

    private Long copierMemberId;

    private String objectpath;

    private String filename;

    private String filetype;

    private String coverObjectpath;

    private String originObjectpath;

    private Byte libraryType;

    private Byte storehouseType;

    private Byte resourceType;

    private Boolean isDir;

    private Boolean isOnShelf;

    private Boolean isOpen;

    private Boolean isShared;

    private Boolean isInRecyclebin;

    private Boolean isCoverCustomed;

    private Byte transcodeState;

    private Byte watermarkState;

    private Byte auditState;

    private Date updateTime;

    private Date createTime;

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getCopierMemberId() {
        return copierMemberId;
    }

    public void setCopierMemberId(Long copierMemberId) {
        this.copierMemberId = copierMemberId;
    }

    public String getObjectpath() {
        return objectpath;
    }

    public void setObjectpath(String objectpath) {
        this.objectpath = objectpath == null ? null : objectpath.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getCoverObjectpath() {
        return coverObjectpath;
    }

    public void setCoverObjectpath(String coverObjectpath) {
        this.coverObjectpath = coverObjectpath == null ? null : coverObjectpath.trim();
    }

    public String getOriginObjectpath() {
        return originObjectpath;
    }

    public void setOriginObjectpath(String originObjectpath) {
        this.originObjectpath = originObjectpath == null ? null : originObjectpath.trim();
    }

    public Byte getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(Byte libraryType) {
        this.libraryType = libraryType;
    }

    public Byte getStorehouseType() {
        return storehouseType;
    }

    public void setStorehouseType(Byte storehouseType) {
        this.storehouseType = storehouseType;
    }

    public Byte getResourceType() {
        return resourceType;
    }

    public void setResourceType(Byte resourceType) {
        this.resourceType = resourceType;
    }

    public Boolean getIsDir() {
        return isDir;
    }

    public void setIsDir(Boolean isDir) {
        this.isDir = isDir;
    }

    public Boolean getIsOnShelf() {
        return isOnShelf;
    }

    public void setIsOnShelf(Boolean isOnShelf) {
        this.isOnShelf = isOnShelf;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getIsShared() {
        return isShared;
    }

    public void setIsShared(Boolean isShared) {
        this.isShared = isShared;
    }

    public Boolean getIsInRecyclebin() {
        return isInRecyclebin;
    }

    public void setIsInRecyclebin(Boolean isInRecyclebin) {
        this.isInRecyclebin = isInRecyclebin;
    }

    public Boolean getIsCoverCustomed() {
        return isCoverCustomed;
    }

    public void setIsCoverCustomed(Boolean isCoverCustomed) {
        this.isCoverCustomed = isCoverCustomed;
    }

    public Byte getTranscodeState() {
        return transcodeState;
    }

    public void setTranscodeState(Byte transcodeState) {
        this.transcodeState = transcodeState;
    }

    public Byte getWatermarkState() {
        return watermarkState;
    }

    public void setWatermarkState(Byte watermarkState) {
        this.watermarkState = watermarkState;
    }

    public Byte getAuditState() {
        return auditState;
    }

    public void setAuditState(Byte auditState) {
        this.auditState = auditState;
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