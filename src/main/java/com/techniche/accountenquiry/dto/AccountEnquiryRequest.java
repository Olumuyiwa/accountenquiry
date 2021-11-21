package com.techniche.accountenquiry.dto;

public class AccountEnquiryRequest {
    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "AccountEnquiryRequest{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
