import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver ;
    FormPage formPage ;

//Step 1: Open and Expand Browser
    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        System.out.println("Test initiated.");
        formPage = new FormPage(driver);


    }
//Step 2: Close Browser
    @AfterAll
    public void tearDown(){
        driver.quit();
        System.out.println("Test Finished.");
    }






}
