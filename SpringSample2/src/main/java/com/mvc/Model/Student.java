package com.mvc.Model;

import com.mvc.validation.CourseCode;

import javax.validation.constraints.*;
import java.util.LinkedHashMap;

public class Student {

    @NotNull(message="is required")
    @Size(min=1,message="is required")
    private String firstName;
    @NotNull(message="is required")
    @Size(min=1,message="is required")
    private String lastName;

    private String country;

    @NotNull(message="is required")
    @Min(value = 18,message = "must be greater than or equal to 18")
    @Max(value = 60,message = "must be less than or equal to 60")
    private Integer age;
    @Pattern(regexp = "^[a-zA-Z0-9]{6}",message = "only 6 characters/digits")
    private String postalCode;
    @CourseCode(value = "MNG",message = "must starts with MNG")
    private String courseCode;


    private String favouriteLanguage;

    private String[] operatingSystems;


    private LinkedHashMap<String,String> countryOptions;

    public Student(){
        //populate country options: used ISO Country COde
        countryOptions=new LinkedHashMap<>();
        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","France");
        countryOptions.put("DE","Germany");
        countryOptions.put("IN","India");
        countryOptions.put("US","United States Of America");

    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }



    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
