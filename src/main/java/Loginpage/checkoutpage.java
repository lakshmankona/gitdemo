package Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutpage {
 WebDriver driver;
	public  checkoutpage(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	
@FindBy(css="[placeholder=\"Select Country\"]")
WebElement selectcountry;

@FindBy(className =".ta-item:nth-of-type(2)")
WebElement india;

@FindBy(xpath = "(//input[@type='text'])[2]")
WebElement cvv;

@FindBy(xpath = "//input[@type='text'])[3]")
WebElement nameofcard;

@FindBy(css = ".btnn")
WebElement button;


public void selectcountry(String country) {
	Actions a= new Actions(driver);
	a.sendKeys(selectcountry, country).build().perform();
	india.click();
	cvv.sendKeys("234");
	nameofcard.sendKeys("lakshman");
	button.click();
}}