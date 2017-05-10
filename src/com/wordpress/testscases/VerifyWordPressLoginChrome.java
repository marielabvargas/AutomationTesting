/**
 * 
 */
package com.wordpress.testscases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**
 * @author tween5
 *
 */
public class VerifyWordPressLoginChrome {
	
	@Test
	public void VerifyValidLogin() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/tween5/Documents/workspace/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
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
