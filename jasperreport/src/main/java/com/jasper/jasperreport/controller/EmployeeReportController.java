package com.jasper.jasperreport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasper.jasperreport.model.Employee;
import com.jasper.jasperreport.service.EmployeeReportService;


@RestController
@RequestMapping("/employee")
public class EmployeeReportController {
	
	@Autowired
	EmployeeReportService employeeReportService;

	@RequestMapping("/generateReport")
	public String getEmployeeReport () throws Exception {
		
		/* Stored in src/main/resources/static */
		
		return employeeReportService.generateEmployeeReport();
	}
}