package com.example.ssemcpserver;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.context.i18n.LocaleContextHolder;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTools {

    @Tool(description = "Get the current date and time in the user's timezone. HTTP: No HTTP endpoint available (Tool only), Parameters: None, Response: String containing current date and time in ISO-8601 format (e.g., '2025-08-20T21:35:14.864+09:00[Asia/Seoul]')")
    public String getCurrentDateTime() {
        ZonedDateTime localDateTime = LocalDateTime.now().atZone(LocaleContextHolder.getTimeZone().toZoneId());
        return localDateTime.toString();
    }

    @Tool(description = "Set a user alarm for the given time, provided in ISO-8601 format. HTTP: No HTTP endpoint available (Tool only), Parameters: time (String) in ISO-8601 format (e.g., '2025-08-20T21:00:00'), Response: void (no return value, alarm is set internally)")
    public void setAlarm(String time){
        LocalDateTime alarm = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME);
    }

}
