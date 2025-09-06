package com.example.ssemcpserver.service;

import com.example.ssemcpserver.mapper.NmsMapper;
import com.example.ssemcpserver.model.dto.DevPerfDto;
import com.example.ssemcpserver.util.common.CamelHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NmsService {
    
    @Autowired
    private NmsMapper nmsMapper;

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
    public List<Map<String, Object>> getIfPerfList(String dashKey, String date1, String date2, 
                                                   String time1, String time2) {
        return nmsMapper.selectIfPerfList(dashKey, date1, date2, time1, time2);
    }

    /**
     * 회선 IN/OUT TopN 조회
     * 
     * @return 회선 IN/OUT TopN 데이터
     */
    public List<Map<String, Object>> getIfTopNList() {
        return nmsMapper.selectIfTopNList();
    }

    /**
     * 장비 TEMP TopN 조회
     * 
     * @return 장비 TEMP TopN 데이터
     */
    public List<DevPerfDto> getDevTempTopList() {
        return nmsMapper.selectDevTempTopList();
    }

    /**
     * 장비 MEMORY TopN 조회
     * 
     * @return 장비 MEMORY TopN 데이터
     */
    public List<DevPerfDto> getDevMemTopList() {
        return nmsMapper.selectDevMemTopList();
    }

    /**
     * 장비 CPU TopN 조회
     * 
     * @return 장비 CPU TopN 데이터
     */
    public List<DevPerfDto> getDevCpuTopList() {
        return nmsMapper.selectDevCpuTopList();
    }

    /**
     * 회선 IN/OUT Top5 조회
     * 
     * @return 회선 IN/OUT Top5 데이터
     */
    public List<CamelHashMap> getIfInOutTop5List() {
        return nmsMapper.selectIfInOutTop5List();
    }

    /**
     * 장비 응답시간 Top5 조회
     * 
     * @return 장비 응답시간 Top5 데이터
     */
    public List<CamelHashMap> getRespTop5List() {
        return nmsMapper.selectRespTop5List();
    }
}
