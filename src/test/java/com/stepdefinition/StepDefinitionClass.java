package com.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.pojo.FacebookLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BaseClass {

	public static WebDriver driver;
	FacebookLogin fb;

	@Given("User launch Facebook Web Application")
	public void user_launch_Facebook_Web_Application() {

	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		fb = new FacebookLogin();
		insertText(fb.getTxtuserName(), "paramaguru");
		insertText(fb.getTxtpassword(), "12345");
	}

	@When("User clicks login Button")
	public void user_clicks_login_Button() {
		fb = new FacebookLogin();
		btnClick(fb.getBtnClick());
	}

	@Then("User verify Home Page is displayed")
	public void user_verify_Home_Page_is_displayed() {
		fb = new FacebookLogin();
		String text = fb.getVerifyHomePage().getText();
		boolean contains = text.contains("incorrect");
		System.out.println(contains);
		System.out.println(text);
	}

	@When("User enters invalid {string} and invalid {string}")
	public void user_enters_invalid_and_invalid(String username, String password) {
		fb = new FacebookLogin();
		insertText(fb.getTxtuserName(), username);
		insertText(fb.getTxtpassword(), password);
	}

	@Then("User verify error message is displayed")
	public void user_verify_error_message_is_displayed() {
		fb = new FacebookLogin();
		String text2 = fb.getVerifyHomePage().getText();
		boolean contains = text2.contains("incorrect");
		System.out.println(contains);
		System.out.println(text2);
	}

}
