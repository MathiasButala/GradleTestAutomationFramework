package PageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(css = "#login-button")
    public WebElement loginButton;

    public By userName = By.cssSelector("#user-name");

    public By password = By.cssSelector("#password");

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean IsPageLoaded(){
        return loginButton.isDisplayed();
    }

    public void EnterUserName(String name){
        driver.findElement(userName).sendKeys(name);
    }

    public void EnterPassword(String pw){
        driver.findElement(password).sendKeys(pw);
    }

    public Homepage ClickLoginButton(){
        loginButton.click();
        return new Homepage(driver);
    }
}