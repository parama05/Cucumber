package com.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	public void maxiWindow() {
		driver.manage().window().maximize();

	}
	public void loadUrl(String Url) {
		driver.get(Url);
	}
	public void insertText(WebElement e, String data) {
		e.sendKeys(data);
	}
	public void btnClick(WebElement e) {
		e.click();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void takeScreenshot(Scenario sc) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] bs = ts.getScreenshotAs(OutputType.BYTES);
		sc.embed(bs, "image/png");

	}
		
}
