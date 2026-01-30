package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gause\\Automation\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys("Aslam"); // id("id value")
        driver.findElement(By.name("inputPassword")).sendKeys("Aslam@123");// name("name value")
        driver.findElement(By.className("signInBtn")).click();    //classname("classvalue")
        System.out.println("1st Output expected" +driver.findElement(By.cssSelector("p.error")).getText()); //cssSelector("tagname.classname")
        driver.findElement(By.linkText("Forgot your password?")).click();//linkText("Link")
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ahmed"); //xpath("//tagname[@attribute='value'])
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Ahmed@gmail.com"); //css("tagname[attribute='value'])
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        //to find unique attribute using index valur Syntax //xpath("//tagname[@attribute='value'][index value])
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ahmed2@gmail.com");
        //to find unique attribute using index valur Syntax cssSelector("tagname=[attr='value']:nth-child(indexvalue))
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9999445554"); //xpath("//partenttag/childtag[index]")
        driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println("2nd Output expected" +driver.findElement(By.cssSelector("form p")).getText());//cssSelector("partenttag childtag[index]")
        Thread.sleep(2000);
        driver.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Asl");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input#chkboxOne")).click();
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
