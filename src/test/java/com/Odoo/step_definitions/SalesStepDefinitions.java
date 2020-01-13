package com.Odoo.step_definitions;

import com.Odoo.pages.SalesPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesStepDefinitions {
    SalesPage newQuo = new SalesPage();
    WebDriver driver;

    @Then("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
       driver.findElement(By.xpath("//a[@href='/web#menu_id=445&action=']"));

    }

    @Then("user clicks on {string} module")
    public void user_clicks_on_module(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user verifies that {string} page is displayed")
    public void user_verifies_that_page_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user adds new invoice information:")
    public void user_adds_new_invoice_information(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new cucumber.api.PendingException();
    }

}
