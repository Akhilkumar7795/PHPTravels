package PHPTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class operationsFlight extends LaunchBrowser{



static By Flight=By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[2]/a");
static By location=By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");
static By Enter_Loc1=By.xpath("//*[@id=\"select2-drop\"]/div/input");
static By Destination=By.xpath("//*[@id=\"s2id_destination\"]/a");
static By Departure=By.xpath("//*[@id=\"departure\"]");
static By Next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");
static By Passanger=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
static By PopUp_Adult=By.xpath("//select[@id='madult']");
static By PopUp_Child=By.xpath("//select[@id='mchildren']");

public void FlightPage() throws Exception
{
driver.findElement(Flight).click();
Thread.sleep(2000);
driver.findElement(location).click();
driver.findElement(Enter_Loc1).sendKeys(prop.getProperty("FlightLocation"));
driver.findElement(Enter_Loc1).sendKeys(Keys.DOWN);
Thread.sleep(3000);
driver.findElement(Enter_Loc1).sendKeys(Keys.ENTER);
driver.findElement(Destination).click();
driver.findElement(Enter_Loc1).sendKeys(prop.getProperty("DestinationLocation"));
Thread.sleep(3000);
driver.findElement(Enter_Loc1).sendKeys(Keys.ENTER);
driver.findElement(Departure).click();
while(true)
{
String str=driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText();
if(str.equals(prop.getProperty("Month")))
{
break;
}
else
{
driver.findElement(Next).click();
str=driver.findElement(By.xpath("//div[16]//div[1]//tr[1]//th[2]")).getText();
}
} driver.findElement(By.xpath("//div[16]//tr//td[contains(text(),"+prop.getProperty("Day")+")]")).click();
driver.findElement(Passanger).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//select[@id='madult']")).click();
driver.findElement(By.xpath("//select[@id='madult']//option[contains(text(),"+prop.getProperty("No_Of_Adults")+")]")).click();
driver.findElement(By.xpath("//select[@id='mchildren']")).click();
driver.findElement(By.xpath("//select[@id='mchildren']//option[contains(text(),"+prop.getProperty("No_Of_child")+")]")).click();

driver.findElement(By.xpath("//button[@id='sumManualPassenger']")).click();
driver.findElement(By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']")).click();
}
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

