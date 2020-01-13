package com.Odoo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//this is Cucumber class
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"



)
public class CucumberRunner {

}