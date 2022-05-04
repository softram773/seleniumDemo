package com.demo.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileoperations {
	public static WebDriverWait wait;
	protected WebDriver driver;
	
	/*
	 * public void waitOperations(WebDriver driver) { wait = new
	 * WebDriverWait(driver, 40L); }
	 */
	public static void textFileUpload(WebDriver driver, WebElement element, String path) {
		wait = new WebDriverWait(driver, 40L);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(path);
	}
	}

