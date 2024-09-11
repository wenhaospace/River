package com.river.start.controller;

import com.river.start.common.http.HttpResponse;
import com.river.start.common.vo.LoginFormVo;
import com.river.start.entity.User;
import com.river.start.service.AccessService;
import com.river.start.service.AccountService;
import com.river.start.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class LoginController {

    private final AccessService accessService;


    @Autowired
    public LoginController( AccessService accessService) {
        this.accessService = accessService;
    }

    @PostMapping("/login")
    public ResponseEntity<HttpResponse<User>> loginByAccount(@RequestBody LoginFormVo loginFormVo) {
        User user = accessService.loginByAccount(loginFormVo.getAccount(), loginFormVo.getPassword());
        HttpResponse<User> response = new HttpResponse<>(HttpStatus.OK.value(), "success", user);
        return  new ResponseEntity<>(response, HttpStatus.OK);

    }
}
