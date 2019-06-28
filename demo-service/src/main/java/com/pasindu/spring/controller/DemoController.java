package com.pasindu.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/home")
    public String homeAccess() {
        return "Welcome to spring cloud";
    }

    @GetMapping("/admin")
    public String adminAccess() {
        return "Welcome Admin to spring cloud";
    }
}
