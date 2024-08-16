package com.colak.springtutorial.controller;

import com.colak.springtutorial.service.SingletonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final SingletonService singletonService;

    // http://localhost:8080/
    @GetMapping
    public String hello() {
        return singletonService.executeProtoBean();
    }
}
