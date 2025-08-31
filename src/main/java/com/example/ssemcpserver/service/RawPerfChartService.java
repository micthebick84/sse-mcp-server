package com.example.ssemcpserver.service;

import com.example.ssemcpserver.mapper.RawPerfChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RawPerfChartService {
    
    @Autowired
    private RawPerfChartMapper rawPerfChartMapper;

    /**
     * Get performance chart data for device
     * 
     * @param tableCnt Table count (1, 2, 3)
     * @param date1 Start date (YYYYMMDD format)
     * @param date2 End date (YYYYMMDD format)
     * @param time1 Start time (HHMMSS format)
     * @param time2 End time (HHMMSS format)
     * @param itemType Item type (BPS, PPS, ERR, CRC, COL, DISCARD, NONUNICAST, MULTICAST, BROADCAST, DROP, etc.)
     * @param mngNo Management number
     * @param itemIdx Item index (optional)
     * @param moduleTmplOidSeq Module template OID sequence (optional)
     * @return List of performance chart data
     */
    public List<Map<String, Object>> getPerfChartForDev(Integer tableCnt, String date1, String date2, 
                                                       String time1, String time2, String itemType, 
                                                       String mngNo, String itemIdx, String moduleTmplOidSeq) {
        return rawPerfChartMapper.selectPerfChartForDev(tableCnt, date1, date2, time1, time2, 
                                                      itemType, mngNo, itemIdx, moduleTmplOidSeq);
    }

    /**
     * Get performance chart data for interface
     * 
     * @param tableCnt Table count (1, 2, 3)
     * @param date1 Start date (YYYYMMDD format)
     * @param date2 End date (YYYYMMDD format)
     * @param time1 Start time (HHMMSS format)
     * @param time2 End time (HHMMSS format)
     * @param itemType Item type (BPS, PPS, ERR, CRC, COL, DISCARD, NONUNICAST, MULTICAST, BROADCAST, DROP, etc.)
     * @param mngNo Management number
     * @param itemIdx Item index (optional)
     * @param moduleTmplOidSeq Module template OID sequence (optional)
     * @return List of performance chart data
     */
    public List<Map<String, Object>> getPerfChartForIf(Integer tableCnt, String date1, String date2, 
                                                      String time1, String time2, String itemType, 
                                                      String mngNo, String ifIdx, Integer timeId) {
        return rawPerfChartMapper.selectPerfChartForIf(tableCnt, date1, date2, time1, time2, 
                                                     itemType, mngNo, ifIdx, timeId);
    }

    /**
     * Get raw performance chart data for device
     * 
     * @param tableCnt Table count (1, 2, 3)
     * @param date1 Start date (YYYYMMDD format)
     * @param date2 End date (YYYYMMDD format)
     * @param time1 Start time (HHMMSS format)
     * @param time2 End time (HHMMSS format)
     * @param itemType Item type (BPS, PPS, ERR, CRC, COL, DISCARD, NONUNICAST, MULTICAST, BROADCAST, DROP, etc.)
     * @param mngNo Management number
     * @param itemIdx Item index (optional)
     * @param moduleTmplOidSeq Module template OID sequence (optional)
     * @return List of raw performance chart data
     */
    public List<Map<String, Object>> getRawPerfChartForDev(Integer tableCnt, String date1, String date2, 
                                                          String time1, String time2, String itemType, 
                                                          String mngNo, String itemIdx, String moduleTmplOidSeq) {
        return rawPerfChartMapper.selectRawPerfChartForDev(tableCnt, date1, date2, time1, time2, 
                                                         itemType, mngNo, itemIdx, moduleTmplOidSeq);
    }

    /**
     * Get raw performance chart data for interface
     * 
     * @param tableCnt Table count (1, 2, 3)
     * @param date1 Start date (YYYYMMDD format)
     * @param date2 End date (YYYYMMDD format)
     * @param time1 Start time (HHMMSS format)
     * @param time2 End time (HHMMSS format)
     * @param itemType Item type (BPS, PPS, ERR, CRC, COL, DISCARD, NONUNICAST, MULTICAST, BROADCAST, DROP, etc.)
     * @param mngNo Management number
     * @param ifIdx Interface index
     * @param timeId Time ID (optional)
     * @return List of raw performance chart data for interface
     */
    public List<Map<String, Object>> getRawPerfChartForIf(Integer tableCnt, String date1, String date2, 
                                                         String time1, String time2, String itemType, 
                                                         String mngNo, String ifIdx, Integer timeId) {
        return rawPerfChartMapper.selectRawPerfChartForIf(tableCnt, date1, date2, time1, time2, 
                                                        itemType, mngNo, ifIdx, timeId);
    }
} 