package com.crm_app.pages;

import com.crm_app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
    public LoginPage2(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[name=\'USER_LOGIN\']")
    public WebElement usernameBox;

    @FindBy(css = "input[name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(css = "input[type='submit']")
    public WebElement loginButton;
}
