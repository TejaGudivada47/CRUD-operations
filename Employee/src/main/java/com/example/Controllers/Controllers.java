package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.Service.Implementation;

@RestController
public class Controllers {
	
	@Autowired
	Implementation service;
	
	@PostMapping("/Employee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	@GetMapping("/Employee")
	public List<Employee> getAllEmployees(){
		return service.getAllElmpoyees();
	}
	
	@GetMapping("/Employee/{EmployeeId}")
	public Employee getEmployeeId(@PathVariable("EmployeeId") long EmployeeId ) {
		return service.getEmployeeById(EmployeeId);
	}
	
	@PutMapping("/Employee/{EmployeeId}")
	public Employee update(@PathVariable("EmployeeId") long EmployeeId,@RequestBody Employee emp) {
		return service.updateEmployee(EmployeeId,emp);
	}
	
	@DeleteMapping("/Employee/{EmployeeId}")
	public void delete(@PathVariable("EmployeeId") long EmployeeId) {
		service.deleteEmployee(EmployeeId);
	}
}
