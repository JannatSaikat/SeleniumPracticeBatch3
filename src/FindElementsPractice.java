import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/jsaikat/Batch3/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://spicejet.com");
//        driver.navigate().to("https://fb.me");
//        driver.navigate().back();


//        List<WebElement> footerSites = driver.findElements(By.xpath("//td[@class='navFooterDescItem']"));
//
//        for (WebElement site : footerSites) {
//            System.out.println(site.getText());
//        }

        System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date2']")).isDisplayed());
        System.out.println("YUY");
        driver.manage().window().fullscreen();


    }
}
