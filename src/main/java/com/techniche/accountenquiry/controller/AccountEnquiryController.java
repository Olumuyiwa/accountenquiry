package com.techniche.accountenquiry.controller;

import com.techniche.accountenquiry.service.AccountEnquiryService;
import com.techniche.accountenquiry.dto.AccountEnquiryRequest;
import com.techniche.accountenquiry.dto.AccountEnquiryResponse;
import com.techniche.accountenquiry.dto.HelloResponse;
import com.techniche.accountenquiry.dto.User;
import com.techniche.accountenquiry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("${server.endpoint}")
public class AccountEnquiryController {
    Logger logger = LoggerFactory.getLogger(AccountEnquiryController.class);
    @Autowired
    UserService userService;
    @Autowired
    AccountEnquiryService accountEnquiryService;
    @GetMapping(path="/helloworld", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String doJustHelloWorld(){
        return("{\n\"response\":\"Hello world\"\n}");
    }
    @PostMapping(path = "/postAnHelloGreeting", produces = {MediaType.APPLICATION_JSON_VALUE})
    public HelloResponse doHelloResponse(){
        HelloResponse helloResponseDTO = new HelloResponse();
        helloResponseDTO.setResponse("Hi, How are you");
        return helloResponseDTO;
    }
    @GetMapping(value = "/specialgreeting/{name}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public User getUser(@PathVariable("name") String name) {
        User user = new User();
        user.setName(name);
        user.setGreeting("Hello "+name);
        return user;
    }
    @PostMapping(path = "users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody User newUser) throws Exception {

        User user = userService.save(newUser);
        if (user == null) {
            throw new Exception("User creation failed");
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }
    @PostMapping("/accountBalance")
    public ResponseEntity<AccountEnquiryResponse> getAccountBalance(@RequestBody AccountEnquiryRequest accountEnquiryRequest) {
        logger.info("Executing account validation log");
        AccountEnquiryResponse response = accountEnquiryService.fetchCustomerDetailsByAccountNumber(accountEnquiryRequest);
        return new ResponseEntity<AccountEnquiryResponse>(response, HttpStatus.OK);
    }

}
