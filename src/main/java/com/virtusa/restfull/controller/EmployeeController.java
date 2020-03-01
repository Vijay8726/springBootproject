package com.virtusa.restfull.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.restfull.model.EmployeeRoot;
import com.virtusa.restfull.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	@PostMapping(value="/add")
	public String addEmployee(@RequestBody EmployeeRoot emp)
	{
		employeeservice.add(emp);
		return "inserted";
	}
	@GetMapping(value="/add/{id}")
	public Optional<EmployeeRoot> getEmpId(@PathVariable("id") int empid )
	{
		return employeeservice.get(empid);
	}
	@DeleteMapping(value="/add/{id}")
	public String deleteEmp(@PathVariable("id") int empid)
	{
		employeeservice.deleteEmp(empid);
		return "deleted..";
	}
	@PutMapping(value="/add/{id}")
	public String updateEmployee(@PathVariable("id") int empid,@RequestBody EmployeeRoot emp)
	{
		employeeservice.add(emp);
		return "updated...";
	}

}
