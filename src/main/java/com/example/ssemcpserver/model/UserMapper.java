package com.example.ssemcpserver.model;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();
    User findById(Long id);
    User findByUsername(String username);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
