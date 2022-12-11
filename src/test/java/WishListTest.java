import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
    @Test
    public void addToWishlistTest(){
        driver.findElement(By.cssSelector(".nav-5 .has-children")).click();
        driver.findElement(By.cssSelector(".product-info  .button")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();
        driver.findElement(By.id("email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".nav-5 .has-children")).click();
        driver.findElement(By.cssSelector(".product-info  .button")).click();
        driver.findElement(By.cssSelector(".link-wishlist")).click();



        WebElement adToWish = driver.findElement(By.cssSelector(".success-msg span"));
        String expectedText = "Slim fit Dobby Oxford Shirt has been added to your wishlist. Click here to continue shopping.";
        String actualText = adToWish.getText();

        Assert.assertEquals(expectedText,actualText);

    }
    @After
    public void close(){
       driver.close();
    }






}
