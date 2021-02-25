package implementations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {
    WebDriver driver;

    public  void launchBrowser(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        // Instantiate a ChromeDriver class.




    }

    public  void launchGmailapp(){
        // Launch Website
        driver.get("https://mail.google.com/");

        //Maximize the browser
        driver.manage().window().maximize();


    }
    public  void enterUserID(){
        // entering username
        driver.findElement(By.id("identifierId")).sendKeys("gosusatya@gmail.com");



    }
    public  void clickOnNextButton(){
        // click on next button
        driver.findElement(By.id("identifierNext")).click();
        driver.findElement(By.name("adbs")).click();




    }
}
