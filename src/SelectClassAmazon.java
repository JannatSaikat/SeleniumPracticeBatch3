import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAmazon {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/jsaikat/Batch3/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");


        WebElement category = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select = new Select(category);
        select.selectByIndex(6);
        Thread.sleep(1000);
        select.selectByValue("search-alias=aps");

    }
}
