package com.example.ssemcpserver.model.dto;

import java.io.Serializable;

public class IfPerfDto implements Serializable {
    private long mngNo;
    private String grpName;
    private String devName;
    private String devIp;
    private String ifName;
    private String ifAlias;
    private long lineWidth;
    private double curVal;
    private double avgInVal;
    private double avgOutVal;
    private double avgInOutSum;
    private double avgVal;
    private double maxInVal;
    private double maxOutVal;
    private double maxVal;
    private double temp;

    public long getMngNo() {
        return mngNo;
    }

    public void setMngNo(long mngNo) {
        this.mngNo = mngNo;
    }

    public String getGrpName() {
        return grpName;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevIp() {
        return devIp;
    }

    public void setDevIp(String devIp) {
        this.devIp = devIp;
    }

    public String getIfName() {
        return ifName;
    }

    public void setIfName(String ifName) {
        this.ifName = ifName;
    }

    public String getIfAlias() {
        return ifAlias;
    }

    public void setIfAlias(String ifAlias) {
        this.ifAlias = ifAlias;
    }

    public long getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(long lineWidth) {
        this.lineWidth = lineWidth;
    }

    public double getCurVal() {
        return curVal;
    }

    public void setCurVal(double curVal) {
        this.curVal = curVal;
    }

    public double getAvgInVal() {
        return avgInVal;
    }

    public void setAvgInVal(double avgInVal) {
        this.avgInVal = avgInVal;
    }

    public double getAvgOutVal() {
        return avgOutVal;
    }

    public void setAvgOutVal(double avgOutVal) {
        this.avgOutVal = avgOutVal;
    }

    public double getAvgVal() {
        return avgVal;
    }

    public void setAvgVal(double avgVal) {
        this.avgVal = avgVal;
    }

    public double getMaxInVal() {
        return maxInVal;
    }

    public void setMaxInVal(double maxInVal) {
        this.maxInVal = maxInVal;
    }

    public double getMaxOutVal() {
        return maxOutVal;
    }

    public void setMaxOutVal(double maxOutVal) {
        this.maxOutVal = maxOutVal;
    }

    public double getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(double maxVal) {
        this.maxVal = maxVal;
    }

    public double getAvgInOutSum() {
        return avgInOutSum;
    }

    public void setAvgInOutSum(double avgInOutSum) {
        this.avgInOutSum = avgInOutSum;
    }

    public double getTemp() { return temp; }

    public void setTemp(double temp) { this.temp = temp; }
}
