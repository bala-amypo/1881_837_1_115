package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "temperature_rules")
public class TemperatureRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productType;
    private Double minTemperature;
    private Double maxTemperature;

    // Getters and Setters
}
