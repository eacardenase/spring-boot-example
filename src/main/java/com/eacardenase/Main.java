package com.eacardenase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // replaces the following annotations
//@ComponentScan(basePackages = "com.eacardenase")
//@EnableAutoConfiguration
//@Configuration
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Spring Boot";
    }
}
