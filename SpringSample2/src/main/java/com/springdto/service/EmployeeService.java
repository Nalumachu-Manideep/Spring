package com.springdto.service;

import com.springdto.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeDTO> getAllEmployees();

    public EmployeeDTO getEmployeeById(Long id);
    public void addEmployee(EmployeeDTO employeeDTO);
}
