package com.example.ssemcpserver;

import com.example.ssemcpserver.service.RawPerfChartService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * RawPerfChartTools is a utility class that provides methods for managing performance chart data.
 * It uses the RawPerfChartService to perform performance chart operations.
 */
@Component
public class RawPerfChartTools {
    
    private final RawPerfChartService rawPerfChartService;

    public RawPerfChartTools(RawPerfChartService rawPerfChartService) {
        this.rawPerfChartService = rawPerfChartService;
    }

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
     * @return List of performance chart data for device
     */
    @Tool(description = "Get performance chart data for device. HTTP: GET /api/perf-chart/device, Parameters: tableCnt (Integer), date1 (String), date2 (String), time1 (String), time2 (String), itemType (String), mngNo (String), itemIdx (String, optional), moduleTmplOidSeq (String, optional), Response: List<Map<String, Object>> containing performance chart data. Map structure: {YMDHMS: String, DT_YMDHMS: String, RATE: Double, MIN_VAL: Double, MAX_VAL: Double}")
    public List<Map<String, Object>> getPerfChartForDev(Integer tableCnt, String date1, String date2, 
                                                       String time1, String time2, String itemType, 
                                                       String mngNo, String itemIdx, String moduleTmplOidSeq) {
        return rawPerfChartService.getPerfChartForDev(tableCnt, date1, date2, time1, time2, 
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
     * @return List of performance chart data for interface
     */
        @Tool(description = "Get performance chart data for interface. HTTP: GET /api/perf-chart/interface, Parameters: tableCnt (Integer), date1 (String), date2 (String), time1 (String), time2 (String), itemType (String), mngNo (String), ifIdx (String), timeId (Integer, optional), Response: List<Map<String, Object>> containing performance chart data. Map structure: {YMDHMS: String, DT_YMDHMS: String, AVG_IN: Double, AVG_OUT: Double, MAX_IN: Double, MAX_OUT: Double, MIN_IN: Double, MIN_OUT: Double}")
    public List<Map<String, Object>> getPerfChartForIf(Integer tableCnt, String date1, String date2, 
                                                       String time1, String time2, String itemType, 
                                                       String mngNo, String ifIdx, Integer timeId) {
        return rawPerfChartService.getPerfChartForIf(tableCnt, date1, date2, time1, time2, 
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
     * @return List of raw performance chart data for device
     */
    @Tool(description = "Get raw performance chart data for device. HTTP: GET /api/perf-chart/device/raw, Parameters: tableCnt (Integer), date1 (String), date2 (String), time1 (String), time2 (String), itemType (String), mngNo (String), itemIdx (String, optional), moduleTmplOidSeq (String, optional), Response: List<Map<String, Object>> containing raw performance chart data. Map structure: {X: String, RATE: Double, MIN_VAL: Double, MAX_VAL: Double}")
        public List<Map<String, Object>> getRawPerfChartForDev(Integer tableCnt, String date1, String date2, 
                                                           String time1, String time2, String itemType, 
                                                           String mngNo, String itemIdx, String moduleTmplOidSeq) {
        return rawPerfChartService.getRawPerfChartForDev(tableCnt, date1, date2, time1, time2, 
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
    @Tool(description = "Get raw performance chart data for interface. HTTP: GET /api/perf-chart/interface/raw, Parameters: tableCnt (Integer), date1 (String), date2 (String), time1 (String), time2 (String), itemType (String), mngNo (String), ifIdx (String), timeId (Integer, optional), Response: List<Map<String, Object>> containing raw performance chart data. Map structure: {X: String, RATE: Double, MIN_VAL: Double, MAX_VAL: Double}")
    public List<Map<String, Object>> getRawPerfChartForIf(Integer tableCnt, String date1, String date2, 
                                                          String time1, String time2, String itemType, 
                                                          String mngNo, String ifIdx, Integer timeId) {
        return rawPerfChartService.getRawPerfChartForIf(tableCnt, date1, date2, time1, time2, 
                                                     itemType, mngNo, ifIdx, timeId);
    }
} 