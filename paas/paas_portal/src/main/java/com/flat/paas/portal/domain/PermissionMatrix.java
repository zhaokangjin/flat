package com.flat.paas.portal.domain;

import java.util.Date;

public class PermissionMatrix extends PermissionMatrixKey {
    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    // 生效时间 >>>表字段 : ENABLE_TIME
    private Date enableTime;

    // 失效时间 >>>表字段 : DISABLE_TIME
    private Date disableTime;

    // 创建时间 >>>表字段 : CREATE_TIME
    private Date createTime;

    // 创建人 >>>表字段 : CREATOR
    private String creator;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}