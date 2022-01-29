package com.baris0.EmployeeManagementSystem.dataAccess.abstracts;

import com.baris0.EmployeeManagementSystem.entities.concretes.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer> {
}
