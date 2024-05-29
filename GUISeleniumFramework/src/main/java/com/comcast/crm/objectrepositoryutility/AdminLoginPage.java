package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class AdminLoginPage extends WebDriverUtility{
    
WebDriver driver;
public AdminLoginPage(WebDriver driver) {             
this.driver = driver;
PageFactory.initElements(driver, this);
}
            
@FindBy(name="username")                       
private WebElement usernameEdt;

@FindBy(name="password")
private WebElement passwordEdt;

@FindBy(name = "submit")
private WebElement loginBtn;


                              
public WebElement getUsernameEdt() {            
return usernameEdt;                        }

public WebElement getPasswordEdt() {
return passwordEdt;
}

public WebElement getLoginBtn() {
return loginBtn;
}

/**
*  login to application based username , password , url argumnets 
* @param url
* @param username
* @param password
 * @throws InterruptedException 
*/
public void loginToapp(String url , String username , String password) throws InterruptedException {
waitForPageToLoad(driver);
driver.get(url);	
usernameEdt.sendKeys(username);
passwordEdt.sendKeys(password);
loginBtn.click();
}



}
