package com.example.ssemcpserver.model.dto;

public class TopoAuthGrpDto {
    private String authGrpNo;
    private String grpName;
    private String userId;
    private String userName;
    private String editYn;

    // Getters and Setters
    public String getAuthGrpNo() {
        return authGrpNo;
    }

    public void setAuthGrpNo(String authGrpNo) {
        this.authGrpNo = authGrpNo;
    }

    public String getGrpName() {
        return grpName;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEditYn() {
        return editYn;
    }

    public void setEditYn(String editYn) {
        this.editYn = editYn;
    }
} 