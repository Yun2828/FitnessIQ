package com.fitnessIQ.activityservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Map;

// Maps this class to a MongoDB collection named "activities"
@Document(collection = "activities")

// Lombok: automatically generates getters, setters, toString(), equals(), hashCode()
@Data

// Lombok: provides a builder pattern for creating objects
// Example: Activity.builder().name("Run").build();
@Builder

// Lombok: generates a constructor with ALL fields as parameters
@AllArgsConstructor

// Lombok: generates a constructor with NO parameters (default constructor)
// Required by frameworks like Spring/MongoDB
@NoArgsConstructor
public class Activity {
    @Id
    private String id;
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTime;

    @Field("metrics")
    private Map<String, Object> additionalMetrics;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}