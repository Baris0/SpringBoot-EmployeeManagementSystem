package demo.springdemo.employeeproject.business.abstracts;

import java.util.List;

import demo.springdemo.employeeproject.core.results.DataResult;
import demo.springdemo.employeeproject.core.results.Result;
import demo.springdemo.employeeproject.entities.concretes.Employee;

public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	Result add(Employee employee);
	DataResult<List<Employee>> getByName(String employeeName);
	DataResult<Employee> getById(int id);
	DataResult<List<Employee>> getByIdAndName(int id, String name);
}
