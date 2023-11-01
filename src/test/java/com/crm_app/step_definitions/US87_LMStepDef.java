package com.crm_app.step_definitions;

import com.crm_app.pages.US87_LMPage;
import com.crm_app.utilities.BrowserUtils;
import com.crm_app.utilities.ConfigurationReader;
import com.crm_app.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US87_LMStepDef {


    US87_LMPage us87LmPage = new US87_LMPage();

    @Given("user is on the CRM login page")
    public void user_is_on_the_crm_login_page() {

          Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters Username and Password to login")
    public void user_enters_username_and_password_to_login() {

        us87LmPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        us87LmPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        us87LmPage.loginButton.click();
    }
    @When("user clicks the Employees Tab")
    public void user_clicks_the_employees_tab() {

        us87LmPage.employeesTab.click();
        BrowserUtils.sleep(10);
    }
    @Then("user should see Company Structure on the employees page")
    public void user_should_see_company_structure_on_the_employees_page() {
        us87LmPage.companyStructure.getText();
    }
    @Then("user should see Find Employee on the employees page")
    public void user_should_see_find_employee_on_the_employees_page() {
        us87LmPage.findEmployee.getText();
    }
    @Then("user should see Telephone Directory on the employees page")
    public void user_should_see_telephone_directory_on_the_employees_page() {
        us87LmPage.telephoneDirectory.getText();
    }
    @Then("user should see Staff Changes on the employees page")
    public void user_should_see_staff_changes_on_the_employees_page() {
        us87LmPage.staffChanges.getText();
    }
    @Then("user should see Efficiency Report on the employees page")
    public void user_should_see_efficiency_report_on_the_employees_page() {
        us87LmPage.efficiencyReport.getText();
    }
    @Then("user should see Honored Employees on the employees page")
    public void user_should_see_honored_employees_on_the_employees_page() {
        us87LmPage.honoredEmployees.getText();
    }
    @Then("user should see Birthdays on the employees page")
    public void user_should_see_birthdays_on_the_employees_page() {
        us87LmPage.birthdays.getText();
    }
    @Then("user should see New Page on the employees page")
    public void user_should_see_new_page_on_the_employees_page() {
        us87LmPage.newPage.getText();
    }

    @Then("user should view the Company Structure by default after clicking the Employees Module")
    public void userShouldViewTheCompanyStructureByDefaultAfterClickingTheEmployeesModule() {
        us87LmPage.expectedTitle.getText();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle="Company Structure";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
