package com.Odoo.pages;

import com.Odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);

    }
    //Eda
    @FindBy(name = "login")
    public WebElement Email;
   //Eda
    @FindBy(name= "password")
    public WebElement password;
   //Eda
    @FindBy(xpath="( //button[@class='btn btn-primary']")
       public WebElement Login;



}

