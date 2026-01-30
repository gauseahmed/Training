package org.example;

import com.sun.source.tree.WhileLoopTree;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownpassanger {
     public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.Chrome.driver","C:\\Users\\gause\\Automation\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("hrefIncAdt")).click();
        //Using below while loop we will add 5 passengers
        int i=1;
        while(i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(1000);
        driver.close();
    }
}