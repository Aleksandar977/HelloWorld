package com.singular.service;

import com.singular.repository.HelloWorldRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class HelloWorldServiceImpl implements HelloWorldService{
    private final HelloWorldRepository hw;

    @Override
    public String getHelloWorld() {
        return hw.getHelloWorld();
    }
}
