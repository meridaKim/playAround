package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {
    @RequestMapping("/")
    public ModelAndView jsp(){
        ModelAndView model = new ModelAndView("mainPage");
        return model;
    }
}
