package com.example.ieventsff4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.web.WebAppConfiguration;

@EntityScan("com.example.ieventsff4j.entity")
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@WebAppConfiguration
@EnableJpaRepositories(basePackages = "com.example.ieventsff4j.repository")
public class IEventsFf4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(IEventsFf4jApplication.class, args);
    }

}
