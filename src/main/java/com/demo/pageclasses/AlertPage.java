package com.demo.pageclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo.Utilities.UiBasicutils;

public class AlertPage extends UiBasicutils{
	public AlertPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(how=How.ID, using="alertButton")
	private WebElement clicOnButton;
	
	@FindBy(how=How.ID, using="timerAlertButton")
	private WebElement clickOnAlertButton;
	
	@FindBy(how=How.ID, using="confirmButton")
	private WebElement confirmAlertButton;
	
	@FindBy(how=How.ID, using="promtButton")
	private WebElement prmptButton;
	
	public void clickoNOkButton() {
		clicOnButton.click();
	}
	public void clickOnAlertButton() {
		clickOnAlertButton.click();
	}
	public void confirmMsgButton() {
		confirmAlertButton.click();
	}
	public void prmptButtonAndUserName() {
		prmptButton.click();
	}
	public void acceptOk() {
		Alert alt = alertAccept();
		alt.accept();
	}
	public void acceptAfter5sec() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = alertAccept();
		if("This alert appeared after 5 seconds".equalsIgnoreCase(alt1.getText()))
		alt1.accept();
		else System.out.println("No Such alert");
	}
	
	public void cancelButton() {
		Alert alt2 = alertAccept();
		if("Do you confirm action?".equalsIgnoreCase(alt2.getText()))
			alt2.dismiss();
	}
	public void enterUserName() throws InterruptedException {
		Alert alt3 = alertAccept();
		//if("Please enter your name".equalsIgnoreCase(alt3.getText()))
		alt3.sendKeys("testUserName");
		Thread.sleep(5000);
		alt3.accept();
	}
	
}
