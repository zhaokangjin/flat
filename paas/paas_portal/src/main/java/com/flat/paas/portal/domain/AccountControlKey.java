package com.flat.paas.portal.domain;

public class AccountControlKey {
    // 应用ID >>>表字段 : APPLICATION_ID
    private String applicationId;

    // 用户ID >>>表字段 : USER_ID
    private String userId;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}