package com.example.ssemcpserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.ssemcpserver.model.User;
import com.example.ssemcpserver.service.UserService;

@SpringBootTest
class SseMcpServerApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User newUser = new User();
        newUser.setUsername("testuser");
        newUser.setEmail("test@example.com");
        userService.createUser(newUser);
    }
}
