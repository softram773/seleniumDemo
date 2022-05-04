package com.demo.UiWebDriver;

import org.openqa.selenium.WebDriver;

public class UiTestWebDriver {
	/*
	 * public UiTestWebDriver() {
	 * 
	 * }
	 */
	public static WebDriver getWebDriver() {
		TestWebDriver driver = new TestWebDriver();
		driver.getInstance();
		//System.out.println("Checking driver :: " + driver.getWebDriver());
		return driver.getWebDriver();
	}

}
