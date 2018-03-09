package com.esysleyva.springbootjpah2.services.impl;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esysleyva.springbootjpah2.entities.Employee;
import com.esysleyva.springbootjpah2.repository.EmployeeRepository;
import com.esysleyva.springbootjpah2.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostConstruct
	private void init() {
		employeeRepository.save(new Employee("Miguel", "Leyva"));
		employeeRepository.save(new Employee("Elvira", "Guadalupe"));
		employeeRepository.save(new Employee("Valerio", "Malca"));
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeRepository.saveAndFlush(employee);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(Long id) {
		Optional<Employee> result = employeeRepository.findById(id);
		return result.get();
	}

	@Override
	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}

}
