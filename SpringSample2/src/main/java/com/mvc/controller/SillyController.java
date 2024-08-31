package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SillyController {
    @RequestMapping(value = "/showForm",method = RequestMethod.POST)
    public String displayTheForm(){
        return "silly";
    }
}
