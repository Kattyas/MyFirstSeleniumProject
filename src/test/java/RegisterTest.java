import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    private WebDriver driver;

    @Before
    public void initDriver(){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void registerTest(){

        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Register']")).click();
        driver.findElement(By.id("firstname")).sendKeys("Kata");
        driver.findElement(By.id("lastname")).sendKeys("Katty");
        driver.findElement(By.id("email_address")).sendKeys("A@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("1234567890");
        driver.findElement(By.id("confirmation")).sendKeys("1234567890");
        driver.findElement(By.id("is_subscribed")).click();

    }
    @After
    public void close(){
        driver.close();
    }
}
