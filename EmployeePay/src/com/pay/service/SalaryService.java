package com.pay.service;

import com.pay.model.Employee;
import com.pay.model.Attendance;
import com.pay.model.Salary;

public class SalaryService {
	public void calculateSalary(Employee employee,Attendance attendance,Salary salary) {
		System.out.println("\n---SALARY CALCULATION---");
		if(employee.getBasicSalary() > 0) {
			if (attendance.getTotalWorkingDays() > 0) {
				if(attendance.getAttendancePercentage() >=90) {
					salary.setIncentive(employee.getBasicSalary() * 0.10);
					salary.setDeduction(0);
		salary.setFinalSalary(employee.getBasicSalary() + salary.getIncentive());
		             System.out.println("Attendance Category: Excellent");
		             System.out.println("Attendance Incentive: 0%");
				}else if(attendance.getAttendancePercentage()>=75) {
					salary.setIncentive(0);
					salary.setDeduction(0);
					salary.setFinalsalary(employee.getBasicSalary());
					System.out.println("Attendance Category: Good");
					System.out.println("Attendance Incentive: 0%");
				}else {
					salary.setIncentive(0);
					salary.setDeduction(employee.getBasicSalary()*0.10);
			salary.setFinalsalary(employee.getBasicSalary()-salary.getDeduction());
			        System.out.println("Attendance Category: Low");
			        System.out.println("Attendance Incentive: 10%");
				}
			System.out.println("Basic Salary: Rs. " + employee.getBasicSalary());
			System.out.println("Final Salary: Rs. " + salary.getFinalsalary());
			}else {
				System.out.println("Please calculate attendance first.");
			}
		}else {
			System.out.println("Please enter valid employee details first.");
		}
	}

}

