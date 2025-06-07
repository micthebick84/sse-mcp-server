package com.example.ssemcpserver;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.ssemcpserver.DateTimeTools;

@SpringBootApplication
public class SseMcpServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SseMcpServerApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider datetimeTools(){
        return MethodToolCallbackProvider.builder().toolObjects(new DateTimeTools()).build();
    }

}
