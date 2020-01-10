package com.Odoo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//this is Cucumber class
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="src/test/java/StepDefinitions",
        dryRun = false,
        tags="@Odoo"


)
public class CucumberRunner {

} //Ali was here