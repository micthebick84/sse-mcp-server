package com.example.ssemcpserver;

import com.example.ssemcpserver.model.User;
import com.example.ssemcpserver.service.UserService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

/**
 * UserTools is a utility class that provides methods for managing users.
 * It uses the UserService to perform CRUD operations on users.
 */
@Component
public class UserTools {
    
    private final UserService userService;

    public UserTools(UserService userService) {
        this.userService = userService;
    }

    /**
     * Creates a new user with the given username and email.
     * 
     * @param username The username of the new user.
     * @param email The email of the new user.
     * @return The newly created user.
     */
    @Tool(description = "Create a new user with the given username and email")
    public User createUser(String username, String email) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        userService.createUser(user);
        return user;
    }

    @Tool(description = "Get user information by ID")
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @Tool(description = "Get user information by username")
    public User getUserByUsername(String username) {
        return userService.getUserByUsername(username);
    }

    @Tool(description = "Update user information")
    public User updateUser(Long id, String username, String email) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setEmail(email);
        userService.updateUser(user);
        return user;
    }

    @Tool(description = "Delete user by ID")
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }

    @Tool(description = "Get all users in the system")
    public User[] getAllUsers() {
        return userService.getAllUsers().toArray(new User[0]);
    }
}
