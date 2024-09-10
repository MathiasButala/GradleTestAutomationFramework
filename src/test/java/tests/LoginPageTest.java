package tests;

import PageModels.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void isLoginPageDisplayed(){
        var loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.IsPageLoaded());
    }

    @Test
    public void loginToHomepage(){
        var loginPage = new LoginPage(driver);
        loginPage.EnterUserName("standard_user");
        loginPage.EnterPassword("secret_sauce");
        var homePage = loginPage.ClickLoginButton();
        Assert.assertTrue(homePage.IsPageLoaded());
    }

    @Test
    public void verifyProductCount(){
        var loginPage = new LoginPage(driver);
        loginPage.EnterUserName("standard_user");
        loginPage.EnterPassword("secret_sauce");
        var homePage = loginPage.ClickLoginButton();
        Assert.assertTrue(homePage.IsPageLoaded());
        var products = homePage.GetProductsOnPage();
        Assert.assertEquals(products.size(), 6);
    }
}