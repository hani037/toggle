package com.example.ieventsff4j.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Feature {
    private String name;
    private Boolean enabled;
}
