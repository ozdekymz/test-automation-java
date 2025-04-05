package com.test.pages;

import com.test.utilities.Driver;
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

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")
    public WebElement logOutButton;





}
