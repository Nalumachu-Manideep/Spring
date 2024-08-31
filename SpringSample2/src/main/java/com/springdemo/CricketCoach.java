package com.springdemo;
public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    //add new fields for email and team
    private String emailAddress;
    private String team;
    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter Method -setEmailAdress");
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter Method- setTeam");
        this.team = team;
    }
    public String getTeam() {
        return team;
    }
    //create a non-ar contructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }
    //setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter Method");
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 15 minutes";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}