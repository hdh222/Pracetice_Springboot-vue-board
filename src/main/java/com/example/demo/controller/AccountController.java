package com.example.demo.controller;

import com.example.demo.vo.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {

    @PostMapping("/login")
    public Account login(@RequestBody Account account){
        System.out.println("실행됨");

        System.out.println(account);

        return account;
    }
}
