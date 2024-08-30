package com.beans_scope_and_lifecycle;

import com.springdemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansLifeCycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach theCoach=context.getBean("myCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        //clase the context
        context.close();
    }



}
