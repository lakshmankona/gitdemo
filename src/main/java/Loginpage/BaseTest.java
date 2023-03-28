package Loginpage;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	public BaseTest(WebDriver driver) {
		this.driver=driver;
	}
	public WebDriver driver;
	
	public WebDriver  initiliazeDriver() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/konalakshmanarao/eclipse-workspace/Ecommerce_1/src/main/java/rahulshetty/resources/Globaldata.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver();
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver();
			driver= new FirefoxDriver();
		}
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	
		}
	public Homepage  launchapplication() throws IOException, InterruptedException  {
		driver=initiliazeDriver();
		Homepage hpHomepage = new Homepage(driver);
		hpHomepage.goto1();
		return hpHomepage;
		
	
	}
	
}
	

