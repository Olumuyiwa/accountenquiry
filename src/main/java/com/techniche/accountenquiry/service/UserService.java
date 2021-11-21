package com.techniche.accountenquiry.service;

import com.techniche.accountenquiry.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User save(User user){
        User user1 = user;
        user1.setGreeting("Thank you for calling me. The request has been captured for quality assurance purpose");
        return user1;
    }
}
