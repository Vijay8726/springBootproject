package com.virtusa.restfull.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.restfull.dao.EmployeeDao;
import com.virtusa.restfull.model.EmployeeRoot;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeedao;
	
	public EmployeeRoot add(EmployeeRoot emp)
	{
		return employeedao.save(emp);
	}
	public Optional<EmployeeRoot> get(int empid)
	{
		return employeedao.findById(empid);
	}
	public void deleteEmp(int empid)
	{
		employeedao.deleteById(empid);
	}
	public EmployeeRoot update(EmployeeRoot emp)
	{
		return employeedao.save(emp);
	}

}
