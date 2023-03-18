package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;

public class FacebookLogin extends BaseClass {
	public FacebookLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtuserName;

	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnClick;
	
	@FindBy(xpath="//div[contains(text(),'entered is incorrect')]")
	private WebElement verifyHomePage;

	public WebElement getTxtuserName() {
		return txtuserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getVerifyHomePage() {
		return verifyHomePage;
	}
	
}
