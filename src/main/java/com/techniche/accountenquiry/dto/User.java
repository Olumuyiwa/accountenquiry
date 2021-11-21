package com.techniche.accountenquiry.dto;

public class User {
    private String name;
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
