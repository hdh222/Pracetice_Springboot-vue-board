package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/hello")
    public ModelAndView home(ModelAndView mView){

        mView.setViewName("hello");

        return mView;
    }
}
