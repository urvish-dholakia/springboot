package com.aws.lab.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hey Tyson , Its Beyblade v3";
    }

    @GetMapping("/health")
    public String health() {
        return "Application Healthy";
    }

    @GetMapping("/version")
    public String version() {
        return "Version 1.0";
    }
}
