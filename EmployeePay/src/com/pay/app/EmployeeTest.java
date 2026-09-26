package com.pay.app;

import java.util.Scanner;
import com.pay.model.Employee;
import com.pay.model.Attendance;
import com.pay.model.Salary;
import com.pay.service.EmployeeService;
import com.pay.service.AttendanceService;
import com.pay.service.SalaryService;


public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		Attendance attendance=new Attendance();
		Salary salary=new Salary();
		
		EmployeeService empService=new EmployeeService();
		AttendanceService attService=new AttendanceService();
		SalaryService salService=new SalaryService();
		
		int choice;
		do {
			System.out.println("\n==================================");
			System.out.println("EMPLOYEE ATTENDANCE & PAYROLL SYSTEM");
			System.out.println("====================================");
			System.out.println("1.enter employee detais");
			System.out.println("2.calculate attendance");
			System.out.println("3.calculate salary");
			System.out.println("4.display employee details");
			System.out.println("5.exit");
			System.out.println("-------------------------------------");
			System.out.println("enter choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				empService.enterEmpployeeDetails(sc,employee);
				break;
			case 2:
				attService.calculateAttendance(sc, attendance);
			    break;
			case 3:
				salService.calculateSalary(employee, attendance, salary);
				break;
			case 4:
				empService.displayEmployeeDetailse(employee, attendance, salary);
				break;
			case 5:
				System.out.println("\nthankyou for using the system");
				break;
				default:
					System.out.println("Invalid menu choice . please enter 1 to 5");
					
					
			}
			}while(choice!=5);
		sc.close();
		
		
	}

}
