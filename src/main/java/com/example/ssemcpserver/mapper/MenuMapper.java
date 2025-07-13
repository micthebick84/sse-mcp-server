package com.example.ssemcpserver.mapper;

import com.example.ssemcpserver.model.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuMapper {
    
    /**
     * 계층적 메뉴 목록 조회
     */
    List<PageDto> selectHierarchicalMenuList(@Param("userId") String userId, 
                                           @Param("siteName") String siteName, 
                                           @Param("auth") String auth, 
                                           @Param("menuAuthNo") Integer menuAuthNo);
    
    /**
     * 전체 메뉴 목록 조회
     */
    List<MenuDto> selectMenuListAll(@Param("siteName") String siteName, 
                                   @Param("disableLayout") Integer disableLayout);
    
    /**
     * 페이지 그룹 목록 조회
     */
    List<Map<String, Object>> selectPageGroupList(@Param("siteName") String siteName);
    
    /**
     * 페이지 목록 조회
     */
    List<Map<String, Object>> selectPageList(@Param("siteName") String siteName);
    
    /**
     * 레이아웃 메뉴 목록 조회
     */
    List<LayoutMenuDto> selectLayoutMenuList(@Param("siteName") String siteName);
    
    /**
     * 레이아웃 메뉴 조건 목록 조회
     */
    List<LayoutMenuCondDto> selectLayoutMenuCondList(@Param("guid") String guid);
    
    /**
     * 메뉴 권한 존재 여부 확인
     */
    int selectMenuAuthExistCnt(@Param("userId") String userId, @Param("guid") String guid);
    
    /**
     * 대시보드 메뉴 번호 조회
     */
    String selectDashMenuNo();
    
    /**
     * 메뉴 위치 조회
     */
    Map<String, Object> selectMenuLoc(@Param("guid") String guid);
} 