package com.crm_app.step_definitions;

import com.crm_app.pages.LoginPage;
import com.crm_app.pages.ProfilePage;
import com.crm_app.utilities.BrowserUtils;
import com.crm_app.utilities.ConfigurationReader;
import com.crm_app.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US125_StepDefinitions {
    LoginPage loginPage=new LoginPage();
    ProfilePage profilePage=new ProfilePage();


    @Given("user is already logged on to the crm portal")
    public void user_is_already_logged_on_to_the_crm_portal() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("username_hr"),ConfigurationReader.getProperty("password"));
    }
    @When("user clicks on his username on the right hand corner")
    public void user_clicks_on_his_username_on_the_right_hand_corner() {
        profilePage.username.click();
    }
    @Then("user clicks on the my profile")
    public void user_clicks_on_the_my_profile() {
        profilePage.myProfile.click();

    }
    @Then("user should see the following modules")
    public void user_should_see_the_following_modules(List<String>expectedModules) {

        List<String> actualModules=new ArrayList<>();

        for (WebElement module : profilePage.modules) {
            actualModules.add(module.getText().replace(" ",","));

        }

        Assert.assertEquals(expectedModules, actualModules);



    }






}
