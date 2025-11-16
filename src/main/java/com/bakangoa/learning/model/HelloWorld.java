package com.bakangoa.learning.model;


public class HelloWorld {
    private final String message;

    public HelloWorld() {
        message = "Hello World!";
    }

    public boolean isMessageEqual(String message) {
        return message.equals(this.message);
    }

    @Override
    public String toString() {
        return message;
    }
}
