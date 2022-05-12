package com.singular.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldImpl implements HelloWorldI{

    @Override
    public String getPozdrav() {
        return "Hello World";
    }
}
