package ru.practicum.statsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatServerApplication {
    public static void main(String[] args) {
        System.setProperty("server.port", "9090");
        SpringApplication.run(StatServerApplication.class, args);
    }
}
