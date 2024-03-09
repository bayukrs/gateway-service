package com.rnd.bayu.gatewayservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Test {

    @Value("${user.role}")
    private String role;

    @GetMapping("/")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok(role);
    }
}
