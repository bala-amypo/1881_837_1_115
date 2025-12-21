package com.example.demo.controller;

import com.example.demo.entity.TemperatureSensorLog;
import com.example.demo.service.TemperatureLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/temperature")
public class TemperatureLogController {

    private final TemperatureLogService service;

    public TemperatureLogController(TemperatureLogService service) {
        this.service = service;
    }

    @PostMapping
    public TemperatureSensorLog save(@RequestBody TemperatureSensorLog log) {
        return service.save(log);
    }

    @GetMapping
    public List<TemperatureSensorLog> getAll() {
        return service.getAll();
    }

    @GetMapping("/status/{status}")
    public List<TemperatureSensorLog> getByStatus(@PathVariable String status) {
        return service.getByStatus(status);
    }
}
