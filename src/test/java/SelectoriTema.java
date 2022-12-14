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
    @Test
    public void deleteFromKart(){
        driver.findElement(By.cssSelector(".nav-5 .has-children")).click();
        driver.findElement(By.cssSelector(".product-info  .button")).click();
        driver.findElement(By.cssSelector(".option-blue .swatch-label")).click();
        driver.findElement(By.cssSelector(".option-xs .swatch-label")).click();
        driver.findElement(By.cssSelector(".add-to-cart .button")).click();
        driver.findElement(By.cssSelector(".a-center .btn-remove")).click();

        WebElement searchOk = driver.findElement(By.cssSelector(".page-title h1"));
        String expectedText = "SHOPPING CART IS EMPTY";
        String actualText = searchOk.getText();

        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void proceedToCheck() {
        driver.findElement(By.cssSelector(".nav-5 .has-children")).click();
        driver.findElement(By.cssSelector(".product-info  .button")).click();
        driver.findElement(By.cssSelector(".option-blue .swatch-label")).click();
        driver.findElement(By.cssSelector(".option-xs .swatch-label")).click();
        driver.findElement(By.cssSelector(".add-to-cart .button")).click();
        driver.findElement(By.cssSelector(".cart-totals .button")).click();

        WebElement searchOk = driver.findElement(By.cssSelector(".page-title h1"));
        String expectedText = "CHECKOUT";
        String actualText = searchOk.getText();

        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void sortBy() {
        driver.findElement(By.cssSelector(".nav-5 .has-children")).click();
        driver.findElement(By.cssSelector(".toolbar .sort-by select")).click();
    }

    @After
    public void close(){
        driver.close();
    }




























}
