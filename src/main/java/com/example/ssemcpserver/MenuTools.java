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
    @Tool(description = "Get hierarchical menu list for a user with authorization filtering")
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
    @Tool(description = "Get all menu list with optional layout filtering")
    public List<MenuDto> getMenuListAll(String siteName, Integer disableLayout) {
        return menuService.getMenuListAll(siteName, disableLayout);
    }

    /**
     * Get page group list
     * 
     * @param siteName The site name
     * @return List of page groups with menu counts
     */
    @Tool(description = "Get page group list with menu counts")
    public List<Map<String, Object>> getPageGroupList(String siteName) {
        return menuService.getPageGroupList(siteName);
    }

    /**
     * Get page list
     * 
     * @param siteName The site name
     * @return List of pages with menu counts
     */
    @Tool(description = "Get page list with menu counts")
    public List<Map<String, Object>> getPageList(String siteName) {
        return menuService.getPageList(siteName);
    }

    /**
     * Get layout menu list
     * 
     * @param siteName The site name
     * @return List of layout menus
     */
    @Tool(description = "Get layout menu list")
    public List<LayoutMenuDto> getLayoutMenuList(String siteName) {
        return menuService.getLayoutMenuList(siteName);
    }

    /**
     * Get layout menu condition list
     * 
     * @param guid The GUID of the menu
     * @return List of layout menu conditions
     */
    @Tool(description = "Get layout menu condition list by GUID")
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
    @Tool(description = "Check if menu authorization exists for a user")
    public int getMenuAuthExistCnt(String userId, String guid) {
        return menuService.getMenuAuthExistCnt(userId, guid);
    }

    /**
     * Get dashboard menu number
     * 
     * @return Dashboard menu number as string
     */
    @Tool(description = "Get dashboard menu number")
    public String getDashMenuNo() {
        return menuService.getDashMenuNo();
    }

    /**
     * Get menu location information
     * 
     * @param guid The menu GUID
     * @return Menu location information including page name and group name
     */
    @Tool(description = "Get menu location information by GUID")
    public Map<String, Object> getMenuLoc(String guid) {
        return menuService.getMenuLoc(guid);
    }
} 