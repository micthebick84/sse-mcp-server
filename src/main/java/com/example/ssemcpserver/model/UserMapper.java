package com.example.ssemcpserver.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();
    List<User> getUsersByPage(@Param("offset") int offset, @Param("size") int size);
    User findById(Long id);
    User findByUsername(String username);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
