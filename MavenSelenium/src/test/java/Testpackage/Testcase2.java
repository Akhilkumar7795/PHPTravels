package Testpackage;

import org.testng.annotations.Test;

import pageobjects.RegistrationPage;
import pageobjects.landingPage;
import pageobjects.landingpage2;
import pageobjects.loginpage;
import resources.base;

public class Testcase2 extends base{
	
	
	@Test
	public void basePageNavigation() throws Exception {
	driver = initializerDriver();
    driver.get(prop.getProperty("url"));
    landingpage2 l = new landingpage2();
    l.MyAccount().click();
   l.login().click();
    loginpage l1 = new loginpage();
    l1.ProvideEmail().sendKeys("Firstname");
    l1.ProvidePassword().sendKeys("Lastname");

}}
