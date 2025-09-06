package com.example.ssemcpserver.model.dto;

import java.io.Serializable;

public class DevPerfDto implements Serializable {
    private long mngNo;
    private String grpName;
    private String devName;
    private String devIp;
    private String devKind1;
    private double rate;
    private double curVal;
    private double avgVal;
    private double maxVal;
    private double minVal;
    private String devKind2;
    private int devCnt;
    private int sessCnt;
    private double inVoltage;
    private double outVoltage;
    private int sort;
    private int  evtCnt;
    private double sumInbps;
    private double sumInpps;
    private double sumOutbps;
    private double sumOutpps;
    private double avgInbps1;
    private double avgOutbps1;
    private double maxInbps1;
    private double maxOutbps1;
    private double avgInbps2;
    private double avgOutbps2;
    private double maxInbps2;
    private double maxOutbps2;
    private double avgInbps3;
    private double avgOutbps3;
    private double maxInbps3;
    private double maxOutbps3;
    private String type;
    private String ymdhms;
    private double maxInbps;
    private double minInbps;
    private double avgInbps;
    private double maxOutbps;
    private double minOutbps;
    private double avgOutbps;
    private double maxInpps;
    private double minInpps;
    private double avgInpps;
    private double maxOutpps;
    private double minOutpps;
    private double avgOutpps;
    private double maxInbpsPer;
    private double minInbpsPer;
    private double avgInbpsPer;
    private double maxOutbpsPer;
    private double minOutbpsPer;
    private double avgOutbpsPer;

    private long grpNo;
    private String disDevName;
    private String userDevName;
    private String disDevKind1;
    private String model;
    private String vendor;
    private int chkFlag;

    private String dashKey;
    private double cpu;
    private double mem;
    private double disk;
    private int pEvtLevel;
    private int mEvtLevel;
    private int cEvtLevel;
    private int evtLevel;

    private String apName;
    private double rxByte;
    private double txByte;


    private double avgInVal;
    private double avgOutVal;

    private int cnt;

    private String evtName;

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getEvtName() {
        return evtName;
    }

    public void setEvtName(String evtName) {
        this.evtName = evtName;
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

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }

    public double getRxByte() {
        return rxByte;
    }

    public void setRxByte(double rxByte) {
        this.rxByte = rxByte;
    }

    public double getTxByte() {
        return txByte;
    }

    public void setTxByte(double txByte) {
        this.txByte = txByte;
    }

    public int getEvtLevel() {
        return evtLevel;
    }

    public void setEvtLevel(int evtLevel) {
        this.evtLevel = evtLevel;
    }

    private String devType;

    private String ifName;

    public String getIfName() {
        return ifName;
    }

    public void setIfName(String ifName) {
        this.ifName = ifName;
    }

    public double getAvgInbps1() {
        return avgInbps1;
    }

    public void setAvgInbps1(double avgInbps1) {
        this.avgInbps1 = avgInbps1;
    }

    public double getAvgOutbps1() {
        return avgOutbps1;
    }

    public void setAvgOutbps1(double avgOutbps1) {
        this.avgOutbps1 = avgOutbps1;
    }

    public double getMaxInbps1() {
        return maxInbps1;
    }

    public void setMaxInbps1(double maxInbps1) {
        this.maxInbps1 = maxInbps1;
    }

    public double getMaxOutbps1() {
        return maxOutbps1;
    }

    public void setMaxOutbps1(double maxOutbps1) {
        this.maxOutbps1 = maxOutbps1;
    }

    public double getAvgInbps2() {
        return avgInbps2;
    }

    public void setAvgInbps2(double avgInbps2) {
        this.avgInbps2 = avgInbps2;
    }

    public double getAvgOutbps2() {
        return avgOutbps2;
    }

    public void setAvgOutbps2(double avgOutbps2) {
        this.avgOutbps2 = avgOutbps2;
    }

    public double getMaxInbps2() {
        return maxInbps2;
    }

    public void setMaxInbps2(double maxInbps2) {
        this.maxInbps2 = maxInbps2;
    }

    public double getMaxOutbps2() {
        return maxOutbps2;
    }

    public void setMaxOutbps2(double maxOutbps2) {
        this.maxOutbps2 = maxOutbps2;
    }

    public double getAvgInbps3() {
        return avgInbps3;
    }

    public void setAvgInbps3(double avgInbps3) {
        this.avgInbps3 = avgInbps3;
    }

    public double getAvgOutbps3() {
        return avgOutbps3;
    }

    public void setAvgOutbps3(double avgOutbps3) {
        this.avgOutbps3 = avgOutbps3;
    }

    public double getMaxInbps3() {
        return maxInbps3;
    }

    public void setMaxInbps3(double maxInbps3) {
        this.maxInbps3 = maxInbps3;
    }

    public double getMaxOutbps3() {
        return maxOutbps3;
    }

    public void setMaxOutbps3(double maxOutbps3) {
        this.maxOutbps3 = maxOutbps3;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getEvtCnt() {
        return evtCnt;
    }

    public void setEvtCnt(int evtCnt) {
        this.evtCnt = evtCnt;
    }

    public double getSumInbps() {
        return sumInbps;
    }

    public void setSumInbps(double sumInbps) {
        this.sumInbps = sumInbps;
    }

    public double getSumInpps() {
        return sumInpps;
    }

    public void setSumInpps(double sumInpps) {
        this.sumInpps = sumInpps;
    }

    public double getSumOutbps() {
        return sumOutbps;
    }

    public void setSumOutbps(double sumOutbps) {
        this.sumOutbps = sumOutbps;
    }

    public double getSumOutpps() {
        return sumOutpps;
    }

    public void setSumOutpps(double sumOutpps) {
        this.sumOutpps = sumOutpps;
    }

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

    public String getDevKind1() {
        return devKind1;
    }

    public void setDevKind1(String devKind1) {
        this.devKind1 = devKind1;
    }

    public double getCurVal() {
        return curVal;
    }

    public void setCurVal(double curVal) {
        this.curVal = curVal;
    }

    public double getAvgVal() {
        return avgVal;
    }

    public void setAvgVal(double avgVal) {
        this.avgVal = avgVal;
    }

    public double getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(double maxVal) {
        this.maxVal = maxVal;
    }

    public double getMinVal() {
        return minVal;
    }

    public void setMinVal(double minVal) {
        this.minVal = minVal;
    }

    public String getDevKind2() {
        return devKind2;
    }

    public void setDevKind2(String devKind2) {
        this.devKind2 = devKind2;
    }

    public int getDevCnt() {
        return devCnt;
    }

    public void setDevCnt(int devCnt) {
        this.devCnt = devCnt;
    }

    public double getInVoltage() {
        return inVoltage;
    }

    public void setInVoltage(double inVoltage) {
        this.inVoltage = inVoltage;
    }

    public double getOutVoltage() {
        return outVoltage;
    }

    public void setOutVoltage(double outVoltage) {
        this.outVoltage = outVoltage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYmdhms() {
        return ymdhms;
    }

    public void setYmdhms(String ymdhms) {
        this.ymdhms = ymdhms;
    }

    public double getMaxInbps() {
        return maxInbps;
    }

    public void setMaxInbps(double maxInbps) {
        this.maxInbps = maxInbps;
    }

    public double getMinInbps() {
        return minInbps;
    }

    public void setMinInbps(double minInbps) {
        this.minInbps = minInbps;
    }

    public double getAvgInbps() {
        return avgInbps;
    }

    public void setAvgInbps(double avgInbps) {
        this.avgInbps = avgInbps;
    }

    public double getMaxOutbps() {
        return maxOutbps;
    }

    public void setMaxOutbps(double maxOutbps) {
        this.maxOutbps = maxOutbps;
    }

    public double getMinOutbps() {
        return minOutbps;
    }

    public void setMinOutbps(double minOutbps) {
        this.minOutbps = minOutbps;
    }

    public double getAvgOutbps() {
        return avgOutbps;
    }

    public void setAvgOutbps(double avgOutbps) {
        this.avgOutbps = avgOutbps;
    }

    public double getMaxInpps() {
        return maxInpps;
    }

    public void setMaxInpps(double maxInpps) {
        this.maxInpps = maxInpps;
    }

    public double getMinInpps() {
        return minInpps;
    }

    public void setMinInpps(double minInpps) {
        this.minInpps = minInpps;
    }

    public double getAvgInpps() {
        return avgInpps;
    }

    public void setAvgInpps(double avgInpps) {
        this.avgInpps = avgInpps;
    }

    public double getMaxOutpps() {
        return maxOutpps;
    }

    public void setMaxOutpps(double maxOutpps) {
        this.maxOutpps = maxOutpps;
    }

    public double getMinOutpps() {
        return minOutpps;
    }

    public void setMinOutpps(double minOutpps) {
        this.minOutpps = minOutpps;
    }

    public double getAvgOutpps() {
        return avgOutpps;
    }

    public void setAvgOutpps(double avgOutpps) {
        this.avgOutpps = avgOutpps;
    }

    public double getMaxInbpsPer() {
        return maxInbpsPer;
    }

    public void setMaxInbpsPer(double maxInbpsPer) {
        this.maxInbpsPer = maxInbpsPer;
    }

    public double getMinInbpsPer() {
        return minInbpsPer;
    }

    public void setMinInbpsPer(double minInbpsPer) {
        this.minInbpsPer = minInbpsPer;
    }

    public double getAvgInbpsPer() {
        return avgInbpsPer;
    }

    public void setAvgInbpsPer(double avgInbpsPer) {
        this.avgInbpsPer = avgInbpsPer;
    }

    public double getMaxOutbpsPer() {
        return maxOutbpsPer;
    }

    public void setMaxOutbpsPer(double maxOutbpsPer) {
        this.maxOutbpsPer = maxOutbpsPer;
    }

    public double getMinOutbpsPer() {
        return minOutbpsPer;
    }

    public void setMinOutbpsPer(double minOutbpsPer) {
        this.minOutbpsPer = minOutbpsPer;
    }

    public double getAvgOutbpsPer() {
        return avgOutbpsPer;
    }

    public void setAvgOutbpsPer(double avgOutbpsPer) {
        this.avgOutbpsPer = avgOutbpsPer;
    }

    public long getGrpNo() {
        return grpNo;
    }

    public void setGrpNo(long grpNo) {
        this.grpNo = grpNo;
    }

    public String getDisDevName() {
        return disDevName;
    }

    public void setDisDevName(String disDevName) {
        this.disDevName = disDevName;
    }

    public String getUserDevName() {
        return userDevName;
    }

    public void setUserDevName(String userDevName) {
        this.userDevName = userDevName;
    }

    public String getDisDevKind1() {
        return disDevKind1;
    }

    public void setDisDevKind1(String disDevKind1) {
        this.disDevKind1 = disDevKind1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public int getChkFlag() {
        return chkFlag;
    }

    public void setChkFlag(int chkFlag) {
        this.chkFlag = chkFlag;
    }

    public String getDashKey() {
        return dashKey;
    }

    public void setDashKey(String dashKey) {
        this.dashKey = dashKey;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getMem() {
        return mem;
    }

    public void setMem(double mem) {
        this.mem = mem;
    }

    public double getDisk() {
        return disk;
    }

    public void setDisk(double disk) {
        this.disk = disk;
    }

    public int getpEvtLevel() {
        return pEvtLevel;
    }

    public void setpEvtLevel(int pEvtLevel) {
        this.pEvtLevel = pEvtLevel;
    }

    public int getmEvtLevel() {
        return mEvtLevel;
    }

    public void setmEvtLevel(int mEvtLevel) {
        this.mEvtLevel = mEvtLevel;
    }

    public int getcEvtLevel() {
        return cEvtLevel;
    }

    public void setcEvtLevel(int cEvtLevel) {
        this.cEvtLevel = cEvtLevel;
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getSessCnt() {
        return sessCnt;
    }

    public void setSessCnt(int sessCnt) {
        this.sessCnt = sessCnt;
    }
}
