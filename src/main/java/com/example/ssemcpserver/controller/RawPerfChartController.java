package com.example.ssemcpserver.controller;

import com.example.ssemcpserver.service.RawPerfChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/perf-chart")
public class RawPerfChartController {
    
    @Autowired
    private RawPerfChartService rawPerfChartService;

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
     * @return Performance chart data for device
     */
    @GetMapping("/device")
    public ResponseEntity<List<Map<String, Object>>> getPerfChartForDev(
            @RequestParam Integer tableCnt,
            @RequestParam String date1,
            @RequestParam String date2,
            @RequestParam String time1,
            @RequestParam String time2,
            @RequestParam String itemType,
            @RequestParam String mngNo,
            @RequestParam(required = false) String itemIdx,
            @RequestParam(required = false) String moduleTmplOidSeq) {
        
        List<Map<String, Object>> result = rawPerfChartService.getPerfChartForDev(
            tableCnt, date1, date2, time1, time2, itemType, mngNo, itemIdx, moduleTmplOidSeq);
        
        return ResponseEntity.ok(result);
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
     * @return Performance chart data for interface
     */
    @GetMapping("/interface")
    public ResponseEntity<List<Map<String, Object>>> getPerfChartForIf(
            @RequestParam Integer tableCnt,
            @RequestParam String date1,
            @RequestParam String date2,
            @RequestParam String time1,
            @RequestParam String time2,
            @RequestParam String itemType,
            @RequestParam String mngNo,
            @RequestParam String ifIdx,
            @RequestParam(required = false) Integer timeId) {
        
        List<Map<String, Object>> result = rawPerfChartService.getPerfChartForIf(
            tableCnt, date1, date2, time1, time2, itemType, mngNo, ifIdx, timeId);
        
        return ResponseEntity.ok(result);
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
     * @return Raw performance chart data for device
     */
    @GetMapping("/device/raw")
    public ResponseEntity<List<Map<String, Object>>> getRawPerfChartForDev(
            @RequestParam Integer tableCnt,
            @RequestParam String date1,
            @RequestParam String date2,
            @RequestParam String time1,
            @RequestParam String time2,
            @RequestParam String itemType,
            @RequestParam String mngNo,
            @RequestParam(required = false) String itemIdx,
            @RequestParam(required = false) String moduleTmplOidSeq) {
        
        List<Map<String, Object>> result = rawPerfChartService.getRawPerfChartForDev(
            tableCnt, date1, date2, time1, time2, itemType, mngNo, itemIdx, moduleTmplOidSeq);
        
        return ResponseEntity.ok(result);
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
     * @return Raw performance chart data for interface
     */
    @GetMapping("/interface/raw")
    public ResponseEntity<List<Map<String, Object>>> getRawPerfChartForIf(
            @RequestParam Integer tableCnt,
            @RequestParam String date1,
            @RequestParam String date2,
            @RequestParam String time1,
            @RequestParam String time2,
            @RequestParam String itemType,
            @RequestParam String mngNo,
            @RequestParam String ifIdx,
            @RequestParam(required = false) Integer timeId) {
        
        List<Map<String, Object>> result = rawPerfChartService.getRawPerfChartForIf(
            tableCnt, date1, date2, time1, time2, itemType, mngNo, ifIdx, timeId);
        
        return ResponseEntity.ok(result);
    }
} 