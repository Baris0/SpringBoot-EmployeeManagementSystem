package com.baris0.EmployeeManagementSystem.api;

import com.baris0.EmployeeManagementSystem.business.abstracts.CompanyService;
import com.baris0.EmployeeManagementSystem.core.concretes.shared.GenericResponse;
import com.baris0.EmployeeManagementSystem.entities.concretes.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companys")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Company company) {
        this.companyService.add(company);
        return ResponseEntity.ok(new GenericResponse("Company Saved."));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Company>> getAll() {
        final List<Company> companies = this.companyService.getAll();
        return ResponseEntity.ok(companies);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        this.companyService.deleteById(id);
        return ResponseEntity.ok(new GenericResponse("Company Deleted."));
    }

}
