package task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		//driver.getCurrentUrl();
		
		//driver.getTitle();
		
		System.out.println("Current URL is "+driver.getCurrentUrl());
		
		System.out.println("Page Title is "+driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.nexchar.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();

	}

}
