package com.demo.UiWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestWebDriver {

	private WebDriver driver = null;
	private TestWebDriver instance = null;
	
	public TestWebDriver getInstance() {
		System.setProperty("webdriver.chrome.driver", "G:\\Automation\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.instance = new TestWebDriver();
		return this.instance;
		
	}
	public WebDriver getWebDriver() {
		return this.driver;
	}
	
}
