package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\gause\\Automation\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       /*driver.get("https://www.google.com");
       driver.manage().window().maximize();
       Thread.sleep(3000);
       driver.close();*/
       driver.get("https://www.google.com/aclk?sa=L&ai=DChsSEwjlyIyuipCRAxVx7RYFHdQCAM0YACICCAEQAhoCdGw&co=1&ase=2&gclid=CjwKCAiA55rJBhByEiwAFkY1QIrFNub6UTP6_o-ptkfjqUwG5JzW7PsT_hWAdLKHaHlwtiEEGhQ0WhoCDNQQAvD_BwE&cid=CAASZuRos9t1FxOvdUmCV3JBispMQzMyAwoQ_GNQ2B42wL7qpxpuMRSheMQU-AnidIOmfDMOodRplGDintDzV2ukakCKf7H9PajNUTARYNLqwmMYa0rjtZrdTKUrR4ib2vqVdQalPMZe7w&cce=2&category=acrcp_v1_32&sig=AOD64_0tvsRh6qe7GyC8T9JA9f8TNIx8Qw&q&nis=4&adurl&ved=2ahUKEwip5IWuipCRAxUJka8BHQr-AIcQ0Qx6BAgOEAE");
       driver.findElement(By.cssSelector("p[data-cy='departureDate']")).click();
       driver.findElement(By.cssSelector(".DayPicker-Day.DayPicker-Day--today")).click();
       Thread.sleep(2000);
        }
    }

