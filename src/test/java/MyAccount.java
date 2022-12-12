import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccount {
    private WebDriver driver;
    @Before
    public void initDriverLogin(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
    }
    @Test
    public void addNewAdress(){
        driver.findElement(By.cssSelector(".box-info .box-head a")).click();
        driver.findElement(By.cssSelector(".title-buttons span span")).click();
        driver.findElement(By.id("firstname")).sendKeys("Cosmin");
        driver.findElement(By.id("lastname")).sendKeys("Fast");
        driver.findElement(By.id("telephone")).sendKeys("03555555");
        driver.findElement(By.id("street_1")).sendKeys("StrStr");
        driver.findElement(By.id("city")).sendKeys("City");
        driver.findElement(By.id("region_id")).sendKeys("Alabama");
        driver.findElement(By.id("zip")).sendKeys("11111");
        driver.findElement(By.cssSelector(".buttons-set .button")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector(".success-msg span"));

        String expectedText = "The address has been saved.";
        String actualText = welcomeTextElement.getText();

        Assert.assertEquals(expectedText,actualText);


    }
    @After
    public void close(){
        driver.close();
    }
























}
