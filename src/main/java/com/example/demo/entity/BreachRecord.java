package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "breach_record")
public class BreachRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shipment_id", nullable = false)
    private Long shipmentId;

    private Double temperature;

    private String status;

    // getters and setters
}
