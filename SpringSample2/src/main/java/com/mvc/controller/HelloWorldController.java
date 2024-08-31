package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // Define a constant for the view name
    private static final String HELLO_WORLD_VIEW = "helloworld";

    // Define a constant for the form name
    private static final String HELLO_WORLD_FORM_VIEW = "helloworld-form";

    // Need a controller method to show initial HTML Form
    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm() {
        return HELLO_WORLD_FORM_VIEW;
    }

    // Need a controller method to process the HTML form
    @RequestMapping(value = "/processForm", method = RequestMethod.POST)
    public String processForm() {
        return HELLO_WORLD_VIEW;
    }

    // New controller method to read form data and add data to the model
    @RequestMapping(value = "/processFormVersionTwo", method = RequestMethod.POST)
    public String letsShotDude(HttpServletRequest request, Model model) {
        // Read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
        // Convert the data to all caps
        theName = theName.toUpperCase();
        // Create the message
        String result = "Yo! " + theName;
        // Add the message to model
        model.addAttribute("message", result);
        return HELLO_WORLD_VIEW;
    }

    @RequestMapping(value = "/processFormVersionThree", method = RequestMethod.POST)
    public String processFormVersionThree(
            @RequestParam("studentName") String theName,
            Model model) {

        // Convert the data to all caps
        theName = theName.toUpperCase();
        // Create the message
        String result = "Hello! " + theName;
        // Add the message to model
        model.addAttribute("message", result);
        return HELLO_WORLD_VIEW;
    }
}
