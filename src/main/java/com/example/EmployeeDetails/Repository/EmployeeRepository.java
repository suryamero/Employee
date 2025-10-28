package com.example.EmployeeDetails.Repository;

import com.example.EmployeeDetails.Model.Employee;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee,String> {

    List<Employee> findByFirstName(String FirstName);



}
