package com.springdto.model;

import java.time.LocalDate;

public class Employee {


    private Long id;

    private String firstName;
    private String lastName;


    private LocalDate DOB;

    public Employee() {
    }

    public Employee(Long id,String firstName,String lastName,LocalDate DOB) {
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.DOB=DOB;
    }
    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString(){
        return "com.lambok.Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
