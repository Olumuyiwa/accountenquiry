package com.techniche.accountenquiry.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountEnquiryEntity {
    private String accountNumber;
    private String accountName;
    private String accountBalance;

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

    @Override
    public String toString() {
        return "AccountEnquiryEntity{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                '}';
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

}
