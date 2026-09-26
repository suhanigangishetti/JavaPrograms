package com.pay.model;

public class Attendance {
	int totalWorkingDays;
	int presentDays;
	int absentDays;
	double attendancePercentage;
	int currentDayAttendance;
	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}
	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}
	public int getPresentDays() {
		return presentDays;
	}
	public void setPresentDays(int presentDays) {
		this.presentDays = presentDays;
	}
	public int getAbsentDays() {
		return absentDays;
	}
	public void setAbsentDays(int absentDays) {
		this.absentDays = absentDays;
	}
	public double getAttendancePercentage() {
		return attendancePercentage;
	}
	public void setAttendancePercentage(double attendancePercentage) {
		this.attendancePercentage = attendancePercentage;
	}
	public int getCurrentDayAttendance() {
		return currentDayAttendance;
	}
	public void setCurrentDayAttendance(int currentDayAttendance) {
		this.currentDayAttendance = currentDayAttendance;
	}


}
