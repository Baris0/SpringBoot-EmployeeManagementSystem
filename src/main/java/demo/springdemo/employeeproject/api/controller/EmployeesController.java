package demo.springdemo.employeeproject.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.springdemo.employeeproject.business.abstracts.EmployeeService;
import demo.springdemo.employeeproject.core.results.DataResult;
import demo.springdemo.employeeproject.core.results.Result;
import demo.springdemo.employeeproject.core.results.SuccessDataResult;
import demo.springdemo.employeeproject.entities.concretes.Employee;
import net.bytebuddy.asm.Advice.This;

@RestController
@RequestMapping("/api/employees/")
public class EmployeesController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Employee>> getAll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Employee employee) {
		return this.employeeService.add(employee);
	}
	
	@GetMapping("getByEmployeeName")
	public DataResult<List<Employee>> getByEmployeeName(@RequestParam String name){
		return this.employeeService.getByName(name);
	}
	
	@GetMapping("getByEmployeeId")
	public DataResult<Employee> getById(@RequestParam int id){
		return this.employeeService.getById(id);
	}
	
	@GetMapping("getByEmployeeIdAndName")
	public DataResult<List<Employee>> getByIdandName(@RequestParam int id, String name){
		return this.employeeService.getByIdAndName(id, name);
	}
	
	
	
}
