import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jsaikat/Batch3/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.cssSelector("input[id='alertbtn']")).click();

            Thread.sleep(3000);

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();
    }
}
