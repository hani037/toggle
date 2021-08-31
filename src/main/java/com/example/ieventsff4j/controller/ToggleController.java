package com.example.ieventsff4j.controller;

import com.example.ieventsff4j.model.Feature;
import com.example.ieventsff4j.service.toggleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/toggle")
public class ToggleController {
    @Autowired
    private toggleService toggleService;
    @GetMapping("/{feature}")
    public Boolean isFeatureEnabled(@PathVariable(value = "feature") String feature) {
        return toggleService.isFeatureEnabled(feature);
    }
    @PostMapping("/all")
    public List<Feature> isFeaturesEnabled(@RequestBody  List<String> feature) {
        return toggleService.isFeaturesEnabled(feature);
    }
}
