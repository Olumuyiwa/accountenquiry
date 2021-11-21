package com.techniche.accountenquiry.dto;

public class HelloResponse {
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "response='" + response + '\'' +
                '}';
    }
}
