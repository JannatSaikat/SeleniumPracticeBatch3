import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jsaikat/Batch3/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://etsy.com");

        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);


//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='sign-in']")));

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
        driver.findElement(By.xpath("//button[@value='sign-in']")).click();

        Thread.sleep(5000);
//        Thread.sleep();
        driver.quit();
    }
}
