import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectoriTema {
    private WebDriver driver;
    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
    @Test
    public void searchIcon(){
        driver.findElement(By.id("search")).sendKeys("SLIM FIT DOBBY OXFORD SHIRT");
        driver.findElement(By.cssSelector(".input-box button")).click();
        driver.findElement(By.cssSelector("[title='Next']")).click();
        driver.findElement(By.cssSelector("[id='product-collection-image-403']")).click();


        WebElement searchOk = driver.findElement(By.cssSelector(".h1"));
        String expectedText = "SLIM FIT DOBBY OXFORD SHIRT";
        String actualText = searchOk.getText();

        Assert.assertEquals(expectedText,actualText);


    }
//    @After
//    public void close(){
//        driver.close();
//    }




























}
