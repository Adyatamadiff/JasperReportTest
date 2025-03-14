package com.jasper.jasperreport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jasper.jasperreport.model.Employee;

@Repository
public interface EmployeeReportRepo extends JpaRepository<Employee, Long>{
	
	public Employee findEmployeeByEmpId(Long id);
	
}