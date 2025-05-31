package com.example.ssemcpserver;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.context.i18n.LocaleContextHolder;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTools {

    @Tool(description = "Get the Current date and time in the user,s timezone")
    public String getCurrentDateTime() {
        ZonedDateTime localDateTime = LocalDateTime.now().atZone(LocaleContextHolder.getTimeZone().toZoneId());
        return localDateTime.toString();
    }

    @Tool(description = "set a user alarm for the given time, provided in ISO-8601 format")
    public void setAlarm(String time){
        LocalDateTime alarm = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME);
    }

}
