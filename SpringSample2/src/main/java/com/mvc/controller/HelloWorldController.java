package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //need a controller method to show initial HTML Form
    @RequestMapping(value = "/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    //need a controller method to process the HTML form
    @RequestMapping(value = "/processForm")
    public String processForm(){
        return "helloworld";
    }

    //new controller method to read form data and add data to the model
    @RequestMapping(value = "/processFormVersionTwo")
    public String letsShotDude(HttpServletRequest request, Model model){
        //read the request parameter from the HTML form
        String theName=request.getParameter("studentName");
        //convert the data to all caps
        theName=theName.toUpperCase();
        //create the message
        String result ="Yo! "+theName;
        //add the message to model
        model.addAttribute("message",result);
        return "helloworld";
    }

    //we can use @RequestParam to extract query parameters, form parameters, and even files from the request.
    //We can also do @RequestParam(value = “studentName”) or just @RequestParam(“studentName”).
    //@RequestParam(required = false)--if the parameter isn’t present in the request,then does not through an error
    //@RequestParam(defaultValue = "NoName") String theName--If we don't provide value,then deafault value is displayed
    //Mapping All Parameters
    /*public String updateFoos(@RequestParam Map<String,String> allParams) {
            return "Parameters are " + allParams.entrySet();
        }
   */

    @RequestMapping(value = "/processFormVersionThree")
    public String processFormVersionThree(
            @RequestParam("studentName") String theName,
            Model model){

        //convert the data to all caps
        theName=theName.toUpperCase();
        //create the message
        String result ="Hello! "+theName;
        //add the message to model
        model.addAttribute("message",result);
        return "helloworld";
    }

}
