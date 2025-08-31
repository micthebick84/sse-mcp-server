package com.example.ssemcpserver.model.dto;

import java.util.Map;
import java.util.List;

public class RawPerfChartDto {
    private Integer tableCnt;
    private String date1;
    private String date2;
    private String time1;
    private String time2;
    private String itemType;
    private String mngNo;
    private String itemIdx;
    private String moduleTmplOidSeq;
    private String ifIdx;
    private Integer timeId;
    private List<Map<String, Object>> chartData;

    // Getters and Setters
    public Integer getTableCnt() {
        return tableCnt;
    }

    public void setTableCnt(Integer tableCnt) {
        this.tableCnt = tableCnt;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getMngNo() {
        return mngNo;
    }

    public void setMngNo(String mngNo) {
        this.mngNo = mngNo;
    }

    public String getItemIdx() {
        return itemIdx;
    }

    public void setItemIdx(String itemIdx) {
        this.itemIdx = itemIdx;
    }

    public String getModuleTmplOidSeq() {
        return moduleTmplOidSeq;
    }

    public void setModuleTmplOidSeq(String moduleTmplOidSeq) {
        this.moduleTmplOidSeq = moduleTmplOidSeq;
    }

    public String getIfIdx() {
        return ifIdx;
    }

    public void setIfIdx(String ifIdx) {
        this.ifIdx = ifIdx;
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }

    public List<Map<String, Object>> getChartData() {
        return chartData;
    }

    public void setChartData(List<Map<String, Object>> chartData) {
        this.chartData = chartData;
    }
} 