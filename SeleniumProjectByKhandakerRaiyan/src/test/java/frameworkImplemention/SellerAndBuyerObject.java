package frameworkImplemention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellerAndBuyerObject {

	private static WebElement locator=null;
	
	  public static WebElement seller (WebDriver driver)
		{
			locator=driver.findElement(By.cssSelector(".btn.btn-primary.px-4.py-3.mt-3"));
			return locator;
			
		}
	  
	  public static WebElement buyer (WebDriver driver)
		{
			locator=driver.findElement(By.cssSelector(".btn.btn-primary.px-4.py-3.mt-3"));
			return locator;
			
		}
	  
	  
}
