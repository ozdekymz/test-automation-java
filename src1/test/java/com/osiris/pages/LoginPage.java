package com.osiris.pages;

import com.osiris.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//constructor ekliyoruz.
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement userNameInput;


    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "kc-login")
    public WebElement submitButton;
}
