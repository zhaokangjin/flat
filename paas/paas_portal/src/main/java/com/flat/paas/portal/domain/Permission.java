package com.flat.paas.portal.domain;

public class Permission {
    // 权限ID >>>表字段 : PERMISSION_ID
    private String permissionId;

    // 权限名称 >>>表字段 : PERMISSION_NAME
    private String permissionName;

    // 描述 >>>表字段 : DESCR
    private String descr;

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}