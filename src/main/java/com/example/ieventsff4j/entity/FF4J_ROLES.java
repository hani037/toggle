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
@Table(
        name="FF4J_ROLES")
public class FF4J_ROLES implements Serializable {
    private @Id
    String FEAT_UID;
    private
    String ROLE_NAME;

}
