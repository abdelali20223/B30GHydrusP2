package com.crm_app.step_definitions;

import com.crm_app.pages.US122_LMPage;
import com.crm_app.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;

public class US122_LMStepDef {

        US122_LMPage us122LmPage = new US122_LMPage();


    @When("user clicks the Activity Stream tab")
    public void user_clicks_the_activity_stream_tab() {
        us122LmPage.activityStream.getText();
        Assert.assertTrue("Activity Stream tab is not displayed Activity Stream page", us122LmPage.activityStream.isDisplayed());

    }
    @Then("user should see the MESSAGE tab on the Activity Stream Page")
    public void user_should_see_the_message_tab_on_the_activity_stream_page() {
        us122LmPage.activityStream.getText();
        Assert.assertTrue("Message tab is not displayed on the Activity Stream page", us122LmPage.messageTab.isDisplayed());
    }
    @Then("user should see the TASK tab on the Activity Stream Page")
    public void user_should_see_the_task_tab_on_the_activity_stream_page() {
        us122LmPage.taskTab.getText();
        Assert.assertTrue("TASK tab is not displayed on the Activity Stream page", us122LmPage.taskTab.isDisplayed());
    }
    @Then("user should see the EVENT tab on the Activity Stream Page")
    public void user_should_see_the_event_tab_on_the_activity_stream_page() {
        us122LmPage.eventTab.getText();
        Assert.assertTrue("EVENT tab is not displayed on the Activity Stream page", us122LmPage.eventTab.isDisplayed());
    }
    @Then("user should see the POLL tab on the Activity Stream Page")
    public void user_should_see_the_poll_tab_on_the_activity_stream_page() {
        us122LmPage.pollTab.getText();
        Assert.assertTrue("POLL tab is not displayed on the Activity Stream page", us122LmPage.pollTab.isDisplayed());
    }
    @Then("user should see the MORE tab on the Activity Stream Page")
    public void user_should_see_the_more_tab_on_the_activity_stream_page() {
        us122LmPage.moreTab.getText();
        Assert.assertTrue("MORE tab is not displayed on the Activity Stream page", us122LmPage.moreTab.isDisplayed());

    }

    @And("user clicks the MORE tab")
    public void userClicksTheMORETab() {
        us122LmPage.moreTab.click();
        BrowserUtils.sleep(7);

    }

    @Then("user should see the File option")
    public void userShouldSeeTheFileOption() {
        us122LmPage.fileFromMoreTab.getText();
        Assert.assertTrue("File option is not displayed in the More drop down tab", us122LmPage.fileFromMoreTab.isDisplayed());

    }

    @And("user should see the Appreciation option")
    public void userShouldSeeTheAppreciationOption() {
        us122LmPage.appreciationFromMoreTab.getText();
        Assert.assertTrue("Appreciation option is not displayed in the More drop down tab", us122LmPage.appreciationFromMoreTab.isDisplayed());
    }

    @And("user should see the Announcement option")
    public void userShouldSeeTheAnnouncementOption() {
        us122LmPage.announcementFromMoreTab.getText();
        Assert.assertTrue("Announcement option is not displayed in the More drop down tab", us122LmPage.announcementFromMoreTab.isDisplayed());
    }

    @Then("user should see the Workflow option")
    public void userShouldSeeTheWorkflowOption() {
        us122LmPage.workflowFromMoreTab.getText();
        Assert.assertTrue("Workflow option is not displayed in the More drop down tab", us122LmPage.workflowFromMoreTab.isDisplayed());
    }
}
