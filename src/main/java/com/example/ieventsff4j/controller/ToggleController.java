package com.example.ieventsff4j.controller;

import com.example.ieventsff4j.service.toggleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/toggle")
public class ToggleController {
    @Autowired
    private toggleService toggleService;
    @GetMapping("/{feature}")
    public Boolean isFeatureEnabled(@PathVariable(value = "feature") String feature) {
        return toggleService.isFeatureEnabled(feature);
    }
}
