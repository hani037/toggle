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
        name="FF4J_FEATURES")
public class FF4J_FEATURES implements Serializable {
    private @Id
    String FEAT_UID;
    private int ENABLE;
    private String DESCRIPTION;
    private String STRATEGY;
    private String EXPRESSION;
    private String GROUPNAME;
}
