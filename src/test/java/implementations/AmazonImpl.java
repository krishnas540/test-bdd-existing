package implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testNG.StringParameters;

public class AmazonImpl {
    WebDriver driver;
    StringParameters stringParameters = new StringParameters();
    public void lauchTheAmazonapp(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\my-test-framework\\src\\test\\resources\\data\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }

    public void selectTheLanguage() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='a-label a-radio-label' and contains(text(), 'Español - ES')]")).click();



    }

    public void clickonLinkText() throws InterruptedException {
        driver.findElement(By.linkText("Start here.")).click();
        driver.findElement(By.linkText("Sign-In")).click();
        driver.findElement(By.partialLinkText("Need")).click();




    }
}
