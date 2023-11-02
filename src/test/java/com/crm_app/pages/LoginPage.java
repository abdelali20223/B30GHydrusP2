package com.crm_app.pages;

import com.crm_app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type='text']")
    public WebElement userInputBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement logInButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBoxRememberME;

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement incorrectLoginOrPasswordText;

    public void login(String username, String password){

        userInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        logInButton.click();

    }




}
