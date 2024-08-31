package com.springdto.service;

import com.springdto.dto.EmployeeDTO;
import com.springdto.model.Employee;
import com.springdto.repositary.EmployeeRepositary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepositary employeeRepositary;

    public EmployeeServiceImpl(EmployeeRepositary employeeRepositary) {
        this.employeeRepositary = employeeRepositary;
    }

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepositary.findAllEmployees();
        logger.info("GetAllEmployees is executed successfully..");
        return employees.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        logger.trace("GetEmployeeById traced...");
        Employee employee = employeeRepositary.findById(id);
        return employee != null ? convertToDTO(employee) : null;
    }

    @Override
    public void addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = convertToEntity(employeeDTO);
        employeeRepositary.save(employee);
    }

    public EmployeeDTO convertToDTO(Employee employee) {
        // Combine firstName and lastName to fullName
        String fullName = employee.getFirstName() + " " + employee.getLastName();
        // Calculate age from DOB
        int age = calculateAge(employee.getDOB());
        return new EmployeeDTO(employee.getId(), fullName, age);
    }

    public Employee convertToEntity(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        String[] names = employeeDTO.getFullName().split(" ");
        if (names.length > 1) {
            employee.setFirstName(names[0]);
            employee.setLastName(names[1]);
        } else {
            employee.setFirstName(names[0]);
            employee.setLastName(""); // Set lastName as empty if not provided
        }
        // Assuming age is the only available information to estimate DOB
        employee.setDOB(LocalDate.now().minusYears(employeeDTO.getAge()));
        return employee;
    }

    private int calculateAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
