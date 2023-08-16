package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class index {
    @GetMapping("/")
    public ModelAndView display(){
        return new ModelAndView("index.html");
    }
}
