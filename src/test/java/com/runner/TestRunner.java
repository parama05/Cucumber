package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features", glue = "com.stepdefinition", dryRun = false, monochrome = true, plugin = {
 		"html:src\\test\\resources\\Results", "json:src\\test\\resources\\Results\\sample1.json", "rerun:src\\test\\resources\\Failed.txt" })
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Results\\sample1.json");
	}
}