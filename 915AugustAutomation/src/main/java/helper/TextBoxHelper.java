package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxHelper {


    // Instance method

   private static TextBoxHelper textBoxHelper; //null
   private static WebDriver webDriver;
   private WebElement element;

   private TextBoxHelper(WebDriver driver){
       webDriver=driver;
   }

    public static TextBoxHelper getIntance(WebDriver driver){

       if(textBoxHelper == null) {
           textBoxHelper = new TextBoxHelper(driver);
       }
         return textBoxHelper;

    }


    public String getText(By locater){
       element= webDriver.findElement(locater);
       String value = element.getText();
       return value;
    }

    public void setText(By locate,String textValue){
      element= webDriver.findElement(locate);
      element.sendKeys(textValue);

    }

    public void clearText(By locater){
       webDriver.findElement(locater).clear();
    }







}
