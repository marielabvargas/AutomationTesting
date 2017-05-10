/**
 * 
 */
package com.wordpress.testscases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**
 * @author tween5
 *
 */
public class VerifyWordPressLoginFirefox {
	
	@Test
	public void VerifyValidLogin() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "/Users/tween5/Documents/workspace/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		//Wait for 5 Sec
		Thread.sleep(5);
		System.out.println("Successfully opened the website ");
		
		try{
		LoginPage login = new LoginPage(driver);
		//login.typeUsername("admin");
		//login.typePassword("demo123");
		//login.clickOnLoginButton();
		login.loginToWordpress("admin", "demo123");
		}
		finally {
            driver.quit();
        }
	}

}
