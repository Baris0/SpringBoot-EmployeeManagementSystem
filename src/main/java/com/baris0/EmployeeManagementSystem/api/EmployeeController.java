package com.baris0.EmployeeManagementSystem.api;

import com.baris0.EmployeeManagementSystem.business.abstracts.EmployeeService;
import com.baris0.EmployeeManagementSystem.core.concretes.shared.GenericResponse;
import com.baris0.EmployeeManagementSystem.entities.concretes.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody @Valid Employee employee) {
        this.employeeService.add(employee);
        return ResponseEntity.ok(new GenericResponse("Employee Saved."));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAll() {
        final List<Employee> employees = employeeService.getAll();
        return ResponseEntity.ok(employees);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        this.employeeService.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }


}
