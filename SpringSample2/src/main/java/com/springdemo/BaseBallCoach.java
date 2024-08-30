package com.springdemo;

public class BaseBallCoach implements Coach{
    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a function
        return fortuneService.getFortune();
    }
}
