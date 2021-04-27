import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitPractice {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jsaikat/Batch3/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://etsy.com");

        driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();
        Thread.sleep(10000);

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS );

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123");
        driver.findElement(By.xpath("//button[@value='sign-in']")).click();


    }
}
