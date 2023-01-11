package Tests;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
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

        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);


        homePage.clickAccountButton();
        homePage.clickRegisterLink();
        registerPage.setNameField("Kata");
        registerPage.setLastNameField("Katty");
        registerPage.setEmailField("A@yahoo.com");
        registerPage.setPassField("1234567890");
        registerPage.setConfPassField("1234567890");
        registerPage.clickSubsButton();


    }
    @After
    public void close(){
        driver.close();
    }
}
