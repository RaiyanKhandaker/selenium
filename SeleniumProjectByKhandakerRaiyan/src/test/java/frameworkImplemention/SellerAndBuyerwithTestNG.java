package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SellerAndBuyerwithTestNG {

static WebDriver driver=null;
	
	@BeforeTest
	public static void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test (priority=1)
	 public static void Teststep1() throws InterruptedException
	{
		
		driver.get("https://www.acquireangel.com/sellers");
				
		
		SellerAndBuyerObject.seller(driver).click();
		
		Thread.sleep(3000);
				
	} 
	
	@Test (priority=2)
	public static void Teststep2() throws InterruptedException
	{
       driver.get("https://www.acquireangel.com/buyers");
				
		
       SellerAndBuyerObject.buyer(driver).click();
	   
       Thread.sleep(3000);
		
	}
	
	
	@AfterTest
	public static void Teardown()
	{
		driver.close();
		System.out.println("Testing end");
	}
}
