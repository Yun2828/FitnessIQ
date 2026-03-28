package com.fitnessIQ.userservice.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data           // generate boilerplate code: for generating getters and setters
public class UserResponse {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
