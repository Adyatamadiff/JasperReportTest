package com.jasper.jasperreport.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jasper.jasperreport.dao.EmployeeReportDao;
import com.jasper.jasperreport.model.Employee;
import com.jasper.jasperreport.repository.EmployeeReportRepo;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class EmployeeReportService implements EmployeeReportDao{

	@Autowired
	EmployeeReportRepo employeeReportRepo;

	@Override
	public String generateEmployeeReport() throws Exception {
		List<Employee> listEmp = employeeReportRepo.findAll();
		
		System.out.println(listEmp);
		
		// Needed to change the path
		
		String filePath = "C:\\Documents\\Project STS\\jasperreport\\src\\main\\resources\\templates\\main.jrxml";
		String destPath = "C:\\Documents\\Project STS\\jasperreport\\src\\main\\resources\\static\\main.pdf";
		Map<String, Object> param = new HashMap<String, Object>();
		
		try {
			JRBeanCollectionDataSource employeeDataSource = new JRBeanCollectionDataSource(listEmp);
			
			param.put("EmployeeDataSet", employeeDataSource);
			
			JasperReport report = JasperCompileManager.compileReport(filePath);
			JasperPrint print = JasperFillManager.fillReport(report, param, new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(print, destPath);
			
			return "Report Generated Successfully";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Report Failed to Generate";
		}
	}
}