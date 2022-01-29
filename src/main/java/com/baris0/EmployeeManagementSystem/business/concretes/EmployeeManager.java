package com.baris0.EmployeeManagementSystem.business.concretes;

import com.baris0.EmployeeManagementSystem.business.abstracts.EmployeeService;
import com.baris0.EmployeeManagementSystem.dataAccess.abstracts.EmployeeDao;
import com.baris0.EmployeeManagementSystem.entities.concretes.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeManager implements EmployeeService {

    private final EmployeeDao employeeDao;

    @Override
    public void add(Employee employee) {
        this.employeeDao.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        final List<Employee> employees = this.employeeDao.findAll();
        return employees;
    }

    @Override
    public void deleteById(int id) {
        this.employeeDao.deleteById(id);
    }
}
