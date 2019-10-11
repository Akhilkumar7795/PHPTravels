package PHPTravels;



import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



	public class LaunchBrowser {
		public static WebDriver driver;
		public static Properties prop=new Properties();
		
		public void browser() throws Exception {
			
			
			FileInputStream fis=new FileInputStream("C:\\New folder\\MavenSelenium\\src\\main\\java\\PHPTravels\\data.properties");
			prop.load(fis);
		
			if(prop.getProperty("browser").equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\chromedrivr\\chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get(prop.getProperty("baseURL"));
			}
			
			//else if(prop.getProperty("browser").equals("firefox")) {
				//System.setProperty("webdriver.firefox.driver","C:\\geckodriver\\geckodriver.exe");
				//driver=new FirefoxDriver();
		//	}
			//else
			//{
			//	driver=new InternetExplorerDriver();
		//	}
			
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     //  return driver;

			
			
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

