package com.crm_app.pages;

import com.crm_app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class SendMessagePage {
    public SendMessagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "input[name=\'USER_LOGIN\']")
    public WebElement usernameBox;

    @FindBy(css = "input[name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(css = "input[type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement usernameDropdown;

    @FindBy(xpath = "(//span[.='Message'])[1]")
    public WebElement messageButton;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messagePostTextBox;

    @FindBy(css = ".bx-editor-iframe")
    public WebElement messageIframe;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement titleNotSpecifyError;

    @FindBy(css = ".feed-add-post-del-but")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement pleaseSpecifyErrorMessage;

    @FindBy(xpath = "//span[@data-id='UA']")
    public WebElement allEmployeesText;

    @FindBy(xpath = "(//button[.='Cancel'])[3]")
    public WebElement cancelButton;
}


