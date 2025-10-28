package com.example.EmployeeDetails.Serivice;

import com.example.EmployeeDetails.Model.Employee;
import com.example.EmployeeDetails.Repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
        public Employee save(Employee employee)
        {
            return employeeRepository.save(employee);
        }
        public List<Employee> getAll()
    {
        return employeeRepository.findAll();
    }
    public void delete(String employeeId)
        {
            employeeRepository.deleteById(employeeId);
        }
    }

