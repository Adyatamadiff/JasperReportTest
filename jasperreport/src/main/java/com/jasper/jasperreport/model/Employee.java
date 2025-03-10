package com.jasper.jasperreport.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity	
@Table(name = "EMPLOYEE")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
	
	@Id
	@Column(name = "EMPID")
	private Long empId;
	
	@Column(name = "EMPNAME")
	private String empName;
	
	@Column(name = "DEPARTMENT")
	private String empDepartment;
	
	@Column(name = "SALARY")
	private Double empSalary;
	
	public Employee () {}

	public Employee(Long empId, String empName, String empDepartment, Double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empSalary = empSalary;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
}