package com.singular.service;

import com.singular.repository.HelloWorldI;
import org.springframework.stereotype.Service;

@Service
public class HelloServicImpl implements HelloService {
    private final HelloWorldI hw;

    public HelloServicImpl(HelloWorldI hw) {
        this.hw = hw;
    }

    @Override
    public String getHello() {
        return hw.getPozdrav();
    }
}
