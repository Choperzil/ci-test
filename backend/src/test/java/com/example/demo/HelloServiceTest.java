package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloServiceTest {

  private final HelloService service = new HelloService();

  @Test
  void sayHelloWithName() {
    assertEquals("Hello Tuấn", service.sayHello("Tuấn"));
  }

  @Test
  void sayHelloWithBlank() {
    assertEquals("Hello World", service.sayHello(""));
  }
}
