package com.hang.springboorwebjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("message","欢迎来的--》");
        return "success";
    }
}
