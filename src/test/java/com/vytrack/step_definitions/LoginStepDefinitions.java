package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");

        String URL = ConfigurationReader.getProperty("qa3");
        Driver.getDriver().get(URL);
    }

    @When("user logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        System.out.println("Login as a sales manager");

        loginPage.login("salesmanager110", "UserUser123");
    }

    @When("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        loginPage.login("storemanager85", "UserUser123");
    }


    @Then("user should verify that title is a Dashboard")
    public void user_should_verify_that_title_is_a_Dashboard() {
        System.out.println("Verify that title is a Dashboard");

        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());
        Driver.closeDriver();
    }

    @When("user logs in as a driver")
    public void userLogsInAsADriver() {
        System.out.println("Login as a driver");
        loginPage.login("user15", "UserUser123");
    }

    @When("user enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String string, String string2) {
        System.out.printf("Login with user name %s and %s password\n", string, string2);
        loginPage.login(string, string2);
    }

    @And("user navigates to {string} and {string}")
    public void userNavigatesToAnd(String tab, String module) {
        System.out.printf("User clicks on the %s tab and navigates to %s module\n", tab, module);
        loginPage.navigateTo(tab, module);
    }

    @When("user logs in as with {string} username and {string} password")
    public void userLogsInAsWithUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
//        System.out.println("username = " + username);
//        System.out.println("password = " + password);
    }

    @Then("user should be {string}")
    public void userShouldBe(String name) {
        Assert.assertEquals(name, loginPage.getCurrentUserName());
        System.out.println("User is: " + loginPage.getCurrentUserName());
    }
}