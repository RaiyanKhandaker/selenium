package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("btn-make-appointment")).click();;
		
		Thread.sleep(3000);
		
		WebElement namebox=driver.findElement(By.id("txt-username"));
		
		namebox.sendKeys("John Doe"); 
		
		Thread.sleep(1000);
		
		WebElement passwordbox=driver.findElement(By.id("txt-password"));
		
		passwordbox.sendKeys("ThisIsNotAPassword");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("btn-login")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
