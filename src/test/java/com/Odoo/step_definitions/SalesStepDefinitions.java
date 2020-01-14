package com.Odoo.step_definitions;

import com.Odoo.pages.SalesPage;
import com.Odoo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class SalesStepDefinitions {
    SalesPage newQuo = new SalesPage();
    WebDriver driver;

    @Then("user is on Sales page and {string} title is displayed")
    public void user_is_on_Sales_page_and_title_is_displayed(String string) {
        driver.findElement(By.xpath("//a[@href='/web#menu_id=445&action=']")).click();
        BrowserUtils.wait(3);
        Assert.assertEquals(string, newQuo.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);
    }
    @Then("user verifies that column names are displayed")
    public void user_verifies_that_column_names_are_displayed(List<String> dataTable) {
        BrowserUtils.wait(3);
        Assert.assertEquals(dataTable,newQuo.getColumnNames());
    }

        @Then("user clicks on {string} module")
    public void user_clicks_on_module(String string) {
       if (string.equals("Create")){
           newQuo.clickToCreateNew();
       }
    }

    @Then("user verifies that {string} page is displayed")
    public void user_verifies_that_page_is_displayed(String string) {
        Assert.assertEquals(string, newQuo.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);
    }

}
