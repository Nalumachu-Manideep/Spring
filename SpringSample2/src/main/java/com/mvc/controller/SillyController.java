package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
    @RequestMapping(value = "/showForm")
    public String displayTheForm(){
        return "silly";
    }
}
