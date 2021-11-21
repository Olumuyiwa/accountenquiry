package com.techniche.accountenquiry.dto;

public class AccountEnquiryResponse {
    private String accountNumber;
    private String accountName;
    private String accountBalance;
    private String responseCode;
    private String responseMessage;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "AccountEnquiryResponse{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                '}';
    }
}
