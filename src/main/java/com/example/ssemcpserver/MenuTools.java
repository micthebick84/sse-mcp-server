package com.example.ssemcpserver;

import com.example.ssemcpserver.model.dto.*;
import com.example.ssemcpserver.service.MenuService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * MenuTools is a utility class that provides methods for managing menus.
 * It uses the MenuService to perform menu-related operations.
 */
@Component
public class MenuTools {
    
    private final MenuService menuService;

    public MenuTools(MenuService menuService) {
        this.menuService = menuService;
    }

    /**
     * Get hierarchical menu list for a user
     * 
     * @param userId The user ID
     * @param siteName The site name
     * @param auth The user's authorization level (Admin, MUser, User, System)
     * @param menuAuthNo The menu authorization number (default: 0)
     * @return List of hierarchical menu structure
     */
    @Tool(description = "Get hierarchical menu list for a user with authorization filtering. HTTP: GET /api/menu/hierarchical, Parameters: userId (String), siteName (String), auth (String), menuAuthNo (Integer, optional, default: 0), Response: List<PageDto> containing hierarchical menu structure. PageDto structure: {pageNo: String, pageName: String, orderNo: Integer, webIconClass: String, children: List<PageGrpDto>}. PageGrpDto structure: {pageNo: String, pageGrpNo: String, pageGrpName: String, orderNo: Integer, children: List<MenuDto>}. MenuDto structure: {pageNo: String, pageGrpNo: String, menuNo: String, menuName: String, guid: String, menuAuth: String, orderNo: Integer, menuType: String, linkViewType: String, grpType: String, scondUse: String, rtUse: Integer}")
    public List<PageDto> getHierarchicalMenuList(String userId, String siteName, String auth, Integer menuAuthNo) {
        return menuService.getHierarchicalMenuList(userId, siteName, auth, menuAuthNo);
    }

    /**
     * Get all menu list
     * 
     * @param siteName The site name
     * @param disableLayout Whether to disable layout menus (0: include, 1: exclude)
     * @return List of all menus
     */
    @Tool(description = "Get all menu list with optional layout filtering. HTTP: GET /api/menu/all, Parameters: siteName (String), disableLayout (Integer, optional, default: 0), Response: List<MenuDto> containing all menu information. MenuDto structure: {pageNo: String, pageGrpNo: String, menuNo: String, menuName: String, guid: String, menuAuth: String, orderNo: Integer, menuType: String, linkViewType: String, grpType: String, scondUse: String, rtUse: Integer}")
    public List<MenuDto> getMenuListAll(String siteName, Integer disableLayout) {
        return menuService.getMenuListAll(siteName, disableLayout);
    }

    /**
     * Get page group list
     * 
     * @param siteName The site name
     * @return List of page groups with menu counts
     */
    @Tool(description = "Get page group list with menu counts. HTTP: GET /api/menu/page-groups, Parameters: siteName (String), Response: List<Map<String, Object>> containing page groups with menu counts. Map structure: {pageNo: String, pageGrpNo: String, pageGrpName: String, menuCount: Integer}")
    public List<Map<String, Object>> getPageGroupList(String siteName) {
        return menuService.getPageGroupList(siteName);
    }

    /**
     * Get page list
     * 
     * @param siteName The site name
     * @return List of pages with menu counts
     */
    @Tool(description = "Get page list with menu counts. HTTP: GET /api/menu/pages, Parameters: siteName (String), Response: List<Map<String, Object>> containing pages with menu counts. Map structure: {pageNo: String, pageName: String, menuCount: Integer}")
    public List<Map<String, Object>> getPageList(String siteName) {
        return menuService.getPageList(siteName);
    }

    /**
     * Get layout menu list
     * 
     * @param siteName The site name
     * @return List of layout menus
     */
    @Tool(description = "Get layout menu list. HTTP: GET /api/menu/layout, Parameters: siteName (String), Response: List<LayoutMenuDto> containing layout menu information. LayoutMenuDto structure: {menuName: String, guid: String, grpType: String, scondUse: String, isRegMenu: Integer}")
    public List<LayoutMenuDto> getLayoutMenuList(String siteName) {
        return menuService.getLayoutMenuList(siteName);
    }

    /**
     * Get layout menu condition list
     * 
     * @param guid The GUID of the menu
     * @return List of layout menu conditions
     */
    @Tool(description = "Get layout menu condition list by GUID. HTTP: GET /api/menu/layout/conditions, Parameters: guid (String), Response: List<LayoutMenuCondDto> containing layout menu conditions. LayoutMenuCondDto structure: {guid: String, condType: String}")
    public List<LayoutMenuCondDto> getLayoutMenuCondList(String guid) {
        return menuService.getLayoutMenuCondList(guid);
    }

    /**
     * Check if menu authorization exists for a user
     * 
     * @param userId The user ID
     * @param guid The menu GUID
     * @return Number of existing authorizations (0: no auth, >0: has auth)
     */
    @Tool(description = "Check if menu authorization exists for a user. HTTP: GET /api/menu/auth-check, Parameters: userId (String), guid (String), Response: Integer (0: no authorization, >0: authorization exists)")
    public int getMenuAuthExistCnt(String userId, String guid) {
        return menuService.getMenuAuthExistCnt(userId, guid);
    }

    /**
     * Get dashboard menu number
     * 
     * @return Dashboard menu number as string
     */
    @Tool(description = "Get dashboard menu number. HTTP: GET /api/menu/dash-menu-no, Parameters: None, Response: String containing dashboard menu number")
    public String getDashMenuNo() {
        return menuService.getDashMenuNo();
    }

    /**
     * Get menu location information
     * 
     * @param guid The menu GUID
     * @return Menu location information including page name and group name
     */
    @Tool(description = "Get menu location information by GUID. HTTP: GET /api/menu/location, Parameters: guid (String), Response: Map<String, Object> containing menu location information. Map structure: {pageName: String, groupName: String, menuName: String}")
    public Map<String, Object> getMenuLoc(String guid) {
        return menuService.getMenuLoc(guid);
    }
} 