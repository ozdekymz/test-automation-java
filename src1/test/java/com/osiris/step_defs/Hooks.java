package com.osiris.step_defs;

import com.osiris.utilities.BrowserUtils;
import com.osiris.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class Hooks {


    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        // Quit WebDriver after each scenario

        BrowserUtils.sleep(5);
        Driver.quitDriver();
    }


}
