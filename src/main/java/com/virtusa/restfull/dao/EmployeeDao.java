package com.virtusa.restfull.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.restfull.model.EmployeeRoot;
@Repository
public interface EmployeeDao extends JpaRepository<EmployeeRoot, Integer> {

}
