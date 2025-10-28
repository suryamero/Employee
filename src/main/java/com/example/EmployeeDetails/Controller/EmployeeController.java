package com.example.EmployeeDetails.Controller;

import com.example.EmployeeDetails.Model.Employee;
import com.example.EmployeeDetails.Serivice.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeController {

    private final EmployeeService employeeService;

public EmployeeController(EmployeeService  employeeService) {

    this.employeeService = employeeService;
}


@PostMapping
        public Employee save(@RequestBody Employee employee){
    return employeeService.save(employee);
    }


    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @DeleteMapping("{/employeeId}")
    public void delete(@PathVariable String employeeId){
    employeeService.delete (employeeId);
    }
}

