package com.SeleniumTests;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.Test;


 public class TryTest {

     @Test
     public void opengoogle(){
        System.setProperty("webdriver.chrome.driver","/Users/Kaushik/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("testing");
        driver.manage().window().maximize();
    }
}