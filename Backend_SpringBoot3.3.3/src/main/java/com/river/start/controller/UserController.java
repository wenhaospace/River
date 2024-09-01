package com.river.start.controller;

import com.river.start.common.http.HttpResponse;
import com.river.start.entity.User;
import com.river.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin("*")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/all")
    public ResponseEntity<HttpResponse<List<User>>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        HttpResponse<List<User>> response = new HttpResponse<>(HttpStatus.OK.value(), "success", users);
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }
}

