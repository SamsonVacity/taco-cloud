package com.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


public class HomeController {

    @GetMapping("/")
    public String Home() {
        return "home";
    }
}
