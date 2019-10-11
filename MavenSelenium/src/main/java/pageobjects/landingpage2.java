package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class landingpage2 extends base {

	
	By myaccount =By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
	By login = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");



	


	public WebElement MyAccount() {
		return driver.findElement(myaccount);
	}

	public WebElement login() {
		return driver.findElement(login);
	}
	}

