package com.river.start.service;

import com.river.start.entity.User;
import com.river.start.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> addUsers(List<User> newUsers) {
        return userRepository.saveAll(newUsers);
    }

    @PostConstruct
    public void init() {
//        User user1 = new User();
//        user1.setName("Alice");
//        userRepository.save(user1);
//
//        User user2 = new User();
//        user2.setName("Bob");
//        userRepository.save(user2);

        List<User>  userList = userRepository.findAll();
        userList.forEach(System.out::println);
    }

    // other methods...
}
