package com.assignment6.MiniProject;

public class Employee {

	private String empName;
	
	private int empId;
	
	Employee(){}
	
	Employee(int empId, String empName, String empRole){
		
		this.empId=empId;
		this.empName=empName;
		this.empRole=empRole;
	}
	
	public String toString() {
		
		return "id: "+this.empId+" name: "+this.empName+" Role: "+this.empRole;
		
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	private String empRole;
	
}
