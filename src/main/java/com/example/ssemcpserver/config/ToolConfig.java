package com.example.ssemcpserver.config;

import com.example.ssemcpserver.UserTools;
import com.example.ssemcpserver.MenuTools;
import com.example.ssemcpserver.RawPerfChartTools;
import com.example.ssemcpserver.GrpTools;
import com.example.ssemcpserver.service.UserService;
import com.example.ssemcpserver.service.MenuService;
import com.example.ssemcpserver.service.RawPerfChartService;
import com.example.ssemcpserver.service.GrpService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolConfig {
    
    @Bean
    public UserTools userTools(UserService userService) {
        return new UserTools(userService);
    }
    
    @Bean
    public MenuTools menuTools(MenuService menuService) {
        return new MenuTools(menuService);
    }
    
    @Bean
    public RawPerfChartTools rawPerfChartTools(RawPerfChartService rawPerfChartService) {
        return new RawPerfChartTools(rawPerfChartService);
    }
    
    @Bean
    public GrpTools grpTools(GrpService grpService) {
        return new GrpTools(grpService);
    }
}
