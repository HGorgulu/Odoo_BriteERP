package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPage extends BasePage {


    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createNewElement;

    public void clickToCreateNew(){
        BrowserUtils.waitForVisibility(createNewElement,5);
        BrowserUtils.waitForClickablility(createNewElement,5);
        createNewElement.click(); // Module: Click to create a new Sales invoice
    }


}

