package com.demo.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.demo.Utilities.UiBasicutils;

public class NestedFrames extends UiBasicutils{
	
	public NestedFrames(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(how=How.ID, using="name") private WebElement userName;
	@FindBy(how=How.ID, using="frm3") private WebElement frame3;
	@FindBy(how=How.ID, using="frm1") private WebElement frame1;
	@FindBy(how=How.CSS, using="#selectnav1") private WebElement dropDownfrm;
	
	public void enterName(String name) {
		userName.sendKeys(name);
	}
	
	public void switchToFrm(String item) {
		switchToFrame(frame3);
		switchToFrame(frame1);
		Select sel = dropDown(dropDownfrm);
		sel.selectByVisibleText(item);
		driver.switchTo().parentFrame();
		userName.sendKeys("parent frame");
		driver.switchTo().defaultContent();
		userName.clear();
		userName.sendKeys("Web page");
	}

}
