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
    @Tool(description = "Create a new user with the given username and email. HTTP: POST /api/users, Parameters: username (String), email (String), Response: User object with generated ID. User object structure: {id: Long, username: String, email: String}")
    public User createUser(String username, String email) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        userService.createUser(user);
        return user;
    }

    @Tool(description = "Get user information by ID. HTTP: GET /api/users/{id}, Parameters: id (Long) in path, Response: User object or null if not found. User object structure: {id: Long, username: String, email: String}")
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @Tool(description = "Get user information by username. HTTP: GET /api/users/username/{username}, Parameters: username (String) in path, Response: User object or null if not found. User object structure: {id: Long, username: String, email: String}")
    public User getUserByUsername(String username) {
        return userService.getUserByUsername(username);
    }

    @Tool(description = "Update user information. HTTP: PUT /api/users/{id}, Parameters: id (Long) in path, username (String), email (String), Response: Updated User object. User object structure: {id: Long, username: String, email: String}")
    public User updateUser(Long id, String username, String email) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setEmail(email);
        userService.updateUser(user);
        return user;
    }

    @Tool(description = "Delete user by ID. HTTP: DELETE /api/users/{id}, Parameters: id (Long) in path, Response: void (no content)")
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }

    @Tool(description = "Get users in the system with pagination. HTTP: GET /api/users, Parameters: page (int), size (int), Response: Array of User objects. Each User object structure: {id: Long, username: String, email: String}")
    public User[] getUsersByPage(int page, int size) {
        return userService.getUsersByPage(page, size).toArray(new User[0]);
    }
}
