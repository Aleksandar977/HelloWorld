package com.singular.controller;

import com.singular.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {
    private final HelloService hs;

    public HelloWorldController(HelloService hs) {
        this.hs = hs;
    }
    @GetMapping("/Hello")
    public String helloWorld(){
        return hs.getHello();
    }
}
