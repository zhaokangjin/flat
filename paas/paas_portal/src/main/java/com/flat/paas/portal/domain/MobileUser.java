package com.flat.paas.portal.domain;

import java.util.Date;

public class MobileUser {
    // 移动应用用户ID >>>表字段 : MOBILEAPP_USER_ID
    private String mobileappUserId;

    // 移动应用昵称 >>>表字段 : MOBILEAPP_NICKNAME
    private String mobileappNickname;

    // 资源组ID >>>表字段 : RESOURCES_GROUP_ID
    private String resourcesGroupId;

    // 创建时间 >>>表字段 : CREATE_TIME
    private Date createTime;

    // 移动应用类型 >>>表字段 : MOBILEAPP_TYPE
    private String mobileappType;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    // 生效时间 >>>表字段 : ENABLE_TIME
    private Date enableTime;

    // 失效时间 >>>表字段 : DISABLE_TIME
    private Date disableTime;

    public String getMobileappUserId() {
        return mobileappUserId;
    }

    public void setMobileappUserId(String mobileappUserId) {
        this.mobileappUserId = mobileappUserId;
    }

    public String getMobileappNickname() {
        return mobileappNickname;
    }

    public void setMobileappNickname(String mobileappNickname) {
        this.mobileappNickname = mobileappNickname;
    }

    public String getResourcesGroupId() {
        return resourcesGroupId;
    }

    public void setResourcesGroupId(String resourcesGroupId) {
        this.resourcesGroupId = resourcesGroupId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMobileappType() {
        return mobileappType;
    }

    public void setMobileappType(String mobileappType) {
        this.mobileappType = mobileappType;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    public Date getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(Date disableTime) {
        this.disableTime = disableTime;
    }
}