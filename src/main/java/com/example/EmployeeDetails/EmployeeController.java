package com.example.EmployeeDetails;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    Employee employee;

    @GetMapping("{employeeId}")
    public Employee getEmployeeDetails(String employeeId) {
        return employee;
                //new Employee("Employee:1","FirstName","LastName","email","phone number");
    }
    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        this.employee = employee;
        return "employee details successfully created";
    }

@PutMapping
    public String updateEmployee(@RequestBody Employee employee) {
    this.employee = employee;
    return "employee  details successfully updated";
}
@DeleteMapping("{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId) {
        return "delete employee with id: " + employeeId;
}
}
