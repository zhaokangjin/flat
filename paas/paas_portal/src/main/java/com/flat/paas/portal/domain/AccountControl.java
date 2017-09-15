package com.flat.paas.portal.domain;

public class AccountControl extends AccountControlKey {
    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}