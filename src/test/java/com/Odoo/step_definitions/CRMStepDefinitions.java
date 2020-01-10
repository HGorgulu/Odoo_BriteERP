package com.Odoo.step_definitions;

import com.Odoo.pages.CRMPage;
import com.Odoo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CRMStepDefinitions {
    private CRMPage crmPage = new CRMPage();

    @Given("user navigates to {string}")
    public void user_navigates_to(String module) {
        //direct login to CRM
        crmPage.login();

        //alternative method
        //crmPage.navigateTo(module);
    }

    @Then("user creates a new opportunity")
    public void user_creates_a_new_opportunity() {
        crmPage.create_btn.click();
        crmPage.createOpportunity("SDET", "CyberTek Solutions", 1200);
    }

}
