import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemSolving {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/jsaikat/Batch3/driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://fb.me");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));

        System.out.println(password.isEnabled());

        System.out.println("anythoing");

        int i = 9/0;

        System.out.println("two");

        System.out.println("three");

        driver.findElement(By.xpath("ewjrekj")).isEnabled();


    }
}
