package com.jasper.jasperreport;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jasper.jasperreport.model.Employee;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@SpringBootApplication
public class JasperreportApplication {

	public static void main(String[] args) throws JRException {
		SpringApplication.run(JasperreportApplication.class, args);
		
//		String filePath = "C:\\Documents\\Project STS\\jasperreport\\src\\main\\resources\\templates\\main.jrxml";
//		String destPath = "C:\\Documents\\Project STS\\jasperreport\\src\\main\\resources\\static\\main.pdf";
//		Map<String, Object> param = new HashMap<String, Object>();
//		
//		param.put("empId", 1);
//		param.put("empName", "Josh1");
//		param.put("empDepartment", "IT");
//		param.put("empSalary", 12000);
//		
//		JasperReport report = JasperCompileManager.compileReport(filePath);
//		JasperPrint print = JasperFillManager.fillReport(report, param, new JREmptyDataSource());
//		JasperExportManager.exportReportToPdfFile(print, destPath);
//		
//		System.out.println("Report Generated Successfully");
	}
}
