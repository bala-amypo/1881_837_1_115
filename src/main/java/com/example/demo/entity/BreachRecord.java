package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "breach_records")
public class BreachRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentCode;
    private Double breachValue;
    private String severity;
    private String resolutionStatus;

    private LocalDateTime breachedAt;

    @PrePersist
    public void onCreate() {
        breachedAt = LocalDateTime.now();
        if (resolutionStatus == null) {
            resolutionStatus = "OPEN";
        }
    }

    // Getters and Setters
}
