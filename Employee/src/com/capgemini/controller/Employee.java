package com.capgemini.controller;

public class Employee {
	private int empId;
private String empName;
private double salary;
private String deptName;

public Employee() {
	super();
}

public Employee(int empId, String empName, double salary, String deptName) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
	this.deptName = deptName;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}



}
