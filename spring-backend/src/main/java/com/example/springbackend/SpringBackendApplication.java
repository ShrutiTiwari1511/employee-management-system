package com.example.springbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.springbackend.model.Employee;
import com.example.springbackend.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
        // Employee employee = new Employee();
        // employee.setFirstName("Ramesh");
        // employee.setLastName("Lal");
        // employee.setEmailId("rameshlal@gmail.com");
        // employeeRepository.save(employee);

        // Employee employee1 = new Employee();
        // employee1.setFirstName("Josh");
        // employee1.setLastName("Elaine");
        // employee1.setEmailId("Josh@gmail.com");
        // employeeRepository.save(employee1);
    }
}



