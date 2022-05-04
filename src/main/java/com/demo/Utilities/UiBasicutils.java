package com.demo.Utilities;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UiBasicutils {
	public WebDriverWait wait;
	protected WebDriver driver;
	
	public UiBasicutils(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 40L);
	}
	public void toDefaultContent() {
		this.driver.switchTo().defaultContent();
	}

	public void selectSingelItemFromDropDown(String dropDownItem, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(dropDownItem);
	}
	public void selectRadioButton(WebElement element) {
		this.wait.until(ExpectedConditions.visibilityOf(element));
		if(!isSelected(element))
			element.click();
		else System.out.println("Already Selected");
	}
	public Select dropDown(WebElement element) {
		Select sel = new Select(element);
		return sel;
	}
	public void selectCheckBox(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		if(!isSelected(element))
			element.click();
		else System.out.println("Already Selected");
	}
	public String getParentWindowHandel() {
		return driver.getWindowHandle();
	}
	public Set<String> getAllWindowHandels(){
		return driver.getWindowHandles();
	}
	public void sendKeys(WebElement element, String input) {
		element.sendKeys(input);
	}
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchFrameByWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public Alert alertAccept() {
		Alert simpleAlert = driver.switchTo().alert();
		return simpleAlert;
	}

	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	public static boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}
	public static boolean isSelected(WebElement element) {
		return element.isSelected();
	}
	
}
