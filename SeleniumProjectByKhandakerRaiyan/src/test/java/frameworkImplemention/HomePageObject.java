package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	 private static WebElement locator=null;
		
	  public static WebElement twitter (WebDriver driver)
		{
			locator=driver.findElement(By.cssSelector(".icon-twitter"));
			return locator;
			
		}
	  
	  
	  public static WebElement facebook (WebDriver driver)
		{
			locator=driver.findElement(By.cssSelector(".icon-facebook"));
			return locator;
			
		}
	  
	  
	  public static WebElement instagram (WebDriver driver)
		{
			locator=driver.findElement(By.cssSelector(".icon-instagram"));
			return locator;
			
		} 
	  
	  
	  public static WebElement email (WebDriver driver)
		{
			locator=driver.findElement(By.cssSelector("input[placeholder='Enter email address']"));
			return locator;
			
		}
	  
	  public static WebElement subscribe (WebDriver driver)
		{
			locator=driver.findElement(By.cssSelector("input[value='Subscribe']"));
			return locator;
			
		}
}
