/** Demo application package. */
package com.example.demo;

public class HelloService {

  public String sayHello(String name) {
    if (name == null || name.isBlank()) {
      return "Hello World";
    }
    return "Hello " + name;
  }
}
