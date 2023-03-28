package Pagefactory;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import Loginpage.BaseTest;
import Loginpage.Homepage;
import Loginpage.cartpage;
import Loginpage.checkoutpage;
import Loginpage.productcatalouge;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public String productsearch="zara coat 3";
	public String country="India";
	
	WebDriver driver;
		@Test
		public void setup() throws InterruptedException, IOException 
		{
			
			Homepage hpHomepage= new Homepage(driver);
			BaseTest bTest= new BaseTest(driver);
			bTest.initiliazeDriver();
			bTest.launchapplication();
			Thread.sleep(2000);
			hpHomepage.loginrahul("anshika@gmail.com", "Iamking@000");	
			cartpage cp= new cartpage(driver);
			cp.timeout();
			productcatalouge pc= new productcatalouge(driver);
			pc.gettingtheproductbyname1(productsearch);
			Thread.sleep(2000);
			pc.addproducttocart1(productsearch);
			Thread.sleep(2000);
			cp.cart();
			cp.deleteitem();
			checkoutpage cop = new checkoutpage(driver);
			cop.selectcountry(country);
			
		}
	
}

	