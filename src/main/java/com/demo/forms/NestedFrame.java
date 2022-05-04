package com.demo.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.UiWebDriver.UiTestWebDriver;
import com.demo.pageclasses.NestedFrames;

public class NestedFrame {
	
	WebDriver driver;
	private NestedFrames nestedFrames;
	
	@BeforeClass
	public void setUp() {
		driver = UiTestWebDriver.getWebDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		nestedFrames = PageFactory.initElements(driver, NestedFrames.class);
	}

	@Test(priority=10)
	public void enterText() {
		nestedFrames.enterName("Hello");
	}
	
	@Test(priority=20)
	public void switchToFrame1() {
		nestedFrames.switchToFrm("Tutorials");
	}
	
	@AfterClass(enabled=true)
	public void cleanUp() {
		driver.quit();
	}
}
