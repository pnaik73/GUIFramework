package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class DashboardPage extends WebDriverUtility{
	WebDriver driver;
	public DashboardPage(WebDriver driver) {             
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	            
	@FindBy(xpath="//span[text()='Restaurant']")                       
	private WebElement restaurantlink;

	@FindBy(xpath="//a[text()='Add Category']")
	private WebElement addcategorylink;

	@FindBy(xpath = "//a[text()='Add Restaurant']")
	private WebElement addrestaurantlink;

	@FindBy(xpath = "//span[text()='Menu']")
	private WebElement menulink;
	
	@FindBy(xpath = "//span[text()='All Menues']")
	private WebElement allmenulink;
	
	@FindBy(xpath = "//a[text()='Add Menu']")
	private WebElement addMenulink;
	@FindBy(xpath = "//span[text()='Orders']")
	private WebElement orderslink;
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement Userslink;
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboardlink;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getRestaurantlink() {
		return restaurantlink;
	}
	public WebElement getAddcategorylink() {
		return addcategorylink;
	}
	public WebElement getAddrestaurantlink() {
		return addrestaurantlink;
	}
	public WebElement getMenulink() {
		return menulink;
	}
	public WebElement getAllmenulink() {
		return allmenulink;
	}
	public WebElement getAddMenulink() {
		return addMenulink;
	}
	public WebElement getOrderslink() {
		return orderslink;
	}
	public WebElement getUserslink() {
		return Userslink;
	}
	public WebElement getDashboardlink() {
		return dashboardlink;
	}
	public void clickOnAddCategory() {
     mousemoveOnElement(driver, restaurantlink);
     mousemoveOnElement(driver, addcategorylink);
     
	}
	
	}

