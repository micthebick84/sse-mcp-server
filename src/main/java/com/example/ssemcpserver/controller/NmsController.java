package com.example.ssemcpserver.controller;

import com.example.ssemcpserver.model.dto.DevPerfDto;
import com.example.ssemcpserver.service.NmsService;
import com.example.ssemcpserver.util.common.CamelHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/nms")
public class NmsController {
    
    @Autowired
    private NmsService nmsService;

    /**
     * 회선 사용량 조회
     * 
     * @param dashKey 대시보드 키
     * @param date1 시작 날짜 (YYYYMMDD)
     * @param date2 종료 날짜 (YYYYMMDD)
     * @param time1 시작 시간 (HHMM)
     * @param time2 종료 시간 (HHMM)
     * @return 회선 사용량 데이터
     */
    @GetMapping("/if-perf")
    public ResponseEntity<List<Map<String, Object>>> getIfPerfList(
            @RequestParam String dashKey,
            @RequestParam String date1,
            @RequestParam String date2,
            @RequestParam String time1,
            @RequestParam String time2) {
        
        List<Map<String, Object>> result = nmsService.getIfPerfList(dashKey, date1, date2, time1, time2);
        return ResponseEntity.ok(result);
    }

    /**
     * 회선 IN/OUT TopN 조회
     * 
     * @return 회선 IN/OUT TopN 데이터
     */
    @GetMapping("/if-topn")
    public ResponseEntity<List<Map<String, Object>>> getIfTopNList() {
        List<Map<String, Object>> result = nmsService.getIfTopNList();
        return ResponseEntity.ok(result);
    }

    /**
     * 장비 TEMP TopN 조회
     * 
     * @return 장비 TEMP TopN 데이터
     */
    @GetMapping("/dev-temp-topn")
    public ResponseEntity<List<DevPerfDto>> getDevTempTopList() {
        List<DevPerfDto> result = nmsService.getDevTempTopList();
        return ResponseEntity.ok(result);
    }

    /**
     * 장비 MEMORY TopN 조회
     * 
     * @return 장비 MEMORY TopN 데이터
     */
    @GetMapping("/dev-mem-topn")
    public ResponseEntity<List<DevPerfDto>> getDevMemTopList() {
        List<DevPerfDto> result = nmsService.getDevMemTopList();
        return ResponseEntity.ok(result);
    }

    /**
     * 장비 CPU TopN 조회
     * 
     * @return 장비 CPU TopN 데이터
     */
    @GetMapping("/dev-cpu-topn")
    public ResponseEntity<List<DevPerfDto>> getDevCpuTopList() {
        List<DevPerfDto> result = nmsService.getDevCpuTopList();
        return ResponseEntity.ok(result);
    }

    /**
     * 회선 IN/OUT Top5 조회
     * 
     * @return 회선 IN/OUT Top5 데이터
     */
    @GetMapping("/if-inout-top5")
    public ResponseEntity<List<CamelHashMap>> getIfInOutTop5List() {
        List<CamelHashMap> result = nmsService.getIfInOutTop5List();
        return ResponseEntity.ok(result);
    }

    /**
     * 장비 응답시간 Top5 조회
     * 
     * @return 장비 응답시간 Top5 데이터
     */
    @GetMapping("/resp-top5")
    public ResponseEntity<List<CamelHashMap>> getRespTop5List() {
        List<CamelHashMap> result = nmsService.getRespTop5List();
        return ResponseEntity.ok(result);
    }
}
