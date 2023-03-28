package Loginpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class productcatalouge extends Homepage{
	WebDriver driver;
	
	public productcatalouge(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement gettingtheproductbyname1(String productsearch) {
		List<WebElement> products = driver.findElements(By.cssSelector(".card-body"));
		WebElement prod= products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productsearch)).findFirst().orElse(null);
		return prod;
		}

	public void addproducttocart1(String productsearch) {
		WebElement prod = gettingtheproductbyname1(productsearch);
		prod.findElement(By.cssSelector(".card-body button[class='btn w-10 rounded']")).click();

	}
	
}
