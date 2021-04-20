import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WellsTests {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jsaikat/Batch3/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://Wellsfargo.com");
//        driver.findElement(By.xpath("//input[@value='Sign On']")).click();  //relative xpath
//        driver.findElement(By.cssSelector("input[value='Sign On'] ")).click(); //cssSelector
//        driver.findElement(By.id("btnSignon")).click();
       driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/div/div/div/form/div[4]/input")).click(); //absolute xpath

    }
}
