package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class homeController {
    //@RequestMapping(value = "/home", method = RequestMethod.POST)
    @RequestMapping("/home")
    public String index(){
        return "index";
    }

}
