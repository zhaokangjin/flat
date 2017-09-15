package com.flat.paas.portal.domain;

public class Router {
    // 路由ID >>>表字段 : ROUTING_ID
    private String routingId;

    // URL >>>表字段 : URL
    private String url;

    // 参数 >>>表字段 : PARAM
    private String param;

    // 备注 >>>表字段 : REMARKS
    private String remarks;

    // 域管理ID >>>表字段 : DOMAIN_MANAGE_ID
    private String domainManageId;

    // 角色ID >>>表字段 : ROLE_ID
    private String roleId;

    // 权限ID >>>表字段 : PERMISSION_ID
    private String permissionId;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getRoutingId() {
        return routingId;
    }

    public void setRoutingId(String routingId) {
        this.routingId = routingId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDomainManageId() {
        return domainManageId;
    }

    public void setDomainManageId(String domainManageId) {
        this.domainManageId = domainManageId;
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