package com.Odoo.step_definitions;





import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("I am on the Login Page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters {string} and {string} and click Sign in button")
    public void user_enters_and_and_click_Sign_in_button(String string, String string2) {
        System.out.println();
    }

    @Then("user should be on {string} page")
    public void user_should_be_on_page(String string) {

    }

    @Then("close browser")
    public void close_browser() {

    }




    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

    }




}