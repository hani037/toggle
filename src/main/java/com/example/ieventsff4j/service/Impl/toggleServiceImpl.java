package com.example.ieventsff4j.service.Impl;

import com.example.ieventsff4j.service.toggleService;
import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class toggleServiceImpl implements toggleService {
    @Autowired
    public FF4j ff4j;
    @Override
    public boolean isFeatureEnabled(String feature) {
        System.out.println(ff4j.check(feature));
            return ff4j.check(feature);
    }
}
