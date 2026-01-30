package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\gause\\Automation\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys("Aslam Gause");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Aslam Gause");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

    }
}
