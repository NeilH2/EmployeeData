package com.example.codeclan.employeeData;

import com.example.codeclan.employeeData.models.Employee;
import com.example.codeclan.employeeData.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeDataApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired // NEW
	EmployeeRepository employeeRepository;

	@Test
	public void createEmployee(){ // NEW
		Employee dave = new Employee("Dave", 32, "HYH6726","dave@gmail.com");
		employeeRepository.save(dave);
	}

}
