package com.crm_app.step_definitions;

import com.crm_app.pages.SendMessagePage;
import com.crm_app.utilities.BrowserUtils;
import com.crm_app.utilities.ConfigurationReader;
import com.crm_app.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Us84_SendMessage_defs {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    SendMessagePage messagePage = new SendMessagePage();

    @Given("User navigate to homePage")
    public void user_navigate_to_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enter valid username {string} on the username box")
    public void user_enter_valid_username_on_the_username_box(String username) {

        messagePage.usernameBox.sendKeys(username);

    }

    @When("User enter valid password {string} on the password box")
    public void user_enter_valid_password_on_the_password_box(String password) {

        messagePage.passwordBox.sendKeys(password);
    }

    @Then("User click login button, and login successfully")
    public void user_click_login_button_and_login_successfully() {
        messagePage.loginButton.click();
    }

    @Then("User click on message button")
    public void user_click_on_message_button() {
        messagePage.messageButton.click();

    }

    @Then("user type {string} in the mandatory fields")
    public void user_type_in_the_mandatory_fields(String messages) {
//        wait.until(ExpectedConditions.visibilityOf(messagePage.messagePostText));
        Driver.getDriver().switchTo().frame(messagePage.messageIframe);

        messagePage.messagePostTextBox.sendKeys(messages);
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("User  click send, user should be able to send {string} successfuly")
    public void user_click_send_user_should_be_able_to_send_successfuly(String expectedTextMessage) {
        messagePage.sendButton.click();

        String actualTextMessage = messagePage.text.getText();
       // BrowserUtils.sleep(8);
        wait.until(ExpectedConditions.visibilityOf(messagePage.text));
        Assert.assertEquals(expectedTextMessage, actualTextMessage);
    }


    @Then("User click send")
    public void user_click_send() {
        messagePage.sendButton.click();
    }

    @Then("user should see {string} error message")
    public void user_should_see_error_message(String message_Title_Not_Specify) {
        String actualTitleNotSpecifyText = messagePage.titleNotSpecifyError.getText();

        Assert.assertEquals("Verify not specify text error FAILED!!!", message_Title_Not_Specify, actualTitleNotSpecifyText);

    }

    @When("User doesn't specify at least  one person")
    public void user_doesn_t_specify_at_least_one_person() {
        messagePage.deleteButton.click();

    }

    @Then("User Should see please specify msg {string} error message")
    public void user_should_see_please_specify_msg_error_message(String expectSpecifyAtLeastOnePersonError) {
        String actualSpecifyAtLeastTextError = messagePage.pleaseSpecifyErrorMessage.getText();
        Assert.assertEquals("Verify please sprcify text Error FAILED!!!", expectSpecifyAtLeastOnePersonError, actualSpecifyAtLeastTextError);
    }

    @Then("The user should see {string} by default")
    public void the_user_should_see_by_default(String expectAllEmployeesText) {
        wait.until(ExpectedConditions.visibilityOf(messagePage.allEmployeesText));
        String actualAllEmployeesText = messagePage.allEmployeesText.getText();
        Assert.assertEquals("Verify all the employees text FAILED!!", expectAllEmployeesText, actualAllEmployeesText);

    }

    @When("User start typing {string} on the mandatory field")
    public void user_start_typing_on_the_mandatory_field(String randomText) {
        Driver.getDriver().switchTo().frame(messagePage.messageIframe);
        messagePage.messagePostTextBox.sendKeys(randomText);
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("User click cancel button, should be able to cancel")
    public void user_click_cancel_button_should_be_able_to_cancel() {
        messagePage.cancelButton.click();

    }
}