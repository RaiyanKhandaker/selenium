package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin_PageTestwithTestNG {

static WebDriver driver=null;
	
	@BeforeTest
	public static void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	 public static void Teststep () throws InterruptedException
	{
		
		driver.get("https://www.acquireangel.com/signin");
		
		
		Signin_Page_Object.email(driver).sendKeys("nisdoo@metalunits.com");
		Thread.sleep(3000);
		
		
		Signin_Page_Object.password(driver).sendKeys("12345");
		Thread.sleep(3000);
		
		
		Signin_Page_Object.remember(driver).click();
		Thread.sleep(3000);
				
				
	
		Signin_Page_Object.signinbutton(driver).click();
		Thread.sleep(3000);
				
	} 
	
	
	@AfterTest
	public static void Teardown()
	{
		driver.close();
		System.out.println("Testing end");
	}
}
