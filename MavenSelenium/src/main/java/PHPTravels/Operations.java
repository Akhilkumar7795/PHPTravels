package PHPTravels;

import org.openqa.selenium.By;

public class Operations extends LaunchBrowser{

		  By MyAccountButton = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
		  By SignUpButton = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
		  By Firstname = By.xpath("//input[@placeholder='First Name']");
		  By Lastname = By.xpath("//input[@placeholder='Last Name']");
		  By MobileNumber = By.xpath("//input[@placeholder='Mobile Number']");
		  By EMailId = By.xpath("//input[@placeholder='Email']");
		  By Password = By.xpath("//input[@placeholder='Password']");
		  By ConformPassword = By.xpath("//input[@placeholder='Confirm Password']");
		  By Cookie=By.xpath("//button[@id='cookyGotItBtn']");
		  By SignUp = By.xpath("//input[@placeholder='Confirm Password']");
	
		  public void SignUpPage() throws Exception 
		  {
			  driver.findElement(MyAccountButton).click();
			  driver.findElement(SignUpButton).click();
			  driver.findElement(Firstname).sendKeys(prop.getProperty("Firstname"));
			  driver.findElement(Lastname).sendKeys(prop.getProperty("Lastname"));
			  driver.findElement(MobileNumber).sendKeys(prop.getProperty("MobileNumber"));
			  driver.findElement(EMailId).sendKeys(prop.getProperty("EMailId"));
			  driver.findElement(Password).sendKeys(prop.getProperty("Password"));
			  driver.findElement(ConformPassword).sendKeys(prop.getProperty("ConformPassword"));
			  driver.findElement(Cookie).click();
			  Thread.sleep(3000);
			  driver.findElement(SignUp).click();
			
		  }
	
	
	
	
	
	
	
	
	
}
