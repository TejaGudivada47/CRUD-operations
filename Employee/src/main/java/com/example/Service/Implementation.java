package com.example.Service;
import java.util.List;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Employee;

import com.example.Reposistory.EmployeeRepository;

public class Implementation implements EmpRepo {
	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee emp) {
		
		return repo.save(emp);
	}

	@Override
	public List<Employee> getAllElmpoyees() {
		
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(long EmployeeId) {
		
		return repo.findById(EmployeeId).get();
	}

	@Override
	public Employee updateEmployee(long EmployeeId, Employee emp) {
		Employee e = repo.findById(EmployeeId).get();
		if(Objects.nonNull(emp.getEmployeeName()) && !"".equalsIgnoreCase(null)) {
			e.setEmployeeName(emp.getEmployeeName());
		}
		if(Objects.nonNull(emp.getSalary()) && !"".equalsIgnoreCase(null)) {
			e.setSalary(emp.getSalary());
		}
		if(Objects.nonNull(emp.getDateofjoining()) && !"".equalsIgnoreCase(null)) {
			e.setDateofjoining(emp.getDateofjoining());
		}
		if(Objects.nonNull(emp.getDepartment()) && !"".equalsIgnoreCase(null)) {
			e.setDepartment(emp.getDepartment());
		}
		return e;
	}

	@Override
	public void deleteEmployee(long EmployeeId) {
		repo.deleteById(EmployeeId);
		
	}

}


