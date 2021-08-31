package com.example.ieventsff4j.service;

import com.example.ieventsff4j.model.Feature;

import java.util.List;

public interface toggleService {
    boolean isFeatureEnabled(String feature);
     List<Feature> isFeaturesEnabled(List<String> features );

}
