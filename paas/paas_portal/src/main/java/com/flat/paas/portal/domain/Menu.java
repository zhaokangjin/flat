package com.flat.paas.portal.domain;

public class Menu {
    // 菜单ID >>>表字段 : MENU_ID
    private String menuId;

    // 父菜单ID >>>表字段 : PARENT_MENU_ID
    private String parentMenuId;

    // 菜单名称 >>>表字段 : MENU_NAME
    private String menuName;

    // 终端类别 >>>表字段 : TERMINAL_CATEGORY
    private String terminalCategory;

    // 域管理ID >>>表字段 : DOMAIN_MANAGE_ID
    private String domainManageId;

    // 路由ID >>>表字段 : ROUTING_ID
    private String routingId;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getTerminalCategory() {
        return terminalCategory;
    }

    public void setTerminalCategory(String terminalCategory) {
        this.terminalCategory = terminalCategory;
    }

    public String getDomainManageId() {
        return domainManageId;
    }

    public void setDomainManageId(String domainManageId) {
        this.domainManageId = domainManageId;
    }

    public String getRoutingId() {
        return routingId;
    }

    public void setRoutingId(String routingId) {
        this.routingId = routingId;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}