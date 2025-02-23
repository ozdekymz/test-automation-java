import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Bu classın altında elementleri variable olarak verebiliriz. Burdaki methodları test içindeki classımıza aktaracağız.

public class FormPage {
    //Önce elementi locator olarak buluyoruz.
    private static WebDriver driver;
    private final By firstName = By.id("firstName");
    private static final By lastName = By.id("lastName");
    private static final By userEmail = By.id("userEmail");

    private GenderSection genderSection;

    //Constructor oluşturuyoruz.
    public FormPage(WebDriver driver){
        this.driver = driver;
        genderSection = new GenderSection(driver);
    }



    public void setName(String nameAsString){
        WebElement nameSpace = driver.findElement(firstName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",nameSpace);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);

    }
    public void setLastName(String LastNameAsString){
        WebElement nameSpace = driver.findElement(lastName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",nameSpace);
        nameSpace.click();
        nameSpace.sendKeys(LastNameAsString);
    }
    public void setUserEmail(String userEmailAsString){
        WebElement nameSpace = driver.findElement(userEmail);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",nameSpace);
        nameSpace.click();
        nameSpace.sendKeys(userEmailAsString);
    }

    public String getName(){
        WebElement nameSpace = driver.findElement(firstName);
        return nameSpace.getDomProperty("value");
    }
    public String getLastName(){
        WebElement lastNameSpace = driver.findElement(lastName);
        return lastNameSpace.getDomProperty("value");
    }

    public String getUserEmail(){
        WebElement userEmailSpace = driver.findElement(userEmail);
        return userEmailSpace.getDomProperty("value");
    }







}

