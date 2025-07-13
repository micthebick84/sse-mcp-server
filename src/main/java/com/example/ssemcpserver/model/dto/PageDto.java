package com.example.ssemcpserver.model.dto;

import java.util.List;

public class PageDto {
    private String pageNo;
    private String pageName;
    private Integer orderNo;
    private String webIconClass;
    private List<PageGrpDto> children;

    // Getters and Setters
    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getWebIconClass() {
        return webIconClass;
    }

    public void setWebIconClass(String webIconClass) {
        this.webIconClass = webIconClass;
    }

    public List<PageGrpDto> getChildren() {
        return children;
    }

    public void setChildren(List<PageGrpDto> children) {
        this.children = children;
    }
} 