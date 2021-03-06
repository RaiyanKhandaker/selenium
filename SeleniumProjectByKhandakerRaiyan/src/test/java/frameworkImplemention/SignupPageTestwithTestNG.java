package frameworkImplemention;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignupPageTestwithTestNG {

static WebDriver driver=null;
	
	@BeforeTest
	public static void Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	 public static void Teststep1() throws InterruptedException
	{
		
		driver.get("https://www.acquireangel.com/signup");
				
		SignupPageObject.radio(driver).click();
		Thread.sleep(3000);
		
		
		SignupPageObject.email(driver).sendKeys("nisdoo@metalunits.com");
		Thread.sleep(3000);
		
		
		SignupPageObject.password(driver).sendKeys("12345");
		Thread.sleep(3000);
				
				
	
		SignupPageObject.signupbutton(driver).click();
		Thread.sleep(3000);
				
	} 
	
	
	@AfterTest
	public static void Teardown()
	{
		driver.close();
		System.out.println("Testing end");
	}
}
