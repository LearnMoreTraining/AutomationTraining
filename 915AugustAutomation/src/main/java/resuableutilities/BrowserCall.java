package resuableutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserCall {

    public static WebDriver browserCall() {

        String path = System.getProperty("user.dir");

        System.out.println(path);

        System.setProperty("webdriver.chrome.driver",path + "/src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

       // driver.get("https://www.travolook.in/");

        driver.navigate().to("https://en.wikipedia.org/wiki/Cognizant");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.manage().window().maximize();

        return driver;
    }

    public static int m1(){
        int a= 1;

        return a;
    }

    public  static String m2(){

        String f ="aravinth";

        return f;
    }


}
