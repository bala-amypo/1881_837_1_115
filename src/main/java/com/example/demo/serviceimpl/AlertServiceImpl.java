package com.example.demo.service.impl;

import com.example.demo.entity.AlertRecord;
import com.example.demo.repository.AlertRecordRepository;
import com.example.demo.service.AlertService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertServiceImpl implements AlertService {

    private final AlertRecordRepository alertRecordRepository;

    public AlertServiceImpl(AlertRecordRepository alertRecordRepository) {
        this.alertRecordRepository = alertRecordRepository;
    }

    @Override
    public List<AlertRecord> getAlertsByShipmentId(Long shipmentId) {
        return alertRecordRepository.findByShipmentId(shipmentId);
    }
}
