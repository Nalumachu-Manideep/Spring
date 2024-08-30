package com.beans_scope_and_lifecycle;

import com.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach=context.getBean("myCoach",Coach.class);

        Coach alphaCoach=context.getBean("myCoach",Coach.class);

        //check if they are the same to confim scopes are working properly
        boolean result=(theCoach==alphaCoach);

        //print out the results
        System.out.println("\nPointing to the same Object: "+result);
        System.out.println("\nMemory location for theCoach: "+theCoach);
        System.out.println("\nMemory location for alphaCoach"+alphaCoach+"\n");

        //clase the context
        context.close();
    }



}
