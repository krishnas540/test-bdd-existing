package implementations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreyHoundImpl {
    WebDriver driver;

    public void launchTheapplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\my-test-framework\\src\\test\\resources\\data\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.greyhound.com/");
        driver.manage().window().maximize();

    }

    public void clickOnBookaTrip() {
        driver.findElement(By.xpath("//a[@class='dropdown-parent no-overview book-a-trip-nav']")).click();
    }

    public void bookNow() {
        driver.findElement(By.xpath("//a[text()= 'Book Now']")).click();
    }

    public void bookingTemplate() {
        String templateName =driver.findElement(By.xpath("//h2[text()='Book A Trip']")).getText();
        System.out.println(templateName);
        Assert.assertTrue(templateName.equals("BOOK A TRIP"));

    }

    public void closeBrowser() {
        driver.close();
    }
}
