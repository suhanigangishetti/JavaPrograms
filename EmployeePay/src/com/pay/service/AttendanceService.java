package com.pay.service;
import java.util.Scanner;
import com.pay.model.Attendance;
public class AttendanceService {
	public void calculateAttendance(Scanner sc,Attendance attendance) {
		System.out.println("\n---ATTENDANCE CALCULATION---");
		System.out.println("enter total working days:");
		attendance.setTotalWorkingDays(sc.nextInt());
		
		if(attendance.getTotalWorkingDays() >0) {
			int pDays=0;
			int aDays=0;
			attendance.setPresentDays(0);
			attendance.setAbsentDays(0);
			
		for(int day=1;day<=attendance.getTotalWorkingDays(); day++) {
			System.out.print("Day"+ day +"- enter 1 for present, 0 for Absent:");
			int val=sc.nextInt();
			attendance.setCurrentDayAttendance(val);
			
			if(val==1) {
				pDays++;
				attendance.setPresentDays(pDays);
			}else if(val==0) {
				aDays++;
				attendance.setAbsentDays(aDays);
			}else {
				System.out.println("invalid input.not countrd as present/absent.");
			}
		}
		double percentage=((double) attendance.getPresentDays()/attendance.getTotalWorkingDays())*100;
		attendance.setAttendancePercentage(percentage);
		System.out.println("\n presentdays:"+attendance.getPresentDays());
		System.out.println("absentdays:"+attendance.getAbsentDays());
		System.out.println("attendance percentage:"+attendance.getAttendancePercentage());
		if(attendance.getAttendancePercentage()>=75) {
			System.out.println("attendance status:eligibe");
			
			
		}else {
			System.out.println("attendance status : not eligible");
		}
		}else {
			System.out.println("working days must be greater than zero");
		}
		
			
		}
		
	}

