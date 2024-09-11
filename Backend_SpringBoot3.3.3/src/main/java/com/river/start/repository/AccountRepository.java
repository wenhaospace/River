package com.river.start.repository;

import com.river.start.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository  extends JpaRepository<Account, Long> {

    public Account findByAccount(String account);
}
