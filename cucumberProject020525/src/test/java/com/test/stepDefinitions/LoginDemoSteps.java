package com.test.stepDefinitions;

import com.test.pages.LoginPage;
import io.cucumber.java.en.*;
import com.test.utilities.ConfigReader;
import com.test.utilities.Driver;

public class LoginDemoSteps {

    @Given("browser is open")
    public void browser_is_open() {
        Driver.getDriver();

    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().navigate().to(ConfigReader.getURL());

    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        String username = ConfigReader.getUsername();

        LoginPage loginPage=new LoginPage();
        //LoginPage classındaki elementlere erişim
        loginPage.userNameInput.sendKeys(username);
    }
    @And("user enters valid password")
    public void user_enters_valid_password() {
        String password = ConfigReader.getPassword();

        LoginPage loginPage=new LoginPage();
        //LoginPage classındaki elementlere erişim
        loginPage.passwordInput.sendKeys(password);
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        LoginPage loginPage=new LoginPage();
        //LoginPage classındaki elementlere erişim
        loginPage.submitButton.click();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        LoginPage loginPage = new LoginPage();
        loginPage.logOutButton.isDisplayed();
        Driver.quitDriver();
    }






}
