package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gause\\Automation\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String name="Aslamggg";
        Locators2 pd=new Locators2();
        String pass=pd.getpassword(driver);
        driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputUsername")).sendKeys(name); // id("id value")
        driver.findElement(By.name("inputPassword")).sendKeys(pass);// name("name value")
        driver.findElement(By.className("signInBtn")).click();    //classname("classvalue")
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.tagName("p")).getText());//tagname(tagname)
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),"Hello "+name+",");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        Thread.sleep(1000);
        driver.close();
    }
    public String getpassword(WebDriver driver) throws InterruptedException {
        driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();//linkText("Link")
        Thread.sleep(1000);
        driver.findElement(By.className("reset-pwd-btn")).click();
        String password=driver.findElement(By.cssSelector("form p")).getText();//cssSelector("partenttag childtag[index]")
        //Now this string will have value as = Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordsplit=password.split("'");
        //Now this string will have value as = index of 0= Please use temporary password ' and index of 1= rahulshettyacademy' to Login.
        String[] passwordarray=passwordsplit[1].split("'"); //Now this string will have value as rahulshettyacademy' to Login.
        //after these split index of 0=rahulshettyacademy and index of 1=' to Login.
        String pswd=passwordarray[0]; //Now this string will have value as rahulshettyacademy
        return pswd;
    }
}
