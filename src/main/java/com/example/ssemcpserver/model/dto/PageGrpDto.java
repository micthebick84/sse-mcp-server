package com.example.ssemcpserver.model.dto;

import java.util.List;

public class PageGrpDto {
    private String pageNo;
    private String pageGrpNo;
    private String pageGrpName;
    private Integer orderNo;
    private List<MenuDto> children;

    // Getters and Setters
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageGrpNo() {
        return pageGrpNo;
    }

    public void setPageGrpNo(String pageGrpNo) {
        this.pageGrpNo = pageGrpNo;
    }

    public String getPageGrpName() {
        return pageGrpName;
    }

    public void setPageGrpName(String pageGrpName) {
        this.pageGrpName = pageGrpName;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public List<MenuDto> getChildren() {
        return children;
    }

    public void setChildren(List<MenuDto> children) {
        this.children = children;
    }
} 