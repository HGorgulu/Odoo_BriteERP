package com.Odoo.step_definitions;

import com.Odoo.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hook {

    @Before
    public void setup(){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("Test Failed!");
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }else{

            System.out.println("Cleanup!");
            System.out.println("Test completed!");

        }
        //Driver.close();

    }

}
