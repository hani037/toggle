package com.example.ieventsff4j.repository;


import com.example.ieventsff4j.entity.FF4J_PROPERTIES;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface AppointmentRepository extends JpaRepository<FF4J_PROPERTIES, String> {

}
