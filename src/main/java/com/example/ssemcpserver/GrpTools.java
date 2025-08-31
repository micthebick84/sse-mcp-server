package com.example.ssemcpserver;

import com.example.ssemcpserver.service.GrpService;
import com.example.ssemcpserver.model.dto.GrpDto;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * GrpTools is a utility class that provides methods for managing group data.
 * It uses the GrpService to perform group operations.
 */
@Component
public class GrpTools {
    
    private final GrpService grpService;

    public GrpTools(GrpService grpService) {
        this.grpService = grpService;
    }

    /**
     * Get default group tree list all
     * 
     * @return List of group tree data
     */
    @Tool(description = "Get default group tree list all. HTTP: GET /api/grp/default-tree, Response: List<GrpDto> containing group tree data. Map structure: {centerCode: String, grpNo: String, grpParent: String, grpRef: String, grpName: String, grpNameStr: String, isLeaf: Integer, devKind1: String, devKind2: String, devIp: String, grpCode: String, sortIdx: Integer, err: Integer, cnt: Integer, grpNoSeq: String, grpRefString: String, strGrpParent: String}")
    public List<GrpDto> getDefaultGrpTreeListAll() {
        return grpService.getDefaultGrpTreeListAll();
    }

    /**
     * Get auth default group tree not event list
     * 
     * @return List of group tree data without events
     */
    @Tool(description = "Get auth default group tree not event list. HTTP: GET /api/grp/auth-default-tree-not-event, Response: List<GrpDto> containing group tree data without events. Map structure: {centerCode: String, grpNo: String, grpParent: String, grpRef: String, grpName: String, grpNameStr: String, isLeaf: Integer, devKind1: String, devKind2: String, devIp: String, grpCode: String, sortIdx: Integer, err: Integer, cnt: Integer, grpNoSeq: String, grpRefString: String, strGrpParent: String}")
    public List<GrpDto> getAuthDefaultGrpTreeNotEventList() {
        return grpService.getAuthDefaultGrpTreeNotEventList();
    }

    /**
     * Get auth default group tree event list
     * 
     * @param isContainErr Event contain flag (true/false)
     * @param isContainDev Device contain flag (true/false)
     * @param devKind1List Device kind1 list (optional)
     * @param devKind2List Device kind2 list (optional)
     * @param isPerfFlag Performance polling flag (0/1, optional)
     * @param tmplNo Template number (optional)
     * @param vendorList Vendor list (optional)
     * @param condition Condition (DAILY_CHECK/COMMAND, optional)
     * @param workerNo Worker number (optional)
     * @param devCountGroupView Device count group view (HIDE/SHOW, optional)
     * @return List of group tree data with events
     */
    @Tool(description = "Get auth default group tree event list. HTTP: GET /api/grp/auth-default-tree-event, Parameters: isContainErr (String, optional), isContainDev (String, optional), devKind1List (String[], optional), devKind2List (String[], optional), isPerfFlag (Integer, optional), tmplNo (Integer, optional), vendorList (String[], optional), condition (String, optional), workerNo (String, optional), devCountGroupView (String, optional), Response: List<GrpDto> containing group tree data with events. Map structure: {centerCode: String, grpNo: String, grpParent: String, grpRef: String, grpName: String, grpNameStr: String, isLeaf: Integer, devKind1: String, devKind2: String, devIp: String, grpCode: String, sortIdx: Integer, err: Integer, cnt: Integer, grpNoSeq: String, grpRefString: String, strGrpParent: String}")
    public List<GrpDto> getAuthDefaultGrpTreeEventList(String isContainErr, String isContainDev,
                                                       String[] devKind1List, String[] devKind2List,
                                                       Integer isPerfFlag, Integer tmplNo,
                                                       String[] vendorList, String condition,
                                                       String workerNo, String devCountGroupView) {
        return grpService.getAuthDefaultGrpTreeEventList(
            isContainErr, isContainDev, devKind1List, devKind2List,
            isPerfFlag, tmplNo, vendorList, condition, workerNo, devCountGroupView);
    }
} 