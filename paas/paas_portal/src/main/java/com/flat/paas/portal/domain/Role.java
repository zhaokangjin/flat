package com.flat.paas.portal.domain;

public class Role {
    // 角色ID >>>表字段 : ROLE_ID
    private String roleId;

    // 角色名称 >>>表字段 : ROLE_NAME
    private String roleName;

    // 描述 >>>表字段 : DESCR
    private String descr;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}