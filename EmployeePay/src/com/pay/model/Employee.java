package com.pay.model;

public class Employee {
	int employeeId;
	String employeeName;
	String department;
	int departmentChoice;
	double basicSalary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getDepartmentChoice() {
		return departmentChoice;
	}
	public void setDepartmentChoice(int departmentChoice) {
		this.departmentChoice = departmentChoice;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
