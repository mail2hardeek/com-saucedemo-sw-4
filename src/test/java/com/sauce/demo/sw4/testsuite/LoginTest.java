package com.sauce.demo.sw4.testsuite;

import com.sauce.demo.sw4.pages.LoginPage;
import com.sauce.demo.sw4.pages.ProductPage;
import com.sauce.demo.sw4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginP = new LoginPage();

    ProductPage product = new ProductPage();

    @Test
    public void loginPage() {
        loginP.clickOnUserNameField("standard_user");
        loginP.clickOnPasswordField("secret_sauce");
        loginP.clickOnLoginButton();
    }

    @Test
    public void productPage() {
        loginP.clickOnUserNameField("standard_user");
        loginP.clickOnPasswordField("secret_sauce");
        loginP.clickOnLoginButton();
        //Verifying the actual and expected text
        String expectedMessage = "Products";
        Assert.assertEquals(product.getErrorMessage(), expectedMessage, "Error message not displayed");
        product.verifyThatSixProductsAreDisplayedOnPage();

    }


}
