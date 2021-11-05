package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin_Page_Object {

	private static WebElement locator=null;
	
	public static WebElement email (WebDriver driver)
	{
		locator=driver.findElement(By.id("Email"));
		return locator;
			
	}
	
	public static WebElement password (WebDriver driver)
	{
		locator=driver.findElement(By.id("Password"));
		return locator;
			
	}
	
	
	public static WebElement remember (WebDriver driver)
	{
		locator=driver.findElement(By.id("IsRemember"));
		return locator;
			
	}
	
	//
	public static WebElement signinbutton (WebDriver driver)
	{
		locator=driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
		return locator;
			
	}
	
	
	
	
}
