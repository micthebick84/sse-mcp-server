package com.example.ssemcpserver.controller;

import com.example.ssemcpserver.model.User;
import com.example.ssemcpserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/test/add-user")
    public String addTestUser() {
        User user = new User();
        user.setUsername("testuser");
        user.setEmail("test@example.com");
        userService.createUser(user);
        return "Test user created successfully!";
    }
}
