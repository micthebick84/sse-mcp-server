package com.example.ssemcpserver.model.dto;

public class LayoutMenuDto {
    private String menuName;
    private String guid;
    private String grpType;
    private String scondUse;
    private Integer isRegMenu;

    // Getters and Setters
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getGrpType() {
        return grpType;
    }

    public void setGrpType(String grpType) {
        this.grpType = grpType;
    }

    public String getScondUse() {
        return scondUse;
    }

    public void setScondUse(String scondUse) {
        this.scondUse = scondUse;
    }

    public Integer getIsRegMenu() {
        return isRegMenu;
    }

    public void setIsRegMenu(Integer isRegMenu) {
        this.isRegMenu = isRegMenu;
    }
} 