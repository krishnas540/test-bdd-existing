package implementations;

import com.sun.tools.xjc.reader.xmlschema.BindYellow;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreyHoundImpl {
    WebDriver driver;

    public void launchTheapplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Github\\test-bdd-existing\\test-bdd-existing\\src\\test\\resources\\data\\chromedriver.exe");
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

    public void enterUserName(String userName) {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);

    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void clickToLogin() {
        driver.findElement(By.xpath("//button[@id='rewards-login-go']")).click();
    }

    public void logInStatus(String status) {
        String message = driver.findElement(By.xpath("//div/label[text()='Sorry, your login was not successful. Check and try again.']")).getText();
        System.out.println("message" +message);
        //Assert.assertTrue(message.contains(status));
        Assert.assertEquals(status,message);
    }

    public void enterfromlocation(String from) {
        driver.findElement(By.xpath("//input[@id='fromLocation']")).sendKeys(from);
    }

    public void entertolocation(String to) {

        driver.findElement(By.xpath("//input[@id='toLocation']")).sendKeys(to);

    }

    public void enterddate(String ddate) {
        driver.findElement(By.xpath("//input[@id='datepicker-from']")).sendKeys(ddate);
    }

    public void enterrdate(String rdate) {

        driver.findElement(By.xpath("//input[@id='datepicker-to']")).sendKeys(rdate);
    }


    public void clicktosearchtrip() throws InterruptedException {

        //driver.findElement(By.xpath("//input[@id='fare-search-btn']")).click();

    }

    public void validateTripDetailMessage(String message) throws InterruptedException {
        Thread.sleep(30000);
        String Tripmessage = driver.findElement(By.xpath("//h1[contains(text(), 'Choose your outgoing trip')]")).getText();
        Assert.assertTrue(Tripmessage.contains(message));
        driver.close();
    }
}
