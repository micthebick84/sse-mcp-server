package com.example.ssemcpserver.service;

import com.example.ssemcpserver.mapper.MenuMapper;
import com.example.ssemcpserver.model.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MenuService {
    
    @Autowired
    private MenuMapper menuMapper;
    
    /**
     * 계층적 메뉴 목록 조회
     */
    public List<PageDto> getHierarchicalMenuList(String userId, String siteName, String auth, Integer menuAuthNo) {
        return menuMapper.selectHierarchicalMenuList(userId, siteName, auth, menuAuthNo);
    }
    
    /**
     * 전체 메뉴 목록 조회
     */
    public List<MenuDto> getMenuListAll(String siteName, Integer disableLayout) {
        return menuMapper.selectMenuListAll(siteName, disableLayout);
    }
    
    /**
     * 페이지 그룹 목록 조회
     */
    public List<Map<String, Object>> getPageGroupList(String siteName) {
        return menuMapper.selectPageGroupList(siteName);
    }
    
    /**
     * 페이지 목록 조회
     */
    public List<Map<String, Object>> getPageList(String siteName) {
        return menuMapper.selectPageList(siteName);
    }
    
    /**
     * 레이아웃 메뉴 목록 조회
     */
    public List<LayoutMenuDto> getLayoutMenuList(String siteName) {
        return menuMapper.selectLayoutMenuList(siteName);
    }
    
    /**
     * 레이아웃 메뉴 조건 목록 조회
     */
    public List<LayoutMenuCondDto> getLayoutMenuCondList(String guid) {
        return menuMapper.selectLayoutMenuCondList(guid);
    }
    
    /**
     * 메뉴 권한 존재 여부 확인
     */
    public int getMenuAuthExistCnt(String userId, String guid) {
        return menuMapper.selectMenuAuthExistCnt(userId, guid);
    }
    
    /**
     * 대시보드 메뉴 번호 조회
     */
    public String getDashMenuNo() {
        return menuMapper.selectDashMenuNo();
    }
    
    /**
     * 메뉴 위치 조회
     */
    public Map<String, Object> getMenuLoc(String guid) {
        return menuMapper.selectMenuLoc(guid);
    }
} 