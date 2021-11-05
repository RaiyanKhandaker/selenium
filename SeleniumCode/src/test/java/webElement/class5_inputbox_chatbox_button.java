package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class5_inputbox_chatbox_button {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nexchar.com/signin");
	
		driver.findElement(By.id("Email")).sendKeys("gift_shop");
		
		//driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.name("Password")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Demo")).click();
		
		Thread.sleep(3000);
		
	//	driver.findElement(By.partialLinkText("Conta")).click();
		
		driver.findElement(By.className("navbar-brand-image")).click();
	}

}
