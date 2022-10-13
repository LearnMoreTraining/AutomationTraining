package com.demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resuableutilities.BrowserCall;

public class Aravinth
{

    public static void main(String[] args) {

        WebDriver driver = BrowserCall.browserCall();
      String te=  driver.findElement(By.xpath("//div[@class='login_password']")).getAttribute("innerText");
        System.out.println(te);

       Boolean field = driver.findElement(By.id("123")).isEnabled(); //true
       String enab= driver.findElement(By.id("marketDate_2")).getAttribute("style");
        enab.contains("0.5");

        String alertMessage = driver.findElement(By.id("")).getText();
        String Expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        Assert.assertEquals(Expected,alertMessage);

        driver.switchTo().alert().sendKeys("Aravinth");
        driver.switchTo().alert().accept();






    }
}
