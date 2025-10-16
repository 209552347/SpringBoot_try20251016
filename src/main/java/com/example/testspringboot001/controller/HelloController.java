package com.example.testspringboot001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "🎉 Spring Boot 项目启动成功！";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}