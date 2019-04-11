package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/testjsp")
public class HelloController {
    @RequestMapping("/index")
    public ModelAndView testJsp() {
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }
}