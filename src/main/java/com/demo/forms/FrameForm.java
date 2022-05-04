package com.demo.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.UiWebDriver.UiTestWebDriver;
import com.demo.pageclasses.IframesPage;

public class FrameForm {

	public WebDriver driver;
	private IframesPage iFrame;
	
	@BeforeClass
	public void setUp() {
		driver = UiTestWebDriver.getWebDriver();
		driver.get("https://qavbox.github.io/demo/");
		iFrame = PageFactory.initElements(driver, IframesPage.class);
	}
	
	@Test(priority=10)
	public void clickOnFrame() {
		iFrame.navigateFrame();
	}
	@Test(priority=30)
	public void clickOnLink() {
		iFrame.clickOnLinkText();
	}
	@Test(priority=20)
	public void enterUserName() {
		iFrame.enterName("Ramesh");
	}
	@Test(priority=40)
	public void mainHandel() {
		iFrame.ParentWindowHandell();
	}
	@Test(priority=50)
	public void allChildhandels() {
		iFrame.AllWindowHandel();
	}
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
}
