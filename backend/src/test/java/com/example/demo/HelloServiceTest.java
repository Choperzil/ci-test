package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    private final HelloService service = new HelloService();

    @Test
    void sayHello_withName() {
        assertEquals("Hello Tuấn", service.sayHello("Tuấn"));
    }

    @Test
    void sayHello_withBlank() {
        assertEquals("Hello World", service.sayHello(""));
    }
}