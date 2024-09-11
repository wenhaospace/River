package com.river.start.repository;

import com.river.start.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByIdentityCardNumber(String identityCardNumber);

}