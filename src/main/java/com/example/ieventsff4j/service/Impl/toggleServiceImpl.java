package com.example.ieventsff4j.service.Impl;

import com.example.ieventsff4j.model.Feature;
import com.example.ieventsff4j.service.toggleService;
import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class toggleServiceImpl implements toggleService {
    @Autowired
    public FF4j ff4j;
    @Override
    public boolean isFeatureEnabled(String feature) {
            return ff4j.check(feature);
    }
    @Override
    public List<Feature> isFeaturesEnabled(List<String> features ) {
        List<Feature> featureList = new ArrayList<>();
        features.forEach(feature -> {
            featureList.add(Feature.builder().name(feature).enabled(ff4j.check(feature)).build());
        });
        return featureList;
    }
}
