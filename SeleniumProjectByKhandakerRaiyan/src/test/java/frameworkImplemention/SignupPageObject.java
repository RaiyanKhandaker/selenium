package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {

	private static WebElement locator=null;
	
	  public static WebElement radio (WebDriver driver)
		{
			locator=driver.findElement(By.id("Seller"));
			return locator;
			
		}
	  
	  
	   public static WebElement email (WebDriver driver)
		{
			locator=driver.findElement(By.id("Email"));
			return locator;
			
		}
		
		
		public static WebElement password(WebDriver driver)
		{
			locator=driver.findElement(By.id("Password"));
			return locator;
				
		}
			
			
			
			
		public static WebElement signupbutton(WebDriver driver)
		{
			locator=driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
			return locator;
				
		}

}
