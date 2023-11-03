package com.crm_app.pages;

import com.crm_app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US87_LMPage {

    public US87_LMPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesTab;

    @FindBy(xpath = "//div[@id=\"top_menu_id_company_3271504278\"]")
    public WebElement companyStructure;

    @FindBy(xpath = "//div[@id='top_menu_id_company_342409671']")
    public WebElement findEmployee;

    @FindBy(xpath = "//div[@id='top_menu_id_company_2000783151']")
    public WebElement telephoneDirectory;

    @FindBy(xpath = "//div[@id='top_menu_id_company_1210526945']")
    public WebElement staffChanges;

    @FindBy(xpath = "//div[@id='top_menu_id_company_1210526945']")
    public WebElement efficiencyReport;

    @FindBy(xpath = "//div[@id='top_menu_id_company_1597013884']")
    public WebElement honoredEmployees;

    @FindBy(xpath = "//div[@id='top_menu_id_company_1125184122']")
    public WebElement birthdays;

    @FindBy(xpath = "//div[@id='top_menu_id_company_27577212']  ")
    public WebElement newPage;

    @FindBy(xpath = "//title[.='Company Structure']")
    public WebElement expectedTitle;



    }




