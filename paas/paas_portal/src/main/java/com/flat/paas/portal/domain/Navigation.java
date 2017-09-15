package com.flat.paas.portal.domain;

public class Navigation {
    // 导航ID >>>表字段 : NAVIGATION_ID
    private String navigationId;

    // 父ID >>>表字段 : PARENT_ID
    private String parentId;

    // 导航名称 >>>表字段 : NAVIGATION_NAME
    private String navigationName;

    // 路径 >>>表字段 : PATH
    private String path;

    // 描述 >>>表字段 : DESCR
    private String descr;

    // 菜单ID >>>表字段 : MENU_ID
    private String menuId;

    // 路由ID >>>表字段 : ROUTING_ID
    private String routingId;

    // 删除标记 >>>表字段 : DELETE_FLAG
    private String deleteFlag;

    public String getNavigationId() {
        return navigationId;
    }

    public void setNavigationId(String navigationId) {
        this.navigationId = navigationId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
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