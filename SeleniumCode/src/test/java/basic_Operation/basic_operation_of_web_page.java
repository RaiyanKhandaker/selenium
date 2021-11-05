package basic_Operation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic_operation_of_web_page {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		// webdriver object create
		
		WebDriver driver= new ChromeDriver();
		
		// url visit 
		
		driver.get("https://www.nexchar.com/contactus");
		
		driver.getTitle();

		// 1. Capture the page title of the web page
		 System.out.println(" Page title is: "+driver.getTitle());
    
	  //  System.out.println(driver.getTitle());
		
		 
		 driver.getCurrentUrl();
		// 2. Capture the current url of the web page
	    System.out.println(" Page current url is: "+driver.getCurrentUrl());
	    
	    
	     driver.getPageSource();
	      // 3. Capture the page source code of the web page
	    System.out.println(" Page source code is: "+driver.getPageSource()); 
	    
	    // 4. Browser window maximize
	    
		 driver.manage().window().maximize();
	    
	    // 5. Delay 5 sec
	    
	    Thread.sleep(5000);
		
//	    // 6. Browser window fullscreen
	  //  driver.manage().window().fullscreen();
    
	    // 7. window minimize
	    
	  //  driver.manage().window().minimize(); 
	    
	    // 8. Visiting url with navigate method
	   
	     driver.navigate().to("http://sheradambd.com/");
	    Thread.sleep(3000);
	    
	    // 9. Navigate back to the previous website
	    
	    driver.navigate().back();
	    
	    Thread.sleep(3000);
	    
	    // 10. navigate forward to sheradam website
	    driver.navigate().forward();
	    
	    Thread.sleep(3000);
	    
	    // 11. refresh the window
	    
	    driver.navigate().refresh(); 
	    
	    // 12. Open the new tab
	    
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB).get("http://sheradambd.com/");
		
		// 13.  Visit a URL in the new Tab
		driver.get("http://sheradambd.com/");
		
		
		// 14. CLose the current tab
		Thread.sleep(3000);
		driver.close();
		
		// 15. Close the browser
	    Thread.sleep(3000);
		driver.quit(); 
		
		// 16. Dimension the window using setSize function
		
	//	Dimension d=new Dimension(600,600);
	//	driver.manage().window().setSize(d);  
		
	}

}
