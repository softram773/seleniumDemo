package com.demo.pageclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.demo.Utilities.UiBasicutils;

public class Webtable extends UiBasicutils{
	
	public Webtable(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[text()='WebTable']") 
	protected WebElement webTable;
	
	@FindBy(how=How.XPATH, using="//td[text()='Functional']//preceding-sibling::td/input[@type='checkbox']")
	protected WebElement checkBox;
	
	@FindBy(how=How.XPATH, using="//td[text()='Functional']//following-sibling::td/input[@value='Delete']")
	protected WebElement deleteButton;
	
	@FindBy(how=How.XPATH, using="//table[@id='table01']//following-sibling::th[2]")
	protected List<WebElement> columns;
	
	@FindBy(how=How.XPATH, using="//table[@id='table01']//following-sibling::tr[1]")
	protected List<WebElement> rows;
	
	public void selectwebTable() {
		webTable.click();
	}
	
	public void selectCheckBoxFrmTable() {
		selectCheckBox(checkBox);
	}
	
	public int getColumnSize() {
		return columns.size();
	}
	public int getRowSize() {
		return rows.size();
	}
}
