package com.singular.controller;

import com.singular.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class HelloWorldController {
    private final HelloWorldService hs;

    @GetMapping("/Hello")
    public String helloWorld() {
        return hs.getHelloWorld();
    }
}
