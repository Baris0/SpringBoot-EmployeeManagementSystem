package com.baris0.EmployeeManagementSystem.business.concretes;

import com.baris0.EmployeeManagementSystem.business.abstracts.CompanyService;
import com.baris0.EmployeeManagementSystem.dataAccess.abstracts.CompanyDao;
import com.baris0.EmployeeManagementSystem.entities.concretes.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyManager implements CompanyService {

    private final CompanyDao companyDao;

    @Override
    public void add(Company company) {
        this.companyDao.save(company);
    }

    @Override
    public List<Company> getAll() {
        final List<Company> companies = this.companyDao.findAll();
        return companies;
    }

    @Override
    public void deleteById(int id) {
        this.companyDao.deleteById(id);
    }
}
