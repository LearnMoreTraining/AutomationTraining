package stepdefination;

import helper.TextBoxHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuableutilities.BrowserCall;
import resuableutilities.ExcelReader;

import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;

public class ErrorMessageValidationSteps extends BrowserCall {

    private WebDriver driver;
    private Select currencyDropdown;
    private WebElement currenyElement;
    private static TextBoxHelper textBoxHelper;

    @Then("User Validates the error message")
    public void validateError(){

        int a= 1;

        String s="    Learnmore Hi    ";
        s.length();
        String u ="Institution";
        s.concat(u);
        u.toLowerCase();

        u.substring(4,7);
        s.trim();

        u.charAt(4);

        s.equals(u);
        u.replace('I','A');
    }

    @Given("User should navigate to the homepage")
    public void homepageValidation(){

       driver = BrowserCall.browserCall();

    }

    @When("Execute Map")
    public void mapExecution(){

     List<WebElement> key =   driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr/th"));

     List<WebElement> value =  driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr/td[not(contains(@class,'-image logo'))]")) ;

     Map<String,String> map = new HashMap<String,String>();

     List<String> keyText = new ArrayList<String>();
     List<String> valueText = new ArrayList<String>();

     for(int i=0; i<key.size();i++){

            keyText.add(getListValues(i,key));
            valueText.add(getListValues(i,value));
            map.put(getListValues(i,key),getListValues(i,value));
     }

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the required Key");
     String userInput = sc.next();

        if (keyText.contains(userInput)) {

            for(String keyValue:keyText){

                if(keyValue.equals(userInput)){

                    map.get(userInput);
                    break;
                }
            }

        }

    }

    public String getListValues(Integer i ,List<WebElement> e ){

       return e.get(i).getText().trim();
    }

    @Given("User Navigates to the login page")
    public void login(){

       driver =  BrowserCall.browserCall();
    //   textBoxHelper=  TextBoxHelper.getIntance(driver);



    }

    @When("User enter the username and password")
    public void user_enter_the_username_and_password() throws IOException {
        textBoxHelper.setText(By.id("username"),"Learnmore");
        String val= textBoxHelper.getText(By.xpath("//label[@for='username']"));
        System.out.println(val);
          }


    @When("Set example")
    public  void setEx(){
        WebElement footer = driver.findElement(By.id("nav_menu-2"));
       List<WebElement> links= footer.findElements(By.tagName("a"));
       for (WebElement a:links){
          String clickLink= Keys.chord(Keys.CONTROL,Keys.ENTER) ;
           a.sendKeys(clickLink);
       }

       Set<String> handle=driver.getWindowHandles();
       for (String u:handle) {
          String title= driver.switchTo().window(u).getTitle();
           System.out.println(title);

       }
       driver.switchTo().defaultContent();

    }


    @When("user Enters the username {string} and password {string}")
    public  void enterUsernamePassword(String username, String passwrod){

        WebElement us ;
        WebElement pw;
        us  =driver.findElement(By.id("username"));
       pw = driver.findElement(By.name("pw"));

       driver.findElement(By.linkText("Forgot Your Password?")).click();
       driver.findElement(By.linkText("Madurai District, Government of Tamilnadu | Athens of the ...")).click();

       driver.findElement(By.partialLinkText("Forgot Your Password?")).click();

        driver.findElement(By.xpath("//a[text()='Forgot Your Password?']")).click();
        us.sendKeys(username);
        pw.sendKeys(passwrod );
        driver.navigate().refresh();
        try {
            us.sendKeys(username);
            pw.sendKeys(passwrod );
        }
        catch (Exception e){
            us =driver.findElement(By.id("username"));
            pw = driver.findElement(By.name("pw"));
            us.sendKeys(username);
            pw.sendKeys(passwrod );
            e.printStackTrace();

        }




    }

    @And("User clicks the login button")
    public void clickLogin(){

        driver.findElement(By.id("Login")).click();

    }

    @When("user Enters the username Aravinth and password {int}")
    public void enter(Integer int1) {

    }


    @Given("User Navigates to the Spicejet homepage")
    public void launchSpiceJet() {

        System.setProperty("webdriver.chrome.driver","D:\\SeleniumFiles\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://book.spicejet.com/");

    }

    @When("User clicks the currency dropdown")
    public void user_clicks_the_currency_dropdown() {

        currenyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));

        currencyDropdown = new Select(currenyElement);

    }

    @Then("User selects the specified value from the dropdown")
    public void user_selects_the_specified_value_from_the_dropdown() {

      //  currencyDropdown.selectByIndex(3);

        //currencyDropdown.selectByVisibleText("OMR");

        currencyDropdown.selectByValue("CAD");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
        wait.pollingEvery(Duration.ofMillis(10));
        wait.ignoring(NoSuchElementException.class);

    }


    @And("User rerives the values")
    public void retrvie(){

     List<WebElement> list = currenyElement.findElements(By.tagName("option"));

        for(WebElement e:list){
                e.getText();

        }

    }

    @Given("Wiki tabel")
    public void wiki(){

        System.setProperty("webdriver.chrome.driver","D:\\SeleniumFiles\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/Vikram_(2022_film)");


       WebElement vikramTabelElement = driver.findElement(By.xpath("//table[@class='infobox vevent']"));

       int vikramTableRowCount = vikramTabelElement.findElements(By.tagName("tr")).size();

        System.out.println(vikramTableRowCount);

        int vikramTablrColumnCount = vikramTabelElement.findElements(By.tagName("th")).size();


        for(int i=0;i <vikramTablrColumnCount ;i++ ){

           String out= vikramTabelElement.findElements(By.tagName("th")).get(i).getText();
            System.out.println(out);

        }


    }


    @Given("User navigate to the homepage")
    public void naviageToHomePage() {
     driver = BrowserCall.browserCall();
    }
    @When("User Selects the Specified value from the From Dropdown")
    public void user_selects_the_specified_value_from_the_from_dropdown() {

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='GOI']")).click();
    }
    @When("User Selects the Specified value from the To Dropdown")
    public void user_selects_the_specified_value_from_the_to_dropdown() {

        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();
       // WebElement fromDropdown = driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
       // fromDropdown.findElement(By.xpath("//a[@value='MAA']")).click();
    }

    @When("User selects the Autosuggestive value")
    public void selectAuto() throws InterruptedException {

        driver.findElement(By.name("flying_from_N")).click();

        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("flying_from")));

        WebElement fromDropdown = driver.findElement(By.name("flying_from"));
        fromDropdown.sendKeys("che");

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("flying_from")));
        int i=0;
        while(i<4) {
            fromDropdown.sendKeys(Keys.ARROW_DOWN);
            i++;
        }
        fromDropdown.sendKeys(Keys.ENTER);


    }


    @Given("Frame Validation")
    public void frameValidation() {

       driver= BrowserCall.browserCall();

      WebElement frameHandling = driver.findElement(By.className("demo-frame"));
       driver.switchTo().frame(frameHandling);

       Actions actions = new Actions(driver);

       WebElement drag= driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
       WebElement drop = driver.findElement(By.id("droppable"));
       actions.dragAndDrop(drag,drop).build().perform();

       driver.switchTo().defaultContent();



    }

}
