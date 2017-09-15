package com.flat.paas.portal.domain;

public class Resource {
    // 资源组ID >>>表字段 : RESOURCES_GROUP_ID
    private String resourcesGroupId;

    // 父资源组ID >>>表字段 : PARENT_RESOURCES_GROUP_ID
    private String parentResourcesGroupId;

    // 组名称 >>>表字段 : GROUP_NAME
    private String groupName;

    // 描述 >>>表字段 : DESCR
    private String descr;

    // 角色ID >>>表字段 : ROLE_ID
    private String roleId;

    // 权限ID >>>表字段 : PERMISSION_ID
    private String permissionId;

    // 级别 >>>表字段 : LEVEL
    private Integer level;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getResourcesGroupId() {
        return resourcesGroupId;
    }

    public void setResourcesGroupId(String resourcesGroupId) {
        this.resourcesGroupId = resourcesGroupId;
    }

    public String getParentResourcesGroupId() {
        return parentResourcesGroupId;
    }

    public void setParentResourcesGroupId(String parentResourcesGroupId) {
        this.parentResourcesGroupId = parentResourcesGroupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}