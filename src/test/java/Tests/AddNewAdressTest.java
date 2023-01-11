package Tests;

import Pages.AccountPage;
import Pages.AdressPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AddNewAdressTest {

    private WebDriver driver;

    public void AddNewAdress(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Before
    public void initDriverLogin(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

    }
    @Test
    public void addNewAdress(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        AdressPage adressPage = new AdressPage(driver);



        homePage.clickAccountButton();
        homePage.clickLoginLink();
        loginPage.setEmailField("cosmin@fasttrackit.org");
        loginPage.setPasswordField("123456");
        loginPage.clickLoginButton();
        accountPage.clickManageAdress();
        adressPage.clickAddNewAdress();
        adressPage.setNameField("Cosmin");
        adressPage.setLastNameField("Fast");
        adressPage.setTelField("03555555");
        adressPage.setStrField("StrStr");
        adressPage.setCityField("StrStr");
        adressPage.setRegField("City");
        adressPage.setZipField("11111");
        adressPage.clickSaveeAdress();


        Assert.assertEquals("The address has been saved.",adressPage.chkMsg());


    }
    @After
    public void close(){
        driver.close();
    }


























}
