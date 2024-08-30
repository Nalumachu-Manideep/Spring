package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        //create a spring container
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        //getBean using the name
        Coach theCoach=context.getBean("myCoach",Coach.class);

        //getBean using class
//        System.out.println(context.getBean(Coach.class).getDailyWorkout());

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call the method for fortunes
        System.out.println(context.getBean("myCoach",Coach.class).getDailyFortune());
        //close the context
        context.close();
    }
}
