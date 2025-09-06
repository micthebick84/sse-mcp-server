package com.example.ssemcpserver.mapper;

import com.example.ssemcpserver.model.dto.DevPerfDto;
import com.example.ssemcpserver.util.common.CamelHashMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface NmsMapper {
    
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
    List<Map<String, Object>> selectIfPerfList(@Param("dashKey") String dashKey,
                                               @Param("date1") String date1,
                                               @Param("date2") String date2,
                                               @Param("time1") String time1,
                                               @Param("time2") String time2);
    
    /**
     * 회선 IN/OUT TopN 조회
     * 
     * @return 회선 IN/OUT TopN 데이터
     */
    List<Map<String, Object>> selectIfTopNList();
    
    /**
     * 장비 TEMP TopN 조회
     * 
     * @return 장비 TEMP TopN 데이터
     */
    List<DevPerfDto> selectDevTempTopList();
    
    /**
     * 장비 MEMORY TopN 조회
     * 
     * @return 장비 MEMORY TopN 데이터
     */
    List<DevPerfDto> selectDevMemTopList();
    
    /**
     * 장비 CPU TopN 조회
     * 
     * @return 장비 CPU TopN 데이터
     */
    List<DevPerfDto> selectDevCpuTopList();
    
    /**
     * 회선 IN/OUT Top5 조회
     * 
     * @return 회선 IN/OUT Top5 데이터
     */
    List<CamelHashMap> selectIfInOutTop5List();
    
    /**
     * 장비 응답시간 Top5 조회
     * 
     * @return 장비 응답시간 Top5 데이터
     */
    List<CamelHashMap> selectRespTop5List();
}
