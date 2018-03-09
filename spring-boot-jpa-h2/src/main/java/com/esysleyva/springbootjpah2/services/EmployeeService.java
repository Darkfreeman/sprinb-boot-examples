package com.esysleyva.springbootjpah2.services;

import java.util.List;

import com.esysleyva.springbootjpah2.entities.Employee;

public interface EmployeeService {
	public void save(Employee employee);
	public void update(Employee employee);
	public List<Employee> findAll();
	public Employee findById(Long id);
	public void delete(Long id);
}
