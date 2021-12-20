package demo.springdemo.employeeproject.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.springdemo.employeeproject.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	List<Employee> getByName(String employeeName);
	Employee getById(int id);
	List<Employee> getByIdAndName(int id, String name);

}
