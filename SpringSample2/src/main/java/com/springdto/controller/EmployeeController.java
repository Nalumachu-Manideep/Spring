package com.springdto.controller;

import com.springdto.dto.EmployeeDTO;
import com.springdto.service.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {

    private EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    public  EmployeeDTO getEmployeeById(Long id){
        return employeeService.getEmployeeById(id);
    }

    public void addEmployee(EmployeeDTO employeeDTO){
        employeeService.addEmployee(employeeDTO);
    }

}
