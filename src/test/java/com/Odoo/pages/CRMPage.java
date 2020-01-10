package com.Odoo.pages;


import com.Odoo.utilities.BrowserUtils;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.Odoo.utilities.ConfigurationReader.getProperty;

public class CRMPage {

    public CRMPage() { PageFactory.initElements(Driver.get(), this); }

    // USER STORY --> As a user I should be able to create a new opportunity
    // contains :   //*[ contains (  text(),'CRM'  )   ]


    @FindBy(xpath = "//*[@id='oe_main_menu_navbar']//span[contains(text(),'CRM')]")
    public WebElement crm_navbar;

    @FindBy(partialLinkText = "CRM")
    public WebElement crm_navbar2;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement create_btn;

    @FindBy(xpath = "//label[text()='Opportunity Title']/ancestor::tr//input")
    public WebElement opp_title_textBox;

    @FindBy(xpath = "//label[text()='Customer']/ancestor::tr//input")
    public WebElement customer_textBox;

    @FindBy(xpath = "//label[text()='Expected Revenue']/ancestor::tr//input")
    public WebElement expected_revenue_textBox;

    @FindBy(name = "close_dialog")
    public WebElement create_opp_btn;

    @FindBy(name = "edit_dialog")
    public WebElement edit_btn;

    @FindBy(xpath = "//button[@special='cancel']")
    public WebElement discard_btn;



    // CRM METHODS

    public void createOpportunity(String oppTitle, String customer, double expRevenue){
        BrowserUtils.wait(2);
        opp_title_textBox.sendKeys(oppTitle);
        customer_textBox.sendKeys((customer));
        opp_title_textBox.click();
        try {
            Driver.get().findElement(By.xpath("(//div[@class='modal-content'])[2]//span[text()='Create']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        expected_revenue_textBox.clear();
        expected_revenue_textBox.sendKeys(Double.toString(expRevenue));
        create_opp_btn.click();

    }



    // COMMON METHODS

    public void navigateTo(String module){
        Driver.get().findElement(By.xpath("//*[@id='oe_main_menu_navbar']//span[contains(text(),'"+ module +"')]")).click();
    }

    public void login(){
        // directly navigates to CRM
        Driver.get().get( getProperty("baseURL") + getProperty("crm_URL"));  //http://34.220.250.213

        //login credentials
        Driver.get().findElement(By.id("login")).sendKeys(getProperty("crm_userName"));
        Driver.get().findElement(By.id("password")).sendKeys(getProperty("crm_pass"));
        Driver.get().findElement(By.xpath("//button[text()='Log in']")).click();
    }









}
