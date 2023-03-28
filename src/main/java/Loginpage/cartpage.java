package Loginpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	WebDriver driver;
	public  cartpage(WebDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@SuppressWarnings("deprecation")
	public void timeout() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	public void cart() {
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		System.out.println("product was successfully add to the cart");
	}
	public void deleteitem() {
		
		driver.findElement(By.cssSelector(".btn i[class='fa fa-trash-o']")).click();
		System.out.println("product was successfully delete from the cart");
	}
}
