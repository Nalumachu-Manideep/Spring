package com.springdto.application;

import com.springdto.controller.EmployeeController;
import com.springdto.dto.EmployeeDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class SpringDtoApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        EmployeeController employeeController = context.getBean(EmployeeController.class);

        EmployeeDTO newEmployee = new EmployeeDTO();
        newEmployee.setId(1L);
        newEmployee.setFullName("John Doe");
        newEmployee.setAge(30);
        employeeController.addEmployee(newEmployee);

        EmployeeDTO newEmployee2 = new EmployeeDTO();
        newEmployee2.setId(2L);
        newEmployee2.setFullName("Jane Smith");
        newEmployee2.setAge(25);
        employeeController.addEmployee(newEmployee2);

        // Get all employees
        List<EmployeeDTO> allEmployees = employeeController.getAllEmployees();
        for (EmployeeDTO employee : allEmployees)
            log.info("Employee: {}, Age: {}", employee.getFullName(), employee.getAge());

        // Get an employee by ID
        EmployeeDTO employee = employeeController.getEmployeeById(1L);
        if (employee != null) {
            log.info("Found Employee: {}, Age: {}", employee.getFullName(), employee.getAge());
        }
    }
}
