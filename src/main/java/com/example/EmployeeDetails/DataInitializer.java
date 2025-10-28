package com.example.EmployeeDetails;

import com.example.EmployeeDetails.Model.Employee;
import com.example.EmployeeDetails.Repository.EmployeeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataInitializer implements CommandLineRunner {

    private final EmployeeRepository repo;

    public DataInitializer(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        if (repo.findByFirstName("Fathima").isEmpty()) {
            Employee s1 = new Employee();
            s1.setFirstName("Fathima");
            s1.setLastName("Augustin");
            s1.setEmail("suryamero@gmail.com");
            s1.setEmployeeId("2");
            s1.setPhoneNumber("298943857");
            repo.save(s1);
            System.out.println("✅ Fathima inserted");
        }
    }

}
