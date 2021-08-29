package com.example.ieventsff4j.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(
        name="FF4J_PROPERTIES")
public class FF4J_PROPERTIES implements Serializable {
    private @Id
    String PROPERTY_ID;
    private String CLAZZ;
    private String CURRENTVALUE;
    private String FIXEDVALUES;
    private String DESCRIPTION;
}
