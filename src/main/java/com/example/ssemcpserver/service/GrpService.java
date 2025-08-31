package com.example.ssemcpserver.service;

import com.example.ssemcpserver.mapper.GrpMapper;
import com.example.ssemcpserver.model.dto.GrpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GrpService {
    
    @Autowired
    private GrpMapper grpMapper;

    /**
     * 기본 그룹 트리 리스트 전체 조회
     * 
     * @return 그룹 트리 리스트
     */
    public List<GrpDto> getDefaultGrpTreeListAll() {
        return grpMapper.selectDefaultGrpTreeListAll();
    }

    /**
     * 기본그룹 권한포함 이벤트 미포함 리스트 전체 조회
     * 
     * @return 그룹 트리 리스트
     */
    public List<GrpDto> getAuthDefaultGrpTreeNotEventList() {
        return grpMapper.selectAuthDefaultGrpTreeNotEventList();
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
    public List<GrpDto> getAuthDefaultGrpTreeEventList(String isContainErr, String isContainDev,
                                                       String[] devKind1List, String[] devKind2List,
                                                       Integer isPerfFlag, Integer tmplNo,
                                                       String[] vendorList, String condition,
                                                       String workerNo, String devCountGroupView) {
        
        Map<String, Object> params = Map.of(
            "isContainErr", isContainErr != null ? isContainErr : "false",
            "isContainDev", isContainDev != null ? isContainDev : "false",
            "devKind1List", devKind1List != null ? devKind1List : new String[0],
            "devKind2List", devKind2List != null ? devKind2List : new String[0],
            "isPerfFlag", isPerfFlag != null ? isPerfFlag : 0,
            "tmplNo", tmplNo != null ? tmplNo : -1,
            "vendorList", vendorList != null ? vendorList : new String[0],
            "condition", condition != null ? condition : "",
            "workerNo", workerNo != null ? workerNo : "",
            "devCountGroupView", devCountGroupView != null ? devCountGroupView : "SHOW"
        );
        
        return grpMapper.selectAuthDefaultGrpTreeEventList(params);
    }
} 