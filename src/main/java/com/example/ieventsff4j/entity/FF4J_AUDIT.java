package com.example.ieventsff4j.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="FF4J_AUDIT")
public class FF4J_AUDIT implements Serializable {
    private @Id
    String EVT_UUID;
    private
    String EVT_TIME;
    private String EVT_TYPE;
    private String EVT_NAME;
    private String EVT_ACTION;
    private String EVT_HOSTNAME;
    private String EVT_SOURCE;
    private int EVT_DURATION;
    private String EVT_USER;
    private String EVT_VALUE;
    private String EVT_KEYS;
}
