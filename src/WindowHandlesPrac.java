import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlesPrac {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/jsaikat/Batch3/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        String currentWindow = driver.getWindowHandle();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText());

        driver.findElement(By.xpath("//*[@id='windowButton']")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();


        while (iterator.hasNext()) {
            String newWindow = iterator.next();

            if(!currentWindow.equalsIgnoreCase(newWindow)){
                driver.switchTo().window(newWindow);
                driver.manage().window().maximize();
                System.out.println(driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText());
            }

            driver.switchTo().window(currentWindow);
            System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div")).getText());


        }


    }
}
