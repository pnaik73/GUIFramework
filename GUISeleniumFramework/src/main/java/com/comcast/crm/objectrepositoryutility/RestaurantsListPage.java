package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantsListPage {
	WebDriver driver;
	public RestaurantsListPage(WebDriver driver) {             
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	            
	@FindBy(linkText="View Menu")                       
	private WebElement ViewMenuButton;
	
	public WebElement getViewMenuButton() {
		return ViewMenuButton;
	}


}
