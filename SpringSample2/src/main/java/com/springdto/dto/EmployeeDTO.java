package com.springdto.dto;


public class EmployeeDTO {
    private Long id;
    private String fullName;
    private int age;

    // Constructors
    public EmployeeDTO() {}

    public EmployeeDTO(Long id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
