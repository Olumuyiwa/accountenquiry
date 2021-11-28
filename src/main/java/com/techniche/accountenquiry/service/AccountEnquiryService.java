package com.techniche.accountenquiry.service;

import com.techniche.accountenquiry.dto.AccountEnquiryRequest;
import com.techniche.accountenquiry.dto.AccountEnquiryResponse;
import com.techniche.accountenquiry.entity.AccountEnquiryEntity2;
import com.techniche.accountenquiry.repository.AccountEnquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AccountEnquiryService {
    @Autowired
    AccountEnquiryRepository accountEnquiryRepository;

    Logger logger = LoggerFactory.getLogger(AccountEnquiryService.class);

    public AccountEnquiryResponse fetchCustomerDetailsByAccountNumber(AccountEnquiryRequest accountEnquiryRequest) {

        String responseCode   = "";
        String responseMessage = "";
        String acctName="";
        String acctBal="";
        String acctNo ="";
        System.out.println("Inside the service accountEnquiryRequest = " + accountEnquiryRequest);
        AccountEnquiryResponse accountEnquiryResponse = new AccountEnquiryResponse();
        AccountEnquiryEntity2 accountEnquiryEntity =
                accountEnquiryRepository.fetchCustomerDetailsByAccountNumber(accountEnquiryRequest.getAccountNumber());

        if(accountEnquiryEntity==null){
            responseCode   = "901";
            responseMessage = "Account does not exist";
            acctName="";
            acctBal="";
            acctNo ="";
        }
        else{
            responseCode   = "000";
            responseMessage = "Account details retrieved successfully";
            acctName=accountEnquiryEntity.getAccountName();
            acctBal=accountEnquiryEntity.getAccountBalance();
            acctNo =accountEnquiryEntity.getAccountNumber();
        }
        accountEnquiryResponse.setAccountNumber(acctNo);
        accountEnquiryResponse.setAccountBalance(acctBal);
        accountEnquiryResponse.setAccountName(acctName);
        accountEnquiryResponse.setResponseCode(responseCode);
        accountEnquiryResponse.setResponseMessage(responseMessage);

        return accountEnquiryResponse;
    }

}
