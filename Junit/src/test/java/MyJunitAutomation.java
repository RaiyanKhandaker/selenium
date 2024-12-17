import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;


public class MyJunitAutomation {
    public static void main(String args[]) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://web.cloudapper.com");

        Thread.sleep(60000);

        driver.findElement(By.id("txtEmail")).sendKeys("m2sysqa.05+25@gmail.com");

        //  Thread.sleep(1000);

        driver.findElement(By.id("txtUserPassword")).sendKeys("M2qatest@13");


        driver.findElement(By.cssSelector("#btnLogin")).click();
        Thread.sleep(30000);

        driver.findElement(By.cssSelector("body > app-root:nth-child(1) > app-home:nth-child(2) > div:nth-child(1) > div:nth-child(2) > app-console:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > app-list:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(2) > div:nth-child(1) > img:nth-child(1)")).click();
        Thread.sleep(60000);


        driver.findElement(By.className("dx-button-text")).click();
        Thread.sleep(30000);

        driver.findElement(By.className("add-file")).click();
        Thread.sleep(30000);

//        driver.findElement(By.className("dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-text dx-fileuploader-button")).sendKeys("D:\\interview.png");

        driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-app-launch[1]/dx-drawer[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form-add-ui[1]/div[1]/dx-scroll-view[1]/div[1]/div[1]/div[1]/div[2]/form[1]/dx-validation-group[1]/div[1]/dx-accordion[1]/div[1]/div[1]/div[2]/div[1]/app-section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-column[1]/div[1]/app-text-control[1]/div[1]/div[1]/dx-text-box[1]/div[1]/div[1]/input[1]")).sendKeys("Selenium");
        Thread.sleep(5000);

//        driver.findElement(By.cssSelector("div[class='dx-item dx-list-item dx-list-item-selected'] div[class='dx-item-content dx-list-item-content']")).click();
//
//        Thread.sleep(30000);
//
        driver.findElement(By.cssSelector("dx-number-box[id='numericField1'] input[role='spinbutton']")).sendKeys("100");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("dx-number-box[id='numericField0'] input[role='spinbutton']")).sendKeys("1000");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("dx-button[aria-label='Save'] span[class='dx-button-text']")).click();
        Thread.sleep(5000);


        //restock product
        driver.findElement(By.xpath("//body[1]/app-root[1]/app-app-launch[1]/dx-drawer[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-list-view[1]/div[2]/app-data-grid[1]/div[1]/dx-data-grid[1]/div[1]/div[6]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/span[1]")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("dx-button[aria-label='Re-Stock Product'] div[class='dx-button-content']")).click();
        Thread.sleep(5000);


        driver.findElement(By.xpath("//body/app-root[1]/app-app-launch[1]/dx-drawer[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form-add-ui[1]/div[1]/dx-scroll-view[1]/div[1]/div[1]/div[1]/div[2]/form[1]/dx-validation-group[1]/div[1]/dx-accordion[1]/div[1]/div[1]/div[2]/div[1]/app-section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-column[1]/div[3]/app-text-control[1]/div[1]/div[1]/dx-number-box[1]/div[1]/div[1]/input[1]")).click();
        Thread.sleep(5000);


        driver.findElement(By.xpath("//body/app-root[1]/app-app-launch[1]/dx-drawer[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form-add-ui[1]/div[1]/dx-scroll-view[1]/div[1]/div[1]/div[1]/div[2]/form[1]/dx-validation-group[1]/div[1]/dx-accordion[1]/div[1]/div[1]/div[2]/div[1]/app-section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-column[1]/div[3]/app-text-control[1]/div[1]/div[1]/dx-number-box[1]/div[1]/div[1]/input[1]")).sendKeys("70");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//body/app-root[1]/app-app-launch[1]/dx-drawer[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form-add-ui[1]/div[1]/dx-scroll-view[1]/div[1]/div[1]/div[1]/div[2]/form[1]/dx-validation-group[1]/div[2]/div[1]/dx-button[2]/div[1]")).click();
        Thread.sleep(5000);


//        WebElement fileInput= driver.findElement(By.xpath("//input[@type='file']"));
//        fileInput.sendKeys("D:\\interview.png");
//        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/dx-multi-view[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/dx-file-uploader[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).sendKeys("D:\\interview.png");


//        String filePath = "D:\\interview.png";
//        uploadFileUsingRobot(filePath);

//        File uploadFile = new File("D:\\interview.png");
//        WebElement fileInput = driver.findElement(By.linkText("Browse a file from your device"));
//        System.out.println(fileInput);
//        fileInput.sendKeys(uploadFile.getAbsolutePath());
//        driver.findElement(By.id("file-submit")).click();

//        System.out.println("File uploaded successfully!");

//        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/dx-list[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]"));
//
//        Thread.sleep(30000);
//        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/dx-list[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")).click();
//        Thread.sleep(30000);
//        WebElement imageUrl= driver.findElement(By.cssSelector("div[class='dx-item dx-multiview-item dx-item-selected'] input[role='textbox']"));
//        imageUrl.click();
//        imageUrl.sendKeys("https://cloudapper.ai/wp-content/uploads/custom_images/home-ai/easy-amazon-aws-bedrock-gen-ai-app-development.webp");
//
//        driver.findElement(By.cssSelector("div[class='dx-item dx-multiview-item dx-item-selected'] div[class='col-xs-6 col-sm-6 col-md-6 col-lg-6 btn-add-url-image'] div[class='dx-button-content']")).click();
////        image.sendKeys("D:\\interview.png");
//
//        Thread.sleep(30000);

//        uploadElement.sendKeys("D:\\interview.png");
//        Thread.sleep(30000);



//        uploadElement.sendKeys("C:\Users\raiya\OneDrive\Pictures\Screenshots");




    }




}

