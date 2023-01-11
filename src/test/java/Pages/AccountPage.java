package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = ".hello strong")
    private WebElement welcomeTextElement;

    @FindBy(css = ".nav-5 .has-children")
    private WebElement saleElement;

    @FindBy(css = ".box-info .box-head a")
    private WebElement manageAdress;









    public String getWelcomeText(){
       return welcomeTextElement.getText();
    }

    public void clickOnSale(){
        saleElement.click();
    }

    public void clickManageAdress(){
        manageAdress.click();
    }








}
