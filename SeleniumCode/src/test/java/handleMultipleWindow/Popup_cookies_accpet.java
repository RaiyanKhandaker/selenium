package handleMultipleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_cookies_accpet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		// URL Visit
		driver.get("https://aarong.com/");
		Thread.sleep(2000);
		//remove the cookies button
		
		driver.findElement(By.id("btn-cookie-allow")).click();
		

	}

}
