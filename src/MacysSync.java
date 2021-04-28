import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.rmi.server.ExportException;
import java.util.concurrent.TimeUnit;

public class MacysSync {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/jsaikat/Batch3/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://macys.com");

        driver.findElement(By.cssSelector("a[id='closeButton']")).click();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"footer-redesign-row-1-panels-container\"]/div[3]/label/ul/li[2]/a"))));
//https://demoqa.com/browser-windows

        driver.findElement(By.xpath("//*[@id=\"footer-redesign-row-1-panels-container\"]/div[3]/label/ul/li[2]/a")).click();
    }
}
