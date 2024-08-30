package com.mvc.controller;

import com.mvc.Model.Student;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/student")
public class StudentController {

    //add an initBinder ... to convert trim input Strings
    //remove leading and trailing whitespaces
    // resolve issue for our validartion
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model model){

        //create a student object
        Student theStudent=new Student();

        //add student object to model
        model.addAttribute("student",theStudent);

        return "student-form";
    }
    @RequestMapping("/processForm")
    public String processForm(
            @Valid
            @ModelAttribute("student")
            Student theStudent,
            BindingResult theBindingResult){
        System.out.println("Last Name: "+theStudent.getLastName()+" ");
        System.out.println("Binding result: "+theBindingResult);
        System.out.println("\n\n\n\n");
        if(theBindingResult.hasErrors()){
            return "student-form";
        }
        else{
            //log the input data
            System.out.println("theStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName());
            return "student-confirmation";
        }
    }

}
