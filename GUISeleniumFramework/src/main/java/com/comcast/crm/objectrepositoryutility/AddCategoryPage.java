package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {
	WebDriver driver;
	
	public AddCategoryPage(WebDriver driver) {             
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	            
	@FindBy(name="c_name")                       
	private WebElement addCategoryEdt;

	@FindBy(name="submit")
	private WebElement savebutton;

	public WebElement getAddCategoryEdt() {
		return addCategoryEdt;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	public void addCategory(String category) {
		addCategoryEdt.sendKeys(category);
		savebutton.click();
	}

}
