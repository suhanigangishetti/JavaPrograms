package com.pay.service;

import java.util.Scanner;
import com.pay.model.Employee;
import com.pay.model.Attendance;
import com.pay.model.Salary;

public class EmployeeService {
	public void enterEmpployeeDetails(Scanner sc,Employee employee) {
		System.out.println("\n--- ENTER EMPLOYEE DETAILS---");
		System.out.println("ENTER EMPLOYEE ID:");
		employee.setEmployeeId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Emter employee name: ");
		employee.setEmployeeName(sc.nextLine());
		
		System.out.println("\nSelect Department:");
		System.out.println("1.IT");
		System.out.println("2.HR");
		System.out.println("3.Finance");
		System.out.println("4.Marketing");
		System.out.println("enter department choice:");
		
		employee.setDepartmentChoice(sc.nextInt());
		
		switch (employee.getDepartmentChoice()) {
		case 1:employee.setDepartment("IT");break;
		case 2:employee.setDepartment("HR");break;
		case 3:employee.setDepartment("Finance");break;
		case 4:employee.setDepartment("Marketing");break;
		default:
			employee.setDepartment("Unknown");
			System.out.println("invalid departmennt choice.");
			
		
		}
		System.out.print("enter basic salary:");
		employee.setBasicSalary(sc.nextDouble());
		
		if (employee.getBasicSalary()>0) {
			System.out.println("Employee details entered successfully");
			
		}
		else {
			System.out.println("invalid salary.salary must be greater than zero");
			
		}
		
		
	}
	public void displayEmployeeDetailse(Employee employee,Attendance attendance,Salary salary) {
		System.out.println("\n---EMPLOYEE DETAILS---");
		if(employee.getEmployeeId()!=0){
			System.out.println("Employee Id:"+ employee.getEmployeeId());
			System.out.println("Employee Name:"+ employee.getEmployeeName());
			System.out.println("Department:"+ employee.getDepartment());
			System.out.println("Basic Salary  : rs. "+ employee.getBasicSalary());
			System.out.println("Present Days:"+ attendance.getPresentDays());
			System.out.println("Absent days:"+ attendance.getAbsentDays());
			System.out.println("attendance percentage:"+ attendance.getAttendancePercentage()+"%");
			System.out.println("Final Salary :rs."+salary.getFinalsalary());
		}else {
			System.out.println("no employee detaiks available.");
					
		}
	}

}
