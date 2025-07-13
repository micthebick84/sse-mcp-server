package com.example.ssemcpserver.controller;

import com.example.ssemcpserver.model.dto.*;
import com.example.ssemcpserver.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    
    @Autowired
    private MenuService menuService;
    
    /**
     * 계층적 메뉴 목록 조회
     */
    @GetMapping("/hierarchical")
    public ResponseEntity<List<PageDto>> getHierarchicalMenuList(
            @RequestParam String userId,
            @RequestParam String siteName,
            @RequestParam String auth,
            @RequestParam(defaultValue = "0") Integer menuAuthNo) {
        
        List<PageDto> menuList = menuService.getHierarchicalMenuList(userId, siteName, auth, menuAuthNo);
        return ResponseEntity.ok(menuList);
    }
    
    /**
     * 전체 메뉴 목록 조회
     */
    @GetMapping("/all")
    public ResponseEntity<List<MenuDto>> getMenuListAll(
            @RequestParam String siteName,
            @RequestParam(defaultValue = "0") Integer disableLayout) {
        
        List<MenuDto> menuList = menuService.getMenuListAll(siteName, disableLayout);
        return ResponseEntity.ok(menuList);
    }
    
    /**
     * 페이지 그룹 목록 조회
     */
    @GetMapping("/page-groups")
    public ResponseEntity<List<Map<String, Object>>> getPageGroupList(@RequestParam String siteName) {
        List<Map<String, Object>> pageGroupList = menuService.getPageGroupList(siteName);
        return ResponseEntity.ok(pageGroupList);
    }
    
    /**
     * 페이지 목록 조회
     */
    @GetMapping("/pages")
    public ResponseEntity<List<Map<String, Object>>> getPageList(@RequestParam String siteName) {
        List<Map<String, Object>> pageList = menuService.getPageList(siteName);
        return ResponseEntity.ok(pageList);
    }
    
    /**
     * 레이아웃 메뉴 목록 조회
     */
    @GetMapping("/layout")
    public ResponseEntity<List<LayoutMenuDto>> getLayoutMenuList(@RequestParam String siteName) {
        List<LayoutMenuDto> layoutMenuList = menuService.getLayoutMenuList(siteName);
        return ResponseEntity.ok(layoutMenuList);
    }
    
    /**
     * 레이아웃 메뉴 조건 목록 조회
     */
    @GetMapping("/layout/conditions")
    public ResponseEntity<List<LayoutMenuCondDto>> getLayoutMenuCondList(@RequestParam String guid) {
        List<LayoutMenuCondDto> layoutMenuCondList = menuService.getLayoutMenuCondList(guid);
        return ResponseEntity.ok(layoutMenuCondList);
    }
    
    /**
     * 메뉴 권한 존재 여부 확인
     */
    @GetMapping("/auth-check")
    public ResponseEntity<Integer> getMenuAuthExistCnt(
            @RequestParam String userId,
            @RequestParam String guid) {
        
        int authExistCnt = menuService.getMenuAuthExistCnt(userId, guid);
        return ResponseEntity.ok(authExistCnt);
    }
    
    /**
     * 대시보드 메뉴 번호 조회
     */
    @GetMapping("/dash-menu-no")
    public ResponseEntity<String> getDashMenuNo() {
        String dashMenuNo = menuService.getDashMenuNo();
        return ResponseEntity.ok(dashMenuNo);
    }
    
    /**
     * 메뉴 위치 조회
     */
    @GetMapping("/location")
    public ResponseEntity<Map<String, Object>> getMenuLoc(@RequestParam String guid) {
        Map<String, Object> menuLoc = menuService.getMenuLoc(guid);
        return ResponseEntity.ok(menuLoc);
    }
} 