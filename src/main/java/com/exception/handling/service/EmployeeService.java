package com.exception.handling.service;

import com.exception.handling.model.Employee;
import com.exception.handling.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        Employee createdEmployee = employeeRepository.save(employee);
        return  createdEmployee;
    }

    public Employee getEmployee(Integer id) {
        return employeeRepository.findById(id).get();
    }
}
