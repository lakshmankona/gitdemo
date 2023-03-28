package Loginpage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	
	public Homepage(WebDriver driver) 
			{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
@FindBy(xpath ="/html/body/app-root/app-login/div[1]/section[1]/h1/em")
WebElement header1;

@FindBy(id="userEmail")
WebElement useremail;

@FindBy(id="userPassword")
WebElement userpassword;

@FindBy(id="login")
WebElement submitElement;

public void loginrahul(String email, String password) {
	useremail.sendKeys(email);
	userpassword.sendKeys(password);
	submitElement.click();
}
public void quit() {
	driver.quit();
}
public Boolean cartpage1(String productsearch) {
	List<WebElement> cartElements=driver.findElements(By.className(".cartSection h3"));
	Boolean match= cartElements.stream().anyMatch(cartproduct->cartproduct.getText().equals(productsearch));
	return match;
}
public void goto1() {
	// TODO Auto-generated method stub
	driver.get("https://rahulshettyacademy.com/client");
}
}