package com.crm_app.pages;

import com.crm_app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {


    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement username;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfile;

    @FindBy(xpath = "//div[@id='profile-menu-filter']")
    public List<WebElement> modules;







}
