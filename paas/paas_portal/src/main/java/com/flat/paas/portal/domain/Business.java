package com.flat.paas.portal.domain;

public class Business {
    // 表ID >>>表字段 : TABLE_ID
    private String tableId;

    // 表空间 >>>表字段 : TABLE_SPACE
    private String tableSpace;

    // 表名称 >>>表字段 : TABLE_NAME
    private String tableName;

    // 角色ID >>>表字段 : ROLE_ID
    private String roleId;

    // 权限ID >>>表字段 : PERMISSION_ID
    private String permissionId;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTableSpace() {
        return tableSpace;
    }

    public void setTableSpace(String tableSpace) {
        this.tableSpace = tableSpace;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
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

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}