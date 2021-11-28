//package com.techniche.accountenquiry.entity;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.util.UUID;
//
//@Entity
//@Table(name = "tbaadm.gam")
//
///*
//* SELECT a.acid as ACID, a.acct_name as accountName,  a.foracid as accountNumber,  NVL(a.CLR_BAL_AMT,0) as accountBalance" +
//                    " from tbaadm.gam a where a.foracid=:accountNo"
//* */
//public class AccountEnquiryEntity {
//    @Id
//    @Column(name = "acid", unique = true, nullable = false)
//    private String acid;
//    @Column(name = "accountNumber")
//    private String accountNumber;
//    @Column(name = "accountName")
//    private String accountName;
//    @Column(name = "accountBalance")
//    private String accountBalance;
//
//
//    public String getAcid() {
//        return acid;
//    }
//
//    public void setAcid(String acid) {
//        this.acid = acid;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountName() {
//        return accountName;
//    }
//
//    public void setAccountName(String accountName) {
//        this.accountName = accountName;
//    }
//
//    @Override
//    public String toString() {
//        return "AccountEnquiryEntity{" +
//                "acid='" + acid + '\'' +
//                ", accountNumber='" + accountNumber + '\'' +
//                ", accountName='" + accountName + '\'' +
//                ", accountBalance='" + accountBalance + '\'' +
//                '}';
//    }
//
//    public String getAccountBalance() {
//        return accountBalance;
//    }
//
//    public void setAccountBalance(String accountBalance) {
//        this.accountBalance = accountBalance;
//    }
//
//}
