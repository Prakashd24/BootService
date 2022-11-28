package com.pt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.pt.constants.Constants.STATUS;

@RestController
public class AppController {

    @GetMapping("/healthcheck")
    public String getHealthCheck() {
        return STATUS;
    }
}
