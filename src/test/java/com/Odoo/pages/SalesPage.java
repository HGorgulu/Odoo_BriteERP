package com.Odoo.pages;

import com.Odoo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SalesPage extends BasePage {

    @FindBy(xpath = "//ol[@class='breadcrumb']")
    public WebElement importElement;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchElement;

    @FindBy(xpath = "") // Contains 'o_column_sortable'
    public List<WebElement> columnNames;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createNewElement;

    public List<String> getColumnNames() {
        return BrowserUtils.getListOfString(columnNames);
    }
    public void clickToCreateNew(){
        BrowserUtils.waitForVisibility(createNewElement,5);
        BrowserUtils.waitForClickablility(createNewElement,5);
        createNewElement.click(); // Module: Click to create a new Sales invoice
    }


}

