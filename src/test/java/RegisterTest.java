import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    public void registerTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Kata");
        driver.findElement(By.id("lastname")).sendKeys("Katty");
        driver.findElement(By.id("email_address")).sendKeys("A@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("1234567890");
        driver.findElement(By.id("confirmation")).sendKeys("1234567890");
        driver.findElement(By.id("is_subscribed")).click();

        driver.close();





    }
}
