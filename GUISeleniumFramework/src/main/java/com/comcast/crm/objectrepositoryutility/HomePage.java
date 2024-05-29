package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	WebDriver driver;
	public HomePage(WebDriver driver) {             
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	            
	@FindBy(linkText ="Home")                       
	private WebElement HomeLink;

	@FindBy(linkText ="Register")                       
	private WebElement RegisterLink;
	@FindBy(linkText ="Restaurants ")                       
	private WebElement RestaurantLink;
	@FindBy(linkText ="Login ")                       
	private WebElement LoginLink;
	@FindBy(linkText ="Logout")                       
	private WebElement LogoutLink;
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	public WebElement getHomeLink() {
		return HomeLink;
	}
	public WebElement getRegisterLink() {
		return RegisterLink;
	}
	public WebElement getRestaurantLink() {
		return RestaurantLink;
	}
	public WebElement getLoginLink() {
		return LoginLink;
	}
	public void getRegistrationPage() {
		RestaurantLink.click();
	}
}
