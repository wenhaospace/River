package com.river.start.service;

import com.river.start.entity.Account;
import com.river.start.entity.User;
import com.river.start.repository.AccountRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account findByAccount(String account) {
        return accountRepository.findByAccount(account);
    }


    @PostConstruct
    public void init() {
//        Account account1 = new Account();
//        account1.setAccount("account001");
//        account1.setPassword("password001");
//        account1.setIdentityCardNumber("430XXX");
//        accountRepository.save(account1);


        List<Account> accountList = accountRepository.findAll();
        accountList.forEach(System.out::println);
    }

}
