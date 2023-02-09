package com.assignment6.MiniProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	
	@GetMapping("Is Alive")
	
	String isAlive() {
		
		return "Server is Up";
		
	}
	
	@PostMapping("/addEmployee")
	
	String addEmployee(@RequestBody Employee employee ) {
		return EmployeeServiceImp.addEmployee(employee).toString();
	}
	
	@Autowired
	
	private EmployeeServiceImp employeeServiceImp;
	
	@GetMapping("/createEmployee")
	
	List<Employee> createEmployee(){
		return employeeServiceImp.getAllEmployee();
		
	}

}
