package org.example.testunijpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TestUniJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestUniJpaApplication.class, args);
    }

}
