package QAmonCodeTestByKhandakerRaiyan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Execution_Test {

	public static void main(String[] args) throws InterruptedException {
		//ledeg45568@tinilalo.com
		//vocok12616@tinilalo.com
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nexchar.com/signup");
		
	/*	driver.findElement(By.id("Name")).sendKeys("victor");
		
        Select dropdownbox =new Select(driver.findElement(By.id("CategoryId")));
		
		dropdownbox.selectByVisibleText("Groceries & Food Retail");
		
		driver.findElement(By.id("Email")).sendKeys("ledeg45568@tinilalo.com");
		
		
		driver.findElement(By.id("Password")).sendKeys("12345");
		
		driver.findElement(By.id("NotReceiveNewsLetter")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Create new account')]")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.nexchar.com/signin");
		
		driver.findElement(By.id("Email")).sendKeys("ledeg45568@tinilalo.com");
		
		driver.findElement(By.id("Password")).sendKeys("12345");
		
		driver.findElement(By.id("RememberMe")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click(); 
		
		driver.findElement(By.id("logoutForm")).click(); */
		
		
			
			driver.navigate().to("https://www.nexchar.com/signup");
			
			driver.findElement(By.id("Name")).sendKeys("victor");
			
	        
			Select dropdownbox =new Select(driver.findElement(By.id("CategoryId")));
			dropdownbox.selectByVisibleText("Groceries & Food Retail"); 
			
			driver.findElement(By.id("Email")).sendKeys("vocok12616@tinilalo.com");
			
			
			driver.findElement(By.id("Password")).sendKeys("12345");
			
			driver.findElement(By.id("NotReceiveNewsLetter")).click();
			
			driver.findElement(By.xpath("//button[contains(text(),'Create new account')]")).click();
			
			Thread.sleep(3000);
			
			driver.navigate().to("https://www.nexchar.com/signin");
			
			driver.findElement(By.id("Email")).sendKeys("ledeg45568@tinilalo.com");
			
			driver.findElement(By.id("Password")).sendKeys("12345");
			
			driver.findElement(By.id("RememberMe")).click();
			
			driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click(); 

	}

}
