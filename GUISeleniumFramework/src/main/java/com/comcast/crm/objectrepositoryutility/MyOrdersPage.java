package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {
	WebDriver driver;
	public MyOrdersPage(WebDriver driver) {             
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	            
	@FindBy(xpath="//button[@class='btn btn-info']")                       
	private WebElement statusButton;
	
	@FindBy(xpath = "//td[@data-column='Item']")
	private WebElement ItemColumn;
	
	public WebElement getStatusButton() {
		return statusButton;
	}
	public WebElement getItemColumn() {
		return ItemColumn;
	}
}
