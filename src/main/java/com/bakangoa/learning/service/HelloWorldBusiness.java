package com.bakangoa.learning.service;

import com.bakangoa.learning.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldBusiness {
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}
