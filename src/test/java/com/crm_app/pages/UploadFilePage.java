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
    @FindBy(xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp '])[1]")
    public WebElement UploadFilesAndImagesBtn;
    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInTxtBtn;
    @FindBy(xpath = "//span[@title='Click to insert file']")
    public WebElement attachedFiles;
    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeFiles;
    @FindBy(xpath = "//span[@style='color: #2067B0; border-bottom: 1px dashed #2067B0; margin:0 2px;']")
    public WebElement textarea;
    @FindBy(css = ".bx-editor-iframe")
    public WebElement messageIframe;

}
