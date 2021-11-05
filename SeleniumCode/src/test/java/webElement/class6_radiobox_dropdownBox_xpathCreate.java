package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class6_radiobox_dropdownBox_xpathCreate {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nexchar.com/signup");
		
		Select dropdownbox =new Select(driver.findElement(By.id("CategoryId")));
		
		dropdownbox.selectByVisibleText("Groceries & Food Retail");
		
		Thread.sleep(3000);
		
		dropdownbox.selectByValue("10");
		
		Thread.sleep(3000);
		
		dropdownbox.selectByIndex(4);  
		
		//driver.get("http://demo.guru99.com/test/radio.html");
		
		//driver.findElement(By.id("vfb-7-1")).click();
		
		driver.get("https://www.nexchar.com/contactus");
		
		WebElement Namebox = driver.findElement(By.id(""));
		
		Namebox.sendKeys("a");
	}

}
