package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	WebDriver driver;
	public PaymentPage(WebDriver driver) {             
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	            
	@FindBy(name="submit")                       
	private WebElement orderNowButton;
	
	public WebElement getOrderNowButton() {
		return orderNowButton;
	}
	

}
