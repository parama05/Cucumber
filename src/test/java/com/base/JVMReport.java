package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonFile) {
		File reportloc = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Results");
		Configuration configuration = new Configuration(reportloc, "FacebookWebApp");
		
		configuration.addClassifications("platformName", "Windows");
		configuration.addClassifications("PlatformVersion", "10");
		configuration.addClassifications("buildNo", "64788");
		configuration.addClassifications("sprint", "12");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
	}

}
