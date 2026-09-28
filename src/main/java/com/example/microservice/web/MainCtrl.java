package com.example.microservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller 
public class MainCtrl {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("myError") // The mapping error is forbidden
    public String printError(@RequestParam String param) {
        return "error";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/hello")
    public String hello(@RequestParam String name, Model model) {
        model.addAttribute("name",name);
        return "hello";
    }

    
}
