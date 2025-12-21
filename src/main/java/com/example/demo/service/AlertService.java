package com.example.demo.service;

import com.example.demo.entity.AlertRecord;
import java.util.List;

public interface AlertService {

    List<AlertRecord> getAlertsByShipmentId(Long shipmentId);
}
