package com.osiris.step_defs;

import com.osiris.pages.LoginPage;
import com.osiris.utilities.BrowserUtils;
import com.osiris.utilities.ConfigurationReader;
import com.osiris.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getURL());
        BrowserUtils.sleep(6);
    }
    @When("The user enters valid username")
    public void the_user_enters_valid_username_and_password() {
        String username = "admin";


        LoginPage loginPage=new LoginPage();
        //LoginPage classındaki elementlere erişim
        loginPage.userNameInput.sendKeys(username);


    }
    @And("The user enters valid password")
    public void the_user_enters_valid_password() {

        String password = "admin";

        LoginPage loginPage=new LoginPage();
        //LoginPage classındaki elementlere erişim

        loginPage.passwordInput.sendKeys(password);

    }
    @When("The user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        LoginPage loginPage= new LoginPage();
        loginPage.submitButton.click();


    }
    @Then("The user should be redirected to the landing page")
    public void the_user_should_be_redirected_to_the_landing_page() {

    }
}
