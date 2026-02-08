package com.bank.banking_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("application", "Banking System API");
        response.put("version", "1.0.0");
        response.put("status", "running");
        response.put("endpoints", new String[]{
            "/api/auth/customer/login",
            "/api/auth/admin/login",
            "/api/customer",
            "/api/customer/accounts/{customerId}",
            "/api/admin/accounts"
        });
        return response;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        return response;
    }
}
