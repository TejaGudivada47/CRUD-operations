package com.example.Service;

import java.util.List;

import com.example.model.Employee;

public interface EmpRepo {
	Employee addEmployee(Employee emp);
	 List<Employee> getAllElmpoyees();
	 Employee getEmployeeById(long EmployeeId);
	 Employee updateEmployee(long EmployeeId, Employee emp);
	 void deleteEmployee(long EmployeeId);
	}

