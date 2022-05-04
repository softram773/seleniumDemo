package com.demo.pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.demo.Utilities.Fileoperations;
import com.demo.Utilities.UiBasicutils;

public class SignUpForm extends UiBasicutils{
	
	public SignUpForm(WebDriver driver) {
		super(driver);
	}
	@FindBy(
			how=How.XPATH, using="//a[text()='SignUp Form']"
    ) 
	private WebElement clickOnSignUpButton;
	@FindBy(
			how=How.CSS, using="#username"
	)
	private WebElement enterUserName;
	@FindBy(
			how=How.ID, using="email"
			)
	private WebElement enterEmailID;
	
	@FindBy(
			how=How.CSS, using="#tel"
			)
	private WebElement enterTelephoneNumber;
	
	@FindBy(
			how=How.CSS, using="#fax"
			)
	private WebElement enterFaxNo;
	@FindBy(
			how=How.NAME, using="datafile"
			)
	private WebElement uploadProfile;
	@FindBy(
			how=How.NAME, using="sgender"
			)
	private WebElement selectGenderFromDropDown;
	
	@FindBy(
			how=How.XPATH, using="//input[@value='five']"
			)
	private WebElement selectYearOfExperience;
	
	@FindBy(
			how=How.XPATH, using="//input[@value='automationtesting']"
			)
	private WebElement skills;
	
	@FindBy(
			how=How.ID, using="tools"
			)
	private WebElement selectAutomationTool;
	@FindBy(
			how=How.XPATH, using="//input[@id='submit']//following::text()[4]"
			)
	private WebElement readText;
	@FindBy(
			how=How.ID, using="submit"
			)
	private WebElement clickOnSubmit;
	
		
	public void clickOnSignUpForm() {
		clickOnSignUpButton.click();
	}
	public void enterFullName(String userName) {
		enterUserName.sendKeys(userName);
	}
	public void enterEmailID(String emailID) {
		enterEmailID.sendKeys(emailID);
	}
	public void enterTelephoneNumber(long telePhoneNumber) {
		enterTelephoneNumber.sendKeys(""+telePhoneNumber);
	}
	public void enterFaxNumber(long faxNumber) {
		if(enterFaxNo.isEnabled()) {
			enterFaxNo.sendKeys(""+faxNumber);
		}
	}
	public void uploadFile(String path) {
		Fileoperations.textFileUpload(this.driver, uploadProfile, path);
	}
	public void selectGender(String selectGender) {
		selectSingelItemFromDropDown(selectGender, selectGenderFromDropDown);
	}
	public void selectYearOfExperience() {
		selectRadioButton(selectYearOfExperience);
	}
	public void selectSkills() {
		selectCheckBox(skills);
	}
	public void selectAutomationTool(String automationTool) {
		selectSingelItemFromDropDown(automationTool,selectAutomationTool);
	}
	public void checkText() {
		String text = readText.getText();
		String expectedText = "Note: Please make sure your details are correct before submitting form!";
		if(text.contains(expectedText)) {
			System.out.println("Expected");
		}
	}
	public void submitButton() {
		clickOnSubmit.click();
	}
}
