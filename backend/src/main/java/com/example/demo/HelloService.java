/**
 * Demo application package.
 */
package com.example.demo;

import org.springframework.stereotype.Service;

public class HelloService {

    public String sayHello(String name) {
        if (name == null || name.isBlank()) {
            return "Hello World";
        }
        return "Hello " + name;
    }
}
