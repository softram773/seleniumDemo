package com.demo.pageclasses;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.demo.Utilities.UiBasicutils;

public class IframesPage extends UiBasicutils{

	public IframesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//a[text()='iFrames']")
	private WebElement frameForm;
	
	@FindBy(how=How.XPATH, using="//a[text()='Pavilion']")
	private WebElement linkText;
	
	@FindBy(how=How.ID, using="input1")
	private WebElement enterYourName;
	
	public void navigateFrame() {
		frameForm.click();
	}
	
	public void clickOnLinkText() {
		linkText.click();
	}
	
	public void enterName(String name) {
		sendKeys(enterYourName, name);
	}
	public void ParentWindowHandell() {
		String parentHandel = getParentWindowHandel();
		System.out.println("Parent Handel :: " + parentHandel);
	}
	public void AllWindowHandel(){
		Set<String> handels = getAllWindowHandels();
		for(String handel : handels) {
			System.out.println("Handel :: " + handel);
		}
	}
}
