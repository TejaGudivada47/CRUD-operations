package com.example.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Employee {
@Id
@SequenceGenerator(
		initialValue = 1001,
		allocationSize = 1,
		sequenceName = "es",
		name="es"
		)
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="es")
private long EmployeeId;
private String EmployeeName;
private long salary;
private Date dateofjoining;
private String department;

public Employee() {}

public Employee(long employeeId, String employeeName, long salary, Date dateofjoining, String department) {
	super();
	EmployeeId = employeeId;
	EmployeeName = employeeName;
	this.salary = salary;
	this.dateofjoining = dateofjoining;
	this.department = department;
}

@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", salary=" + salary
			+ ", dateofjoining=" + dateofjoining + ", department=" + department + "]";
}

public long getEmployeeId() {
	return EmployeeId;
}
public void setEmployeeId(long employeeId) {
	EmployeeId = employeeId;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public Date getDateofjoining() {
	return dateofjoining;
}
public void setDateofjoining(Date dateofjoining) {
	this.dateofjoining = dateofjoining;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
}
