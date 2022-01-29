package com.baris0.EmployeeManagementSystem.business.abstracts;

import com.baris0.EmployeeManagementSystem.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    void add(Employee employee);
    List<Employee> getAll();
    void deleteById(int id);
}
