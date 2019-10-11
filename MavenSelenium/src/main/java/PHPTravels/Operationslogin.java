package PHPTravels;

import org.openqa.selenium.By;

public class Operationslogin extends LaunchBrowser{

	By MyAccountButton = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By LoginButton = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
    By EMailId = By.xpath("//input[@placeholder='Email']");
	By Password = By.xpath("//input[@placeholder='Password']");
	By Login = By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
	
	
	 public void Loginpage() throws Exception 
	  {
		  driver.findElement(MyAccountButton).click();
		  driver.findElement(LoginButton).click();
		  driver.findElement(EMailId).sendKeys(prop.getProperty("EMailId"));
		  driver.findElement(Password).sendKeys(prop.getProperty("Password"));
		  driver.findElement(Login).click();
	
	
	
	
	
	
	
	
	
}}
