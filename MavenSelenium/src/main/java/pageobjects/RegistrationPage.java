package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
public WebDriver driver;

By firstname = By.xpath("//input[@placeholder='First Name']");
By lastname = By.xpath("//input[@placeholder='Last Name']");
By mobilenumber = By.xpath("//input[@placeholder='Mobile Number']");
By Email = By.xpath("//input[@placeholder='Email']");
By password = By.xpath("//input[@placeholder='Password']");
By conformpassword = By.xpath("//input[@placeholder='Confirm Password']");
By cookies = By.xpath("//button[@id='cookyGotItBtn']");
By SignUp = By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");


public RegistrationPage(WebDriver driver) {
	this.driver=driver;
}
 public WebElement ProvideFName() {
	 return driver.findElement(firstname);
 }
 public WebElement ProvideLName() {
	 return driver.findElement(lastname);
 }
 public WebElement ProvideMobileNumber() {
	 return driver.findElement(mobilenumber);
 }
 public WebElement ProvideEmail() {
	 return driver.findElement(Email);
 }
 public WebElement ProvidePassword() {
	 return driver.findElement(password);
 }
 public WebElement ConformPassword() {
	 return driver.findElement(conformpassword);
 }
 public WebElement Cookies() {
	 return driver.findElement(cookies);
 }
 public WebElement SignUp() {
	 return driver.findElement(SignUp);
 }
}
 
 
 
