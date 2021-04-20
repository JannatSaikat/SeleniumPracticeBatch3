import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/jsaikat/Batch3/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@mail.com");
        driver.findElement(By.id("pass")).sendKeys("pass0111");
        driver.findElement(By.xpath("//button[@name='login']")).click();





    }
}
