package com.example.demo.controller;

import com.example.demo.entity.AlertRecord;
import com.example.demo.service.AlertService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alerts")
public class AlertRecordController {

    private final AlertService alertService;

    public AlertRecordController(AlertService alertService) {
        this.alertService = alertService;
    }

    @GetMapping("/shipment/{shipmentId}")
    public List<AlertRecord> getAlertsByShipment(@PathVariable Long shipmentId) {
        return alertService.getAlertsByShipmentId(shipmentId);
    }
}
