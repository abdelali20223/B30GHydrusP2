package com.crm_app.pages;

import com.crm_app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US87_LMPage {

    public US87_LMPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']" )
    public WebElement loginButton;

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    public WebElement employeesTab;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[1]")
    public WebElement companyStructure;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement findEmployee;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[3]")
    public WebElement telephoneDirectory;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[4]")
    public WebElement staffChanges;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[5]")
    public WebElement efficiencyReport;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[6]")
    public WebElement honoredEmployees;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[7]")
    public WebElement birthdays;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[8]")
    public WebElement newPage;

    @FindBy(xpath = "//title[.='Company Structure']")
    public WebElement expectedTitle;

}




