package implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeImpl {
        WebDriver driver;

  /*  public void launchAmazonPractoceWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Github\\test-bdd-existing\\test-bdd-existing\\src\\test\\resources\\data\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

    }

    public void selectsignin() {
        driver.findElement(By.xpath("//a[@class='login']")).click();
    }
    public void enteremail(String email) {
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);
    }
    public void account() {
        driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
    }
*/
    public void launchapplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Github\\test-bdd-existing\\test-bdd-existing\\src\\test\\resources\\data\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }


    public void clickOnSignin() {

        driver.findElement(By.xpath("//a[@class='login']")).click();
    }

    public void enteremail(String email) {

        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(email);

    }

    public void clickOnCreateAccount() {
        driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

    }

}
