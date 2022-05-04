package com.demo.alert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.UiWebDriver.UiTestWebDriver;

import com.demo.pageclasses.AlertPage;

public class AlertDemo {

	public WebDriver driver;
	private AlertPage alertpage;
	
	@BeforeClass
	public void setUp() {
		driver = UiTestWebDriver.getWebDriver();
		driver.get("https://demoqa.com/alerts");
		alertpage = PageFactory.initElements(driver, AlertPage.class);
	}
	
	@Test(priority=10, enabled=true)
	public void acceptButtonOk() {
		alertpage.clickoNOkButton();
		alertpage.acceptOk();
	}
	
	 @Test(priority=20, enabled=true)
	 public void acceptAfter5Sec() throws InterruptedException {
		 alertpage.clickOnAlertButton();
		 alertpage.acceptAfter5sec();
	  }
	 
	 @Test(priority=30, enabled=true)
	 public void dismissButton() throws InterruptedException {
		 alertpage.confirmMsgButton();
		 Thread.sleep(5000);
		 alertpage.cancelButton();
	 }
	 @Test(priority=40, enabled=true)
	 public void promptButton() throws InterruptedException {
		 alertpage.prmptButtonAndUserName();
		 alertpage.enterUserName();
		 
	 }
	@AfterClass(enabled=true)
	public void cleanUp() {
		driver.quit();
	}
}
