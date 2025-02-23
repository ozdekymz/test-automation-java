package com.osiris.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    // 1. Static WebDriver instance
    private static WebDriver driver;

    // 2. Private constructor to prevent instantiation
    private Driver() {
        // WebDriver'ı başlatan kodu burada yazabilirsiniz
    }

    // 3. Public method to provide the singleton instance
    public static WebDriver getDriver() {
        if (driver == null) {
            synchronized (Driver.class) {
                if (driver == null) {
                    // Tarayıcı bilgisini ConfigurationReader'dan al
                    String browser = ConfigurationReader.getBrowser();
                    // WebDriver'ı başlat
                    if (browser.equalsIgnoreCase("chrome")) {
                        driver = new ChromeDriver();
                    } else if (browser.equalsIgnoreCase("firefox")) {
                        driver = new FirefoxDriver();
                    } else {
                        throw new IllegalArgumentException("Desteklenmeyen tarayıcı tipi: " + browser);
                    }

                    // Tarayıcı ayarlarını burada yapabilirsiniz
                    driver.manage().window().maximize();
                }
            }
        }
        return driver;
    }

    // 4. WebDriver'ı kapatmak için bir metod
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
