package com.river.start.service;

import com.river.start.entity.Account;
import com.river.start.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessService {

    private final AccountService accountService;

    private final  UserService userService;


    @Autowired
    public AccessService( AccountService accountService, UserService userService) {
        this.accountService = accountService;
        this.userService = userService;

    }

    public User loginByAccount(String account, String password) {
        Account userAccount =  accountService.findByAccount(account);
        if (userAccount != null && userAccount.getPassword().equals(password)) {
            return userService.findByIdentityCardNumber(userAccount.getIdentityCardNumber());
        }

        return null;


    }
}
