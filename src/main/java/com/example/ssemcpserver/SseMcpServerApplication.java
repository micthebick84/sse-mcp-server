package com.example.ssemcpserver;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.ssemcpserver.DateTimeTools;
import com.example.ssemcpserver.UserTools;
import com.example.ssemcpserver.MenuTools;
import com.example.ssemcpserver.RawPerfChartTools;
import com.example.ssemcpserver.GrpTools;
import com.example.ssemcpserver.NmsTools;
import com.example.ssemcpserver.service.UserService;

@SpringBootApplication
@Configuration
public class SseMcpServerApplication {

    private final ApplicationContext context;
    private final UserService userService;

    public SseMcpServerApplication(ApplicationContext context, UserService userService) {
        this.context = context;
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SseMcpServerApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider datetimeTools(){
        return MethodToolCallbackProvider.builder().toolObjects(new DateTimeTools()).build();
    }


    @Bean
    public ToolCallbackProvider userToolsProvider() {
        UserTools userTools = context.getBean(UserTools.class);
        return MethodToolCallbackProvider.builder().toolObjects(userTools).build();
    }
    
    @Bean
    public ToolCallbackProvider menuToolsProvider() {
        MenuTools menuTools = context.getBean(MenuTools.class);
        return MethodToolCallbackProvider.builder().toolObjects(menuTools).build();
    }
    
    @Bean
    public ToolCallbackProvider rawPerfChartToolsProvider() {
        RawPerfChartTools rawPerfChartTools = context.getBean(RawPerfChartTools.class);
        return MethodToolCallbackProvider.builder().toolObjects(rawPerfChartTools).build();
    }
    
    @Bean
    public ToolCallbackProvider grpToolsProvider() {
        GrpTools grpTools = context.getBean(GrpTools.class);
        return MethodToolCallbackProvider.builder().toolObjects(grpTools).build();
    }
    
    @Bean
    public ToolCallbackProvider nmsToolsProvider() {
        NmsTools nmsTools = context.getBean(NmsTools.class);
        return MethodToolCallbackProvider.builder().toolObjects(nmsTools).build();
    }

}
