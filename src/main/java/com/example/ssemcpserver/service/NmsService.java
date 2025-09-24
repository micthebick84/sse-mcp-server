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
     * @param authGrpNo 권한 그룹 번호 (optional)
     * @return 회선 IN/OUT TopN 데이터
     */
    public List<Map<String, Object>> getIfTopNList(String authGrpNo) {
        return nmsMapper.selectIfTopNList(authGrpNo);
    }

    /**
     * 장비 TEMP TopN 조회
     * 
     * @param authGrpNo 권한 그룹 번호 (optional)
     * @return 장비 TEMP TopN 데이터
     */
    public List<CamelHashMap> getDevTempTopList(String authGrpNo) {
        return nmsMapper.selectDevTempTopList(authGrpNo);
    }

    /**
     * 장비 MEMORY TopN 조회
     * 
     * @param authGrpNo 권한 그룹 번호 (optional)
     * @return 장비 MEMORY TopN 데이터
     */
    public List<CamelHashMap> getDevMemTopList(String authGrpNo) {
        return nmsMapper.selectDevMemTopList(authGrpNo);
    }

    /**
     * 장비 CPU TopN 조회
     * 
     * @param authGrpNo 권한 그룹 번호 (optional)
     * @return 장비 CPU TopN 데이터
     */
    public List<CamelHashMap> getDevCpuTopList(String authGrpNo) {
        return nmsMapper.selectDevCpuTopList(authGrpNo);
    }

    /**
     * 회선 IN/OUT Top5 조회
     * 
     * @param authGrpNo 권한 그룹 번호 (optional)
     * @return 회선 IN/OUT Top5 데이터
     */
    public List<CamelHashMap> getIfInOutTop5List(String authGrpNo) {
        return nmsMapper.selectIfInOutTop5List(authGrpNo);
    }

    /**
     * 장비 응답시간 Top5 조회
     * 
     * @param authGrpNo 권한 그룹 번호 (optional)
     * @return 장비 응답시간 Top5 데이터
     */
    public List<CamelHashMap> getRespTop5List(String authGrpNo) {
        return nmsMapper.selectRespTop5List(authGrpNo);
    }
}
