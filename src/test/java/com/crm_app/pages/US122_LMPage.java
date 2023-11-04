package com.crm_app.pages;

import com.crm_app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US122_LMPage {


    public US122_LMPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/stream/'])[1]")
    public WebElement activityStream;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-calendar']")
    public WebElement taskTab;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']")
    public WebElement eventTab;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-vote']")
    public WebElement pollTab;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-more']")
    public WebElement moreTab;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-file feed-add-post-form-file-more ']")
    public WebElement fileFromMoreTab;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-grat feed-add-post-form-grat-more ']")
    public WebElement appreciationFromMoreTab;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-important feed-add-post-form-important-more ']")
    public WebElement announcementFromMoreTab;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-lists feed-add-post-form-lists-more ']")
    public WebElement workflowFromMoreTab;

}
