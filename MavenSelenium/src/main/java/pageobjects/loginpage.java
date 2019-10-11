package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class loginpage extends base {
	
	

	By Email = By.xpath("//input[@placeholder='Email']");
	By Password = By.xpath("//input[@placeholder='Password']");
	
	 public WebElement ProvideEmail() {
		 return driver.findElement(Email);
	 }
	 public WebElement ProvidePassword() {
		 return driver.findElement(Password);
	 }

}
