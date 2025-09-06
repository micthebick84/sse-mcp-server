package com.example.ssemcpserver;

import com.example.ssemcpserver.model.dto.DevPerfDto;
import com.example.ssemcpserver.service.NmsService;
import com.example.ssemcpserver.util.common.CamelHashMap;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * NmsTools is a utility class that provides methods for managing NMS (Network Management System) data.
 * It uses the NmsService to perform NMS operations.
 */
@Component
public class NmsTools {
    
    private final NmsService nmsService;

    public NmsTools(NmsService nmsService) {
        this.nmsService = nmsService;
    }

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
    @Tool(description = "Get interface performance data. HTTP: GET /api/nms/if-perf, Parameters: dashKey (String), date1 (String), date2 (String), time1 (String), time2 (String), Response: List<Map<String, Object>> containing interface performance data. Map structure: {ymdhms: String, maxInVal: Double, maxOutVal: Double}")
    public List<Map<String, Object>> getIfPerfList(String dashKey, String date1, String date2, 
                                                   String time1, String time2) {
        return nmsService.getIfPerfList(dashKey, date1, date2, time1, time2);
    }

    /**
     * 회선 IN/OUT TopN 조회
     * 
     * @return 회선 IN/OUT TopN 데이터
     */
    @Tool(description = "Get interface IN/OUT TopN data. HTTP: GET /api/nms/if-topn, Parameters: None, Response: List<Map<String, Object>> containing interface TopN data. Map structure: {DEV_NAME: String, IF_NAME: String, INBPS_RATE: Double, OUTBPS_RATE: Double, BPS_RATE: Double}")
    public List<Map<String, Object>> getIfTopNList() {
        return nmsService.getIfTopNList();
    }

    /**
     * 장비 TEMP TopN 조회
     * 
     * @return 장비 TEMP TopN 데이터
     */
    @Tool(description = "Get device temperature TopN data. HTTP: GET /api/nms/dev-temp-topn, Parameters: None, Response: List<DevPerfDto> containing device temperature TopN data. DevPerfDto structure: {mngNo: String, grpName: String, devName: String, devKind1: String, devIp: String, curVal: Double}")
    public List<DevPerfDto> getDevTempTopList() {
        return nmsService.getDevTempTopList();
    }

    /**
     * 장비 MEMORY TopN 조회
     * 
     * @return 장비 MEMORY TopN 데이터
     */
    @Tool(description = "Get device memory TopN data. HTTP: GET /api/nms/dev-mem-topn, Parameters: None, Response: List<DevPerfDto> containing device memory TopN data. DevPerfDto structure: {mngNo: String, grpName: String, devName: String, devKind1: String, devIp: String, curVal: Double}")
    public List<DevPerfDto> getDevMemTopList() {
        return nmsService.getDevMemTopList();
    }

    /**
     * 장비 CPU TopN 조회
     * 
     * @return 장비 CPU TopN 데이터
     */
    @Tool(description = "Get device CPU TopN data. HTTP: GET /api/nms/dev-cpu-topn, Parameters: None, Response: List<DevPerfDto> containing device CPU TopN data. DevPerfDto structure: {mngNo: String, grpName: String, devName: String, devKind1: String, devIp: String, curVal: Double}")
    public List<DevPerfDto> getDevCpuTopList() {
        return nmsService.getDevCpuTopList();
    }

    /**
     * 회선 IN/OUT Top5 조회
     * 
     * @return 회선 IN/OUT Top5 데이터
     */
    @Tool(description = "Get interface IN/OUT Top5 data. HTTP: GET /api/nms/if-inout-top5, Parameters: None, Response: List<CamelHashMap> containing interface IN/OUT Top5 data. CamelHashMap structure: {devName: String, ifName: String, avgInbps: Double, avgOutbps: Double}")
    public List<CamelHashMap> getIfInOutTop5List() {
        return nmsService.getIfInOutTop5List();
    }

    /**
     * 장비 응답시간 Top5 조회
     * 
     * @return 장비 응답시간 Top5 데이터
     */
    @Tool(description = "Get device response time Top5 data. HTTP: GET /api/nms/resp-top5, Parameters: None, Response: List<CamelHashMap> containing device response time Top5 data. CamelHashMap structure: {rn: Integer, devName: String, respVal: Double}")
    public List<CamelHashMap> getRespTop5List() {
        return nmsService.getRespTop5List();
    }
}
