package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Siblingstraverse {
  public   static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver","\"C:\\Users\\gause\\Automation\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Absolute Xpath to identify Practice
        System.out.println(driver.findElement(By.xpath("/html/body/header/div/button[1]")).getText());
        //from above traverse to child
      System.out.println(driver.findElement(By.xpath("/html/body/header/div/button[1]/following-sibling::button[1]")).getText());
      //Relative Xpath to identify signup
      System.out.println(driver.findElement(By.xpath("//header/div/button[3]")).getText());
      //child to parent traverse
      System.out.println(driver.findElement(By.xpath("//header/div/button[3]/parent::div/parent::header/div/button[3]")).getText());
        Thread.sleep(1000);
        driver.close();
    }
}
