package com.example.ssemcpserver.controller;

import com.example.ssemcpserver.service.GrpService;
import com.example.ssemcpserver.model.dto.GrpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/grp")
public class GrpController {
    
    @Autowired
    private GrpService grpService;

    /**
     * 기본 그룹 트리 리스트 전체 조회
     * 
     * @return 그룹 트리 리스트
     */
    @GetMapping("/default-tree")
    public ResponseEntity<List<GrpDto>> getDefaultGrpTreeListAll() {
        List<GrpDto> result = grpService.getDefaultGrpTreeListAll();
        return ResponseEntity.ok(result);
    }

    /**
     * 기본그룹 권한포함 이벤트 미포함 리스트 전체 조회
     * 
     * @return 그룹 트리 리스트
     */
    @GetMapping("/auth-default-tree-not-event")
    public ResponseEntity<List<GrpDto>> getAuthDefaultGrpTreeNotEventList() {
        List<GrpDto> result = grpService.getAuthDefaultGrpTreeNotEventList();
        return ResponseEntity.ok(result);
    }

    /**
     * 기본그룹 리스트 (권한 적용) 조회
     * 
     * @param isContainErr 이벤트 포함 여부
     * @param isContainDev 디바이스 포함 여부
     * @param devKind1List 디바이스 종류1 리스트
     * @param devKind2List 디바이스 종류2 리스트
     * @param isPerfFlag 성능 폴링 플래그
     * @param tmplNo 템플릿 번호
     * @param vendorList 벤더 리스트
     * @param condition 조건 (DAILY_CHECK, COMMAND)
     * @param workerNo 작업자 번호
     * @param devCountGroupView 디바이스 카운트 그룹 뷰
     * @return 그룹 트리 리스트
     */
    @GetMapping("/auth-default-tree-event")
    public ResponseEntity<List<GrpDto>> getAuthDefaultGrpTreeEventList(
            @RequestParam(required = false) String isContainErr,
            @RequestParam(required = false) String isContainDev,
            @RequestParam(required = false) String[] devKind1List,
            @RequestParam(required = false) String[] devKind2List,
            @RequestParam(required = false) Integer isPerfFlag,
            @RequestParam(required = false) Integer tmplNo,
            @RequestParam(required = false) String[] vendorList,
            @RequestParam(required = false) String condition,
            @RequestParam(required = false) String workerNo,
            @RequestParam(required = false) String devCountGroupView) {
        
        List<GrpDto> result = grpService.getAuthDefaultGrpTreeEventList(
            isContainErr, isContainDev, devKind1List, devKind2List,
            isPerfFlag, tmplNo, vendorList, condition, workerNo, devCountGroupView);
        
        return ResponseEntity.ok(result);
    }
} 