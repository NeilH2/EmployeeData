package com.example.codeclan.employeeData.repositories;

import com.example.codeclan.employeeData.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
