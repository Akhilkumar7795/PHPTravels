package PHPTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class OperationsHotel extends LaunchBrowser{
	
	static By Hotel=By.xpath("//li[@class='active text-center']//a[@class='text-center']");
	static By Srch_by_hotel=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	static By Entr_value=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");  
	static By Select=By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li/div/span");  
	static By Checkin=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	static By Next=By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[3]");
	static By Checkout=By.xpath("/html/body/div[15]/div[1]/table/thead/tr[1]/th[2]");
	static By Next1=By.xpath("/html/body/div[15]/div[1]/table/thead/tr[1]/th[3]");
	static By Guest=By.xpath("//input[@id='htravellersInput']");
	static By Adult=By.xpath("//input[@id='hadultInput']");
	static By Child=By.xpath("//input[@id='hchildInput']");
	static By Click_Search=By.xpath("//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']");


	public static void HotelPage() throws Exception
	{
	driver.findElement(Hotel).click();
	driver.findElement(Srch_by_hotel).click();
	Thread.sleep(2000);
	driver.findElement(Entr_value).sendKeys(prop.getProperty("cName"));
	driver.findElement(Entr_value).sendKeys((Keys.DOWN));
	Thread.sleep(3000);
	driver.findElement(Select).click();
	driver.findElement(Checkin).click();
	Thread.sleep(2000);
	while(true)
	{

	String str=driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[2]")).getText();

	//Thread.sleep(3000);
	if(str.equals(prop.getProperty("check_in_month")))
	{
	break;
	}
	else
	{
	Thread.sleep(2000);
	driver.findElement(Next).click();
	}
	}
	driver.findElement(By.xpath("/html[1]/body[1]/div[14]/div[1]/table[1]/tbody[1]/tr/td[@class='day '][contains(text(),"+prop.getProperty("check_in_day")+")]")).click();
	//String Month="october 2019";
	Thread.sleep(2000);
	while(true)
	{
	String str=driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/thead/tr[1]/th[2]")).getText();
	if(str.equals(prop.getProperty("check_out_month")))
	{
	break;
	}
	else
	{
	driver.findElement(Next1).click();
	}}
	driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr/td[contains(text(),"+prop.getProperty("check_out_day")+")]")).click();
	driver.findElement(Guest).click();
	driver.findElement(Adult).sendKeys(Keys.BACK_SPACE);
	driver.findElement(Adult).sendKeys(prop.getProperty("adult"));
	driver.findElement(Child).sendKeys(Keys.BACK_SPACE);
	driver.findElement(Child).sendKeys(prop.getProperty("child"));
	driver.findElement(Click_Search).click();
	}}

	




 
	
	
	
	
	
	
	
	
	
	
	
	
	  
