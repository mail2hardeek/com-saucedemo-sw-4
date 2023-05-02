package com.sauce.demo.sw4.pages;

import com.sauce.demo.sw4.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName = By.id("user-name");
    By password = By.name("password");
    By clickButton = By.name("login-button");


    //Element for username and sending text to username field
    public void clickOnUserNameField(String userID) {
        sendTextToElement(userName, userID);
    }

    //Finding Element for password and sending text to password field
    public void clickOnPasswordField(String password1) {
        sendTextToElement(password, password1);
    }

    // click on login button and perform click
    public void clickOnLoginButton() {
        clickOnElement(clickButton);

    }

}