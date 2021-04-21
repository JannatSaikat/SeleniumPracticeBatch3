import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSelectPractice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/jsaikat/Batch3/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr[3]/td[5]/a")).click();
    }
}
