package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdressPage {
    private WebDriver driver;

    public AdressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".title-buttons span span")
    private WebElement setAddNewAdress;

    @FindBy(id = "firstname")
    private WebElement nameField;

    @FindBy(id = "lastname")
    private WebElement lastNameField;

    @FindBy(id = "telephone")
    private WebElement telField;

    @FindBy(id = "street_1")
    private WebElement strField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "region_id")
    private WebElement regField;

    @FindBy(id = "zip")
    private WebElement zipField;

    @FindBy(css = ".buttons-set .button")
    private WebElement saveAdress;

    @FindBy(css = ".success-msg span")
    private WebElement msgAdress;






    public void clickAddNewAdress(){
        setAddNewAdress.click();
    }

    public void setNameField(String value){
        nameField.sendKeys(value);
    }

    public void setLastNameField(String value){
        lastNameField.sendKeys(value);
    }

    public void setTelField(String value){
        telField.sendKeys(value);
    }

    public void setStrField(String value){
        strField.sendKeys(value);
    }

    public void setCityField(String value){
        cityField.sendKeys(value);
    }

    public void setRegField(String value){
        regField.sendKeys(value);
    }

    public void setZipField(String value){
        zipField.sendKeys(value);
    }

    public void clickSaveeAdress(){
        saveAdress.click();
    }

    public String chkMsg(){
        return msgAdress.getText();
    }





























}
