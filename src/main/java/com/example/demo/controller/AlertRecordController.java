package com.example.demo.controller;

import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertRecordController {

    private final AlertService service;

    public AlertRecordController(AlertService service) {
        this.service = service;
    }

    @GetMapping
    public List<AlertRecord> getAllAlerts() {
        return service.getAllAlerts();
    }

    @GetMapping("/shipment/{shipmentId}")
    public List<AlertRecord> getAlertsByShipment(@PathVariable Long shipmentId) {
        return service.getAlertsByShipment(shipmentId);
    }
}
