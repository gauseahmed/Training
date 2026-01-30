package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.Chrome.driver","C:\\Users\\gause\\Automation\\Browser Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //First identify webelement as below
        WebElement adrs=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        //After identify webelement create variable using select class and pass above web element to go particular dropdown
        Select dropdown=new Select(adrs);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        driver.close();
    }
}
