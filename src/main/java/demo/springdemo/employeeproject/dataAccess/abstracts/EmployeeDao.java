package demo.springdemo.employeeproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.springdemo.employeeproject.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{}
