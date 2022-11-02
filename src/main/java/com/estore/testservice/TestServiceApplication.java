package com.estore.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestServiceApplication {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from the other world...";
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to AWS Cloud....";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestServiceApplication.class, args);
    }

}
