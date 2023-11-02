package com.crm_app.step_definitions;

import com.crm_app.pages.LoginPage;
import com.crm_app.utilities.BrowserUtils;
import com.crm_app.utilities.ConfigurationReader;
import com.crm_app.utilities.Driver;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepDefinitions {
    LoginPage loginPage=new LoginPage();


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user enters {string},{string}")
    public void the_user_enters(String username, String password ) {
        loginPage.login(username,password);
    }
    @Then("the user should be able to log in successfully to crm homepage")
    public void the_user_should_be_able_to_log_in_successfully_to_crm_homepage() {
        String expectedINTitle="Portal";
        BrowserUtils.verifyTitleContains(expectedINTitle);
    }

    @When("user enters invalid username and invalid password")
    public void userEntersInvalidUsernameAndInvalidPassword() {
        loginPage.login("incorrectUsername","incorrectPassword");
    }
    @And("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.logInButton.click();
    }
    @Then("user should see Incorrect login or password text")
    public void userShouldSeeIncorrectLoginOrPasswordText() {
        String expectedText="Incorrect login or password";
        String actualText=loginPage.incorrectLoginOrPasswordText.getText();
        Assert.assertEquals(expectedText,actualText);


    }
    @When("user enters {string},{string}")
    public void userEnters(String username, String password) {
        loginPage.userInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);

    }

    @Then("user should see Remember Me link on the page")
    public void userShouldSeeRememberMeLinkOnThePage() {
        Assert.assertTrue(loginPage.checkBoxRememberME.isDisplayed());
    }

    @And("user Remember Me link should be clickable")
    public void userRememberMeLinkShouldBeClickable() {
        Assert.assertTrue(loginPage.checkBoxRememberME.isEnabled());
    }


}
