package com.flat.paas.portal.domain;

import java.util.Date;

public class Account {
    // 账户ID >>>表字段 : ACCOUNT_ID
    private String accountId;

    // 用户ID >>>表字段 : USER_ID
    private String userId;

    // 昵称 >>>表字段 : NICKNAME
    private String nickname;

    // 密码 >>>表字段 : PASSWORD
    private String password;

    // 原密码 >>>表字段 : ORIGINAL_PASSWORD
    private String originalPassword;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    // 失效时间 >>>表字段 : DISABLE_TIME
    private Date disableTime;

    // 生效时间 >>>表字段 : ENABLE_TIME
    private Date enableTime;

    // 创建时间 >>>表字段 : CREATE_TIME
    private Date createTime;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginalPassword() {
        return originalPassword;
    }

    public void setOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(Date disableTime) {
        this.disableTime = disableTime;
    }

    public Date getEnableTime() {
        return enableTime;
    }

    public void setEnableTime(Date enableTime) {
        this.enableTime = enableTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}