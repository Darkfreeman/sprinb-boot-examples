package com.esysleyva.springbootjpah2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esysleyva.springbootjpah2.entities.Employee;
import com.esysleyva.springbootjpah2.services.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmployees() {
		return employeeService.findAll(); 
	}
	
	@PostMapping
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
	}
	
	@PutMapping
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.update(employee);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.delete(id);
	}
	
	@GetMapping(value="/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.findById(id);
	}
}
