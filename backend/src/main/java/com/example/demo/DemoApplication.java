/**
 * Demo application package.
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    /**
     * Main entry point of the Spring Boot application.
     *
     * @param args application arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}