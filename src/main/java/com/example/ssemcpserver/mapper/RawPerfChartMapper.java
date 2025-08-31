package com.example.ssemcpserver.mapper;

import com.example.ssemcpserver.model.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface RawPerfChartMapper {

    List<Map<String, Object>> selectPerfChartForDev(@Param("tableCnt") Integer tableCnt, @Param("date1") String date1, @Param("date2") String date2, @Param("time1") String time1, @Param("time2") String time2, @Param("itemType") String itemType, @Param("mngNo") String mngNo, @Param("itemIdx") String itemIdx, @Param("moduleTmplOidSeq") String moduleTmplOidSeq);

   List<Map<String, Object>> selectPerfChartForIf(@Param("tableCnt") Integer tableCnt, @Param("date1") String date1, @Param("date2") String date2, @Param("time1") String time1, @Param("time2") String time2, @Param("itemType") String itemType, @Param("mngNo") String mngNo, @Param("ifIdx") String ifIdx, @Param("timeId") Integer timeId);

    List<Map<String, Object>> selectRawPerfChartForDev(@Param("tableCnt") Integer tableCnt, @Param("date1") String date1, @Param("date2") String date2, @Param("time1") String time1, @Param("time2") String time2, @Param("itemType") String itemType, @Param("mngNo") String mngNo, @Param("itemIdx") String itemIdx, @Param("moduleTmplOidSeq") String moduleTmplOidSeq);

    List<Map<String, Object>> selectRawPerfChartForIf(@Param("tableCnt") Integer tableCnt, @Param("date1") String date1, @Param("date2") String date2, @Param("time1") String time1, @Param("time2") String time2, @Param("itemType") String itemType, @Param("mngNo") String mngNo, @Param("ifIdx") String ifIdx, @Param("timeId") Integer timeId);

} 