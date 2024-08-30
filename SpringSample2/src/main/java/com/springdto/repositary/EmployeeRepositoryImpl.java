package com.springdto.repositary;

import com.springdto.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepositary {

    private List<Employee> employees=new ArrayList<>();
    @Override
    public List<Employee> findAllEmployees() {
        return employees;
    }

    @Override
    public Employee findById(Long id) {
        return employees.stream()
                .filter(book ->book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);

    }
}
