package com.flat.paas.portal.domain;

public class Style {
    // 样式ID >>>表字段 : SYTLE_ID
    private String sytleId;

    // 样式名称 >>>表字段 : SYTLE_NAME
    private String sytleName;

    // 样式描述 >>>表字段 : SYTLE_DESCR
    private String sytleDescr;

    // 移动应用用户ID >>>表字段 : MOBILEAPP_USER_ID
    private String mobileappUserId;

    // 外部用户ID >>>表字段 : EXTERNAL_USER_ID
    private String externalUserId;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getSytleId() {
        return sytleId;
    }

    public void setSytleId(String sytleId) {
        this.sytleId = sytleId;
    }

    public String getSytleName() {
        return sytleName;
    }

    public void setSytleName(String sytleName) {
        this.sytleName = sytleName;
    }

    public String getSytleDescr() {
        return sytleDescr;
    }

    public void setSytleDescr(String sytleDescr) {
        this.sytleDescr = sytleDescr;
    }

    public String getMobileappUserId() {
        return mobileappUserId;
    }

    public void setMobileappUserId(String mobileappUserId) {
        this.mobileappUserId = mobileappUserId;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}