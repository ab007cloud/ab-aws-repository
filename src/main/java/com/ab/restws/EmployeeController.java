package com.ab.restws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping("/employees")
	public Employee getEmployees() {
		return new Employee("100", "Avishek", "1234567890");

	}

}
