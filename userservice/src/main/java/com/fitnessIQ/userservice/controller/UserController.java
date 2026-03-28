package com.fitnessIQ.userservice.controller;

import com.fitnessIQ.userservice.dto.RegisterRequest;
import com.fitnessIQ.userservice.dto.UserResponse;
import com.fitnessIQ.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController                         // handle http request, return JSON
@RequestMapping("/api/users")
@AllArgsConstructor                     // automatically create a constructor with all fields as parameters
public class UserController {           // create two endpoints

    //@Autowired                        // automatically inject UserService bean (spring object)
    private UserService userService;

    @GetMapping("/{userId}")         // get - read data
    public ResponseEntity<UserResponse> getUserProfile(@PathVariable String userId){
        return ResponseEntity.ok(userService.getUserProfile(userId));
    }

    @PostMapping("/register")       // post - create data
    public ResponseEntity<UserResponse> register(@Valid @RequestBody RegisterRequest request){
        return ResponseEntity.ok(userService.register(request));
    }
}
