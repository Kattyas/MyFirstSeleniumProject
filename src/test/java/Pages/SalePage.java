package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalePage {
    private WebDriver driver;

    public SalePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".product-info  .button")
    private WebElement viewDetails;



    public void clickViewDetails(){
        viewDetails.click();
    }








}
