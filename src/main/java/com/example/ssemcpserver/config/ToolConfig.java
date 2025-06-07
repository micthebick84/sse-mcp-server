package com.example.ssemcpserver.config;

import com.example.ssemcpserver.UserTools;
import com.example.ssemcpserver.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolConfig {
    
    @Bean
    public UserTools userTools(UserService userService) {
        return new UserTools(userService);
    }
}
