package com.esysleyva.springbootjpah2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esysleyva.springbootjpah2.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
