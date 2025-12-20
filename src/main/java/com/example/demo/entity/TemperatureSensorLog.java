package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "temperature_sensor_logs")
public class TemperatureSensorLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shipmentCode;
    private Double temperature;
    private LocalDateTime loggedAt;

    @PrePersist
    public void onCreate() {
        loggedAt = LocalDateTime.now();
    }

    // Getters and Setters
}
