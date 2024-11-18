package com.Odoo.pages;

import com.Odoo.utilities.ConfigurationReader;
import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);

    }

  
    @FindBy(name = "login")
    public WebElement Email;
    
    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "( //button[@class='btn btn-primary']")
    public WebElement Login;

    public void login() {
        login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

    private void login(String username, String password) {
    }

    public void login(String role) {
        String userName = "";
        String password = "";
        switch (role) {
            case ("sales_manager1"):
                userName = ConfigurationReader.getProperty("salesmanager1.username");
                password = ConfigurationReader.getProperty("salesmanager.password");
                break;
            case "sales_manager2":
                userName = ConfigurationReader.getProperty("salesmanager2.username");
                password = ConfigurationReader.getProperty("salesmanager.password");
                break;
            case "sales_manager3":
                userName = ConfigurationReader.getProperty("salesmanager3.username");
                password = ConfigurationReader.getProperty("salesmanager.password");
                break;
            case "sales_manager4":
                userName = ConfigurationReader.getProperty("salesmanager4.username");
                password = ConfigurationReader.getProperty("salesmanager.password");
                break;
            case "sales_manager5":
                userName = ConfigurationReader.getProperty("salesmanager5.username");
                password = ConfigurationReader.getProperty("salesmanager.password");
                break;
            case "expensesmanager1":
                userName = ConfigurationReader.getProperty("expensesmanager1.username");
                password = ConfigurationReader.getProperty("expensesmanager.password");
                break;
            case "pexpensesmanager2":
                userName = ConfigurationReader.getProperty("expensesmanager2.username");
                password = ConfigurationReader.getProperty("expensesmanager.password");
                break;
            case "expensesmanager3":
                userName = ConfigurationReader.getProperty("expensesmanager3.username");
                password = ConfigurationReader.getProperty("expensesmanager.password");
                break;
            case "expensesmanager4":
                userName = ConfigurationReader.getProperty("expensesmanager4.username");
                password = ConfigurationReader.getProperty("expensesmanager.password");
                break;
            case "expensesmanager5":
                userName = ConfigurationReader.getProperty("expensesmanager5.username");
                password = ConfigurationReader.getProperty("expensesmanager.password");
                break;
            case "eventscrmmanager1":
                userName = ConfigurationReader.getProperty("eventscrmmanager1");
                password = ConfigurationReader.getProperty("eventscrmmanager.password");
                break;
            case "eventscrmmanager2":
                userName = ConfigurationReader.getProperty("eventscrmmanager2");
                password = ConfigurationReader.getProperty("eventscrmmanager.password");
                break;
            default:
                throw new RuntimeException("Invalid role!");
        }

    }
}
