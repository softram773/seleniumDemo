package com.demo.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.demo.UiWebDriver.UiTestWebDriver;
import com.demo.pageclasses.Webtable;

public class WebTableMain {
	
	public WebDriver driver;
	private Webtable webTablepage;
	private int columnSize;
	private int rowSize;
	private int k = 0;
	
	@BeforeClass
	public void setUp() {
		driver = UiTestWebDriver.getWebDriver();
		driver.get("https://qavbox.github.io/demo/");
		webTablepage = PageFactory.initElements(driver, Webtable.class);
	}
	
	@Test(priority=10)
	public void selectWebTableLink() {
		webTablepage.selectwebTable();
	}
	@Test(priority=20, enabled=false)
	public void checkBoxfromTable() {
		webTablepage.selectCheckBoxFrmTable();
	}
	@Test(priority=30)
	public void getColumnSizeFromTable() {
		columnSize = webTablepage.getColumnSize();
		System.out.println("size of the column :: " + columnSize);
	}
	@Test(priority=40)
	public void getRowSizeFromTable() {
		rowSize = webTablepage.getRowSize();
		System.out.println("Row size :: " + rowSize);
	}
	
	@Test(priority=50)
	public void tabledata() {
			for(int j = 0; j < columnSize; j++) {
				k = j + 1;
				WebElement data = driver.findElement(By.xpath("//table[@id='table01']//following-sibling::tr[" + k + "]"));
				System.out.println(data.getText());
				k = 0;
		}
	}
	@AfterClass
	public void cleanUp() {
		driver.quit();
	}
	
}
