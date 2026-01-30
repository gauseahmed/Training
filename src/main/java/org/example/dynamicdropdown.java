package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class dynamicdropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\gause\\Automation\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Checkbox Selection
       /*System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
       System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        */

        //Checkbox Selection validation using Assertion
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Assert.assertFalse(false);
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Assert.assertTrue(true);


        //Dropdowm Selection
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //if we want to select value of 1st (source)dropdown
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(1000);
        //if we want to select value of 2nd (destination)dropdown
        //driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
        //Method 2 of above example without using index value. use parent to child relationship using xpath
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='JAI']")).click();

        //Handling calendar
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
        Thread.sleep(1000);


        //Handling Auto suggested dropdowns
        driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("Ind"); //by this ip we get list
        Thread.sleep(1000);
        //Syntax = List<Webelement> variable=Xpath of list (not exact value)
        List<WebElement> valuesoflist = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement value : valuesoflist) // storing list in a value(by creating variable) which is web element
        {
            if (value.getText().equalsIgnoreCase("India")) {
                value.click();
                break;// using break statement it will come out of loop as we got what we need.
            }
        }


        //calendar to handle TO date when it is disabled
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) {
            System.out.println("Its Enabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("Disabled");
            Assert.assertTrue(false);
        }

        Thread.sleep(5000);
        driver.close();


    }
}
