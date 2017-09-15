package com.flat.paas.portal.domain;

public class DomainManager {
    // 域管理ID >>>表字段 : DOMAIN_MANAGE_ID
    private String domainManageId;

    // 父域ID >>>表字段 : PARENT_DOMAIN_ID
    private String parentDomainId;

    // 域编码 >>>表字段 : DOMAIN_CODE
    private String domainCode;

    // 域名称 >>>表字段 : DOMAIN_NAME
    private String domainName;

    // 备注 >>>表字段 : REMARKS
    private String remarks;

    // 角色ID >>>表字段 : ROLE_ID
    private String roleId;

    // 权限ID >>>表字段 : PERMISSION_ID
    private String permissionId;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getDomainManageId() {
        return domainManageId;
    }

    public void setDomainManageId(String domainManageId) {
        this.domainManageId = domainManageId;
    }

    public String getParentDomainId() {
        return parentDomainId;
    }

    public void setParentDomainId(String parentDomainId) {
        this.parentDomainId = parentDomainId;
    }

    public String getDomainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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