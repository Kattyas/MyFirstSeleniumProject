package Tests;

import Pages.HomePage;
import Pages.SearchResultsPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void searchByKeywordTest(){
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);


        homePage.setSearchField("neck");
        Assert.assertTrue(searchResultsPage.isProductInList("SILVER DESERT NECKLACE"));
        homePage.setSearchField("shirt");
        Assert.assertTrue(searchResultsPage.isProductInList("FRENCH CUFF COTTON TWILL OXFORD"));


    }








    @After
    public void close(){
        driver.close();
    }

}
