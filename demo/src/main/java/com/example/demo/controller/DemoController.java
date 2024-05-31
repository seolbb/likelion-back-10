package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/")
    public String hello(){
        return "hello!!";
    }
    @GetMapping("/hi")
    public String hi(){
        return "hi~~~ spring boot!!";
    }
}
