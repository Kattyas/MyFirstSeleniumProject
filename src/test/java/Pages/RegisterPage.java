package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "firstname")
    private WebElement nameField;

    @FindBy(id = "lastname")
    private WebElement lastNameField;

    @FindBy(id = "email_address")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passField;

    @FindBy(id = "confirmation")
    private WebElement confPassField;

    @FindBy(id = "is_subscribed")
    private  WebElement subsButton;






    public void setNameField(String value){
        nameField.sendKeys(value);
    }

    public void setLastNameField(String value){
        lastNameField.sendKeys(value);
    }

    public void setEmailField(String value){
        emailField.sendKeys(value);
    }

    public void setPassField(String value){
        passField.sendKeys(value);
    }

    public void setConfPassField(String value){
        confPassField.sendKeys(value);
    }

    public void clickSubsButton(){
        subsButton.click();
    }












}
