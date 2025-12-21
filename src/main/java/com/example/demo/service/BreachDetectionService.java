package com.example.demo.service;

import com.example.demo.entity.BreachRecord;

import java.util.List;

public interface BreachDetectionService {

    List<BreachRecord> getAllBreaches();

    List<BreachRecord> getBreachesByShipment(Long shipmentId);
}
