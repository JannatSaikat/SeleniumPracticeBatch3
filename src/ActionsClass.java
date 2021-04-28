import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/jsaikat/Batch3/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com");
        //We want to click Alexa but frist want to scroll to that link
        //*[@id="navFooter"]/div[4]/table/tbody/tr[1]/td[13]/a/span
        WebElement alexa = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[4]/table/tbody/tr[1]/td[13]/a/span"));
        WebElement magSubs = driver.findElement(By.xpath(" //*[@class='a-section a-spacing-base a-spacing-top-medium a-padding-none a-text-center rhf-fresh-header']"));

        Actions actions = new Actions(driver);
//        Thread.sleep(10000);
//        actions.moveToElement(alexa).build().perform();

        actions.moveToElement(magSubs).build().perform();
        Thread.sleep(3000);
        actions.doubleClick().build().perform();


        alexa.click();
        driver.quit();



    }
}
