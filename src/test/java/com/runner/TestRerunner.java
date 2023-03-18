package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@src\\test\\resources\\Failed.txt"}, glue= {"com.stepdefinition"})
public class TestRerunner {

}