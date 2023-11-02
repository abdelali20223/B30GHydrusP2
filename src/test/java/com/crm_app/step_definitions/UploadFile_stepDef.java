package com.crm_app.step_definitions;

import com.crm_app.pages.LoginPage2;
import com.crm_app.pages.UploadFilePage;
import com.crm_app.utilities.BrowserUtils;
import com.crm_app.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import org.junit.Assert;

public class UploadFile_stepDef {
    LoginPage2 loginPage2 = new LoginPage2();
    UploadFilePage uploadFilePage = new UploadFilePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


//    @Given("User navigate to homePage")
//    public void user_navigate_to_home_page() {
//        // Write code here that turns the phrase above into concrete actions
//
//    }
//    @When("User enter valid username {string} on the username box")
//    public void user_enter_valid_username_on_the_username_box(String string) {
//        loginPage2.usernameBox.sendKeys(string);
//    }
//    @When("User enter valid password {string} on the password box")
//    public void user_enter_valid_password_on_the_password_box(String string) {
//        loginPage2.passwordBox.sendKeys(string);
//    }
//    @Then("User click login button, and login successfully")
//    public void user_click_login_button_and_login_successfully() {
//        loginPage2.loginButton.click();
//    }


    @Given("user should click on message button on the menu under search box")
    public void user_should_click_on_message_button_on_the_menu_under_search_box() {
        uploadFilePage.messageBtn.click();
    }
    @When("user clicks on upload files icon")
    public void user_clicks_on_upload_files_icon() {
        uploadFilePage.UploadFilesBtn.click();
    }
    @When("user clicks Upload files and images button")
    public void user_clicks_upload_files_and_images_button() {
        //uploadFilesPage.UploadFilesAndImagesBtn.click();


    }
    @When("user should be able to  upload files.")
    public void user_should_be_able_to_upload_files() {
        //Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.className("bx-editor-iframe")));
//        wait.until(ExpectedConditions.elementToBeClickable(uploadFilePage.UploadFilesAndImagesBtn));
//
        uploadFilePage.UploadFilesAndImagesBtn.sendKeys("C:\\Users\\abdel\\OneDrive\\Desktop\\dfff.txt");
        //BrowserUtils.sleep(10);
        //Driver.getDriver().switchTo().parentFrame();
    }

    @Then("user should be able to see uploaded files contains formats below:")
    public void user_should_be_able_to_see_uploaded_files_contains_formats_below(List<String> formats) {
        String actual = uploadFilePage.attachedFiles.getText();

        for (String each : formats) {
            if (actual.contains(each)){
                Assert.assertTrue(actual.contains(each));
                break;
            }
        }
    }


    @When("user should click on insert button")
    public void user_should_click_on_insert_button() {
        uploadFilePage.insertInTxtBtn.click();
    }
    @Then("user should be able to see the file in text area")
    public void user_should_be_able_to_see_the_file_in_text_area() {
        Driver.getDriver().switchTo().frame(uploadFilePage.messageIframe);
        Assert.assertTrue(uploadFilePage.textarea.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("user should be able to remove files and images by clicking 'X'button before sending")
    public void user_should_be_able_to_remove_files_and_images_by_clicking_x_button_before_sending() {
        uploadFilePage.removeFiles.click();

        Assert.assertEquals(uploadFilePage.messageIframe.getText(),"");
        Driver.getDriver().switchTo().defaultContent();
    }
}
