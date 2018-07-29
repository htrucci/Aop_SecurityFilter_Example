package com.htrucci.securityfilter.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/")
    public String Test(Model model){
        System.out.println("Test");
        return "Test";
    }
}
