package com.stepdefinition;

import com.base.BaseClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseClass {
	@Before
	public void beforeExecution(){
		launchBrowser();
		maxiWindow();
		loadUrl("https://www.facebook.com/");

	}
	@After
	public void afterExecution(Scenario sc) {
		takeScreenshot(sc);
		quitBrowser();
		
		
	}

}
