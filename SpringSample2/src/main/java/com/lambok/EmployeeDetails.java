package com.lambok;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDetails {
    public static void main(String[] args) {
        List<Employee> lst=new ArrayList<Employee>();
        Employee employee1=new Employee(1,"Manideep",20000);
        Employee employee2=new Employee(2,"Vinay",18000);
        System.out.println(employee1);
        lst.add(employee1);
        lst.add(employee2);
        List<Employee> l=lst.stream()
                .sorted((e1,e2)->Integer.compare(e1.getSalary(),e2.getSalary()))
                .collect(Collectors.toList());
        l.forEach(e-> System.out.println(e));

//        Feature of Spring useRef
//                React.Memo
    }



}
