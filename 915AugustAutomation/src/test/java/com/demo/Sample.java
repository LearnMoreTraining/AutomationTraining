package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\SeleniumFiles\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");

        driver.findElement(By.id("username")).sendKeys("aravinth" + Keys.ENTER);

        driver.findElement(By.name("pw")).sendKeys("1234");

        driver.findElement(By.id("Login")).click();

       String actualErrorMessage = driver.findElement(By.id("error")).getText();

       String expectedErrorMessage = " check your username and password. If you still can't log in, contact your Salesforce administrator.";

        System.out.println(actualErrorMessage);

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Pass");
        }
        else{
            System.out.println("fail");
        }


    }

}
