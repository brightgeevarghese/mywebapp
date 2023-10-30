package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/myapp")
public class MyController {
    @GetMapping(value = "/show")
    public String getMyData() {
        return "bright page";
    }
}
