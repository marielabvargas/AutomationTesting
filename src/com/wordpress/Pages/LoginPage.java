/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author tween5
 *
 */
public class LoginPage {
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.id("user_pass");
	By loginButton = By.id("wp-submit");
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void loginToWordpress(String thisUsername, String thisPassword){
		driver.findElement(username).sendKeys(thisUsername);
		driver.findElement(password).sendKeys(thisPassword);
		driver.findElement(loginButton).click();
	}
	
	public void typeUsername(String thisUsername){
		driver.findElement(username).sendKeys(thisUsername);
	}
	
	public void typePassword(String thisPassword){
		driver.findElement(password).sendKeys(thisPassword);
	}
	
	public void clickOnLoginButton(){
		driver.findElement(loginButton).click();
	}
}
