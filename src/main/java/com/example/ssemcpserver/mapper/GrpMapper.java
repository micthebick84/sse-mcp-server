package com.example.ssemcpserver.mapper;

import com.example.ssemcpserver.model.dto.GrpDto;
import com.example.ssemcpserver.model.dto.AuthGrpDto;
import com.example.ssemcpserver.model.dto.TopoAuthGrpDto;
import com.example.ssemcpserver.model.dto.TopoAuthGrpSubgrpDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface GrpMapper {
    
    /**
     * 기본 그룹 트리 리스트 전체 조회
     * 
     * @return 그룹 트리 리스트
     */
    List<GrpDto> selectDefaultGrpTreeListAll();
    
    /**
     * 기본그룹 권한포함 이벤트 미포함 리스트 전체 조회
     * 
     * @return 그룹 트리 리스트
     */
    List<GrpDto> selectAuthDefaultGrpTreeNotEventList();
    
    /**
     * 기본그룹 리스트 (권한 적용) 조회
     * 
     * @param params 검색 조건 파라미터
     * @return 그룹 트리 리스트
     */
    List<GrpDto> selectAuthDefaultGrpTreeEventList(@Param("params") Map<String, Object> params);
}
