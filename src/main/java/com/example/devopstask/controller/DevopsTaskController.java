package com.example.devopstask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsTaskController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, i am done with my task!";
    }

}
