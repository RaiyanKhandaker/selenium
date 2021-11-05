package QAmonCodeTestByKhandakerRaiyan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicOperationofWebPage {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/index.html");
		
		Thread.sleep(3000);
		
		System.out.println("Current URL is "+driver.getCurrentUrl());
		
		System.out.println("Page Title is "+driver.getTitle());
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
	    Thread.sleep(5000);
	    
	    driver.navigate().refresh();
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().newWindow(WindowType.TAB).get("https://www.aftercareexplained.com/");
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().newWindow(WindowType.TAB).get("https://www.chhoto.link/");
	    
	    Thread.sleep(3000);
	    
		driver.close();
		
	    Thread.sleep(3000);
	    
		driver.quit(); 

	}

}
