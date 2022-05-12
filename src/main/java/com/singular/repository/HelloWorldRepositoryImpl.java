package com.singular.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepositoryImpl implements HelloWorldRepository{

    @Override
    public String getHelloWorld() {
        return "Hello World";
    }
}
