package implementations;

import Utils.Weblocators;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.sql.Driver;
import java.util.*;

public class AmazonImpl {
    WebDriver driver;
    Weblocators weblocators = new Weblocators();

    public void launchAmazonWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Github\\test-bdd-existing\\test-bdd-existing\\src\\test\\resources\\data\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

    }

    public void selectdepartment(String department) {
        Select deptselect = new Select(driver.findElement(By.xpath(weblocators.amazonDeptSelectXpath)));
        deptselect.selectByVisibleText(department);

         }

    public void enterAProductName(String productName) throws InterruptedException {
        driver.findElement(By.xpath(weblocators.amazonEnterProductXpath)).sendKeys(productName);
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }

    public void popUPWindow(){
        /*swith to child to parent window examples*/
        /*String parentWindow  = driver.getWindowHandle();
        String subwindow = null;
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()){
            subwindow = iterator.next();
        }
        driver.switchTo().window(subwindow);
        driver.findElement(xpath(ajgkljgkjs));
        driver.findElement(xpath.closewindow);
        driver.switchTo().window(parentWindow);*/


    }

    public void validateProductPrice() {
        //for looper i =0
        String price = driver.findElement(By.xpath("//div[@data-index='1']//span[@class='a-size-base a-color-secondary']")).getText();
        System.out.println("price: "+price);
    }

    public void mouseHoverOnRating() {
        WebElement ratingElement =driver.findElement(By.xpath("//div[@data-index='1']//i[@class='a-icon a-icon-star-small a-star-small-5 aok-align-bottom']"));
        WebElement ratingElement2 =driver.findElement(By.xpath("//div[@data-index='2']//i[@class='a-icon a-icon-star-small a-star-small-5 aok-align-bottom']"));

        Actions actions = new Actions(driver);
       // actions.moveToElement(ratingElement).build().perform();
       // actions.doubleClick().build().perform();
       // actions.contextClick() is right click

        //WebElement rating17ThElement = driver.findElement(By.xpath("//div[@data-index='17']//i[@class='a-icon a-icon-star-small a-star-small-5 aok-align-bottom']"));
        //actions.dragAndDrop(ratingElement, ratingElement2).build().perform();
       // actions.keyUp(Keys.CONTROL).sendKeys("a").build().perform();
        actions.moveToElement(ratingElement2,12, 12).build().perform();


    }

    public void selectABrand(String brandName, String brandName2) throws InterruptedException {
        WebElement brandSelection = driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[text()='"+brandName+"']"));
        if(!brandSelection.isSelected()) {
            brandSelection.click();
        }
        System.out.println("brandname: "+ brandName+ " is selected!");
        WebElement brand2Selection = driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[text()='"+brandName2+"']"));
        if(!brand2Selection.isSelected()) {
            brand2Selection.click();
        }
        Thread.sleep(10000);
        WebElement brand1Selection = driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[text()='"+brandName+"']"));
        if(brand1Selection.isEnabled()){
            brand1Selection.click();
        }


    }

    public void gmailLaunch() {
        driver.navigate().to("https://semantic-ui.com/modules/popup.html#/examples");

        /*:alrert haandling:*/
        //driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().sendKeys("21");

        /*popup handling*/
        driver.findElement(By.xpath("//div[@id='languages']")).click();
        //WebElement popUpSet =driver.findElement(By.xpath("//div[@class='menu transition visible']"));
        /*driver.getWindowHandle();
            driver.switchTo().window(1);
        driver.findElement(By.xpath("//body[@class='popup pushable']//div[@id='languages']")).sendKeys("English");
*/

    }
}
