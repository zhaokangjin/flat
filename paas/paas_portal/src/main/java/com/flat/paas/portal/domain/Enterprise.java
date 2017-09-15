package com.flat.paas.portal.domain;

import java.util.Date;

public class Enterprise {
    // 用户ID >>>表字段 : USER_ID
    private String userId;

    // 用户类别 >>>表字段 : USER_CATEGORY
    private String userCategory;

    // 角色ID >>>表字段 : ROLE_ID
    private String roleId;

    // 权限ID >>>表字段 : PERMISSION_ID
    private String permissionId;

    // 资源组ID >>>表字段 : RESOURCES_GROUP_ID
    private String resourcesGroupId;

    // 密码 >>>表字段 : PASSWORD
    private String password;

    // 原密码 >>>表字段 : ORIGINAL_PASSWORD
    private String originalPassword;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    // 创建时间 >>>表字段 : CREATE_TIME
    private Date createTime;

    // 生效时间 >>>表字段 : ENABLE_TIME
    private Date enableTime;

    // 失效时间 >>>表字段 : DISABLE_TIME
    private Date disableTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getResourcesGroupId() {
        return resourcesGroupId;
    }

    public void setResourcesGroupId(String resourcesGroupId) {
        this.resourcesGroupId = resourcesGroupId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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