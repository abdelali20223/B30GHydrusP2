package com.crm_app.pages;

import com.crm_app.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {
    public UploadFilePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//span[.='Message']")
    public WebElement messageBtn;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement UploadFilesBtn;
    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title'])[1]")
    public WebElement UploadFilesAndImagesBtn;
    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInTxtBtn;
    @FindBy(xpath = "//span[@title='Click to insert file']")
    public WebElement attachedFiles;
    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeFiles;
    @FindBy(xpath = "//span[contains(@id,'bxid')]")
    public WebElement textarea;


}
