package com.example.polls.controller;

import com.example.polls.payload.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TestController {

    @PostMapping("/test")
    public void test() {
        System.out.println("Testing");
    }
}
