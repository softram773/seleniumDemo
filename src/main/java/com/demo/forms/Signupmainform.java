package com.demo.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.UiWebDriver.UiTestWebDriver;
import com.demo.pageclasses.SignUpForm;

public class Signupmainform {

	public WebDriver driver;
	private SignUpForm signupform;
	private String filePath = "C:\\Users\\amram\\workspace\\practiceparallel\\src\\main\\resource\\profile.txt";
	
	@BeforeClass
	public void setup() {
		driver = UiTestWebDriver.getWebDriver();
		driver.get("https://qavbox.github.io/demo/");
		signupform = PageFactory.initElements(driver, SignUpForm.class);
				
	}
	
	@Test(priority=10)
	public void clickOnSignUpForm() {
		signupform.clickOnSignUpForm();
	}
	
	@Test(priority=20)
	public void enterUserName() {
		signupform.enterFullName("Ramesh");
	}
	@Test(priority=30)
	public void enterEmailID() {
		signupform.enterEmailID("noreplay@gmail.com");
	}
	
	@Test(priority=40)
	public void enterTelePhoneNumber() {
		signupform.enterTelephoneNumber(8095131187l);
	}
	
	@Test(priority=50)
	public void enterFaxNum() {
		signupform.enterFaxNumber(123456789l);
	}
	@Test(priority=60)
	public void uploadFile() {
		signupform.uploadFile(filePath);
	}
	
	@Test(priority=70)
	public void selectGender() {
		signupform.selectGender("Male");
	}
	
	@Test(priority=80)
	public void selectYearsOfExp() {
		signupform.selectYearOfExperience();
	}
	
	@Test(priority=90)
	public void selectSkills() {
		signupform.selectSkills();
	}
	
	@Test(priority=100)
	public void selectAutomationTool() {
		signupform.selectAutomationTool("Selenium");
	}
	
	@Test(priority=110, enabled=false, description="xpath is not working")
	public void validateText() {
		signupform.checkText();
	}
	
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
}
