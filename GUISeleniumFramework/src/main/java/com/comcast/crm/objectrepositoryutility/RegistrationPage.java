package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) {             
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	            
	@FindBy(name="username")                       
	private WebElement usernameEdt;

	@FindBy(name="firstname")
	private WebElement firstNameEdt;

	@FindBy(name ="lastname")
	private WebElement lastnameEdt;
	
	@FindBy(name="email")                       
	private WebElement emailEdt;

	@FindBy(name="phone")
	private WebElement phoneEdt;

	@FindBy(name ="password")
	private WebElement passwordEdt;
	
	@FindBy(name ="cpassword")
	private WebElement confirmpasswordEdt;
	
	@FindBy(name ="address")
	private WebElement addressEdt;
	
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getFirstNameEdt() {
		return firstNameEdt;
	}

	public WebElement getLastnameEdt() {
		return lastnameEdt;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPhoneEdt() {
		return phoneEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getConfirmpasswordEdt() {
		return confirmpasswordEdt;
	}

	public WebElement getAddressEdt() {
		return addressEdt;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

	@FindBy(name ="submit")
	private WebElement registerbutton;

}
