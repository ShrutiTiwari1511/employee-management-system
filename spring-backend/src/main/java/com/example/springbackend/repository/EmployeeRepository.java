package com.example.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springbackend.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
