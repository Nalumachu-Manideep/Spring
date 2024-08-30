package com.springdto.repositary;

import com.springdto.model.Employee;

import java.util.List;

public interface EmployeeRepositary {
    public List<Employee> findAllEmployees();

    public Employee findById(Long id);

    public void save(Employee employee);

}
