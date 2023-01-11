package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SlimFitPage {

    private WebDriver driver;

    public SlimFitPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".link-wishlist")
    private WebElement addToWish;


    public void setAddToWish() {
        addToWish.click();
    }
}
