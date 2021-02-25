package implementations;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UarkadmissionImpl {
    WebDriver driver;

    public  void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        driver=new ChromeDriver();
        // Instantiate a ChromeDriver classs
    }

    public  void launchUarkwebsite(){
        // Launch Website
        driver.get("https://www.uark.edu/");

        //Maximize the browser
        driver.manage().window().maximize();


    }
    public  void mouseHoverOnAdmission() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement admissions = driver.findElement(By.xpath("//*[@id=\"mainnav\"]/li[1]/a"));
        actions.moveToElement(admissions);
        Thread.sleep(5000);
        WebElement ttd = driver.findElement(By.xpath("//*[@id=\"mainnav\"]/li[3]/ul/li[1]/a"));
        actions.moveToElement(ttd);
        actions.click().build().perform();
        Thread.sleep(5000);
        System.out.println("hey I am on admissions waiting for you!");
    }

    public  void clickOnAdmissions(){
        driver.findElement(By.xpath("//*[@id=\"mainnav\"]/li[1]/a")).click();

    }
    public  void applyforAdmission(){
         driver.findElement(By.xpath("//*[@id=\"main-container\"]/section[2]/div/div/div[1]/ul/li[1]/a")).click();
    }

    public void graduateApplication(){
        driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div/div[2]/div/p[1]/a")).click();

    }


}
