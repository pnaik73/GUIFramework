package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantPage {
	WebDriver driver;
	public RestaurantPage(WebDriver driver) {             
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	            
	@FindBy(xpath="//input[@value='Add To Cart']")                       
	private WebElement ViewMenuButton;
	@FindBy(linkText="Checkout")                       
	private WebElement CheckoutButton;
	@FindBy(xpath="//div[@class='title-row']")                       
	private WebElement yourCartTitleMsg;
	@FindBy(xpath="//h3[@class='value']")                       
	private WebElement totalPrice;
	
	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}

	public WebElement getYourCartTitleMsg() {
		return yourCartTitleMsg;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getViewMenuButton() {
		return ViewMenuButton;
		
	}


}
