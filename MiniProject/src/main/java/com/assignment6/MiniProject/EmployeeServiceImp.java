package com.assignment6.MiniProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service

public class EmployeeServiceImp implements EmployeeService{
	
	List<Employee> EmployeeList;
	
	public EmployeeServiceImp() {
		
		EmployeeList = new ArrayList<Employee>();
		
		Employee dummyEmployee =new Employee(123,"Ramesh","Software Engineer");
		
		EmployeeList.add(dummyEmployee);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return EmployeeList;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		EmployeeList.add(employee);
		return employee;
	}

}
