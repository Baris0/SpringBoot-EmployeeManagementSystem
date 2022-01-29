package com.baris0.EmployeeManagementSystem.business.abstracts;

import com.baris0.EmployeeManagementSystem.entities.concretes.Company;

import java.util.List;

public interface CompanyService {
    void add(Company company);
    List<Company> getAll();
    void deleteById(int id);
}
