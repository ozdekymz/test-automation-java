import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenderSection {
    private WebDriver driver;
    private final By maleRadioButton = By.id("gender-radio-1");
    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By otherRadioButton = By.id("gender-radio-3");

//Enum kullanma sebebi bu variablelar daha sonra değişebilir.
    public enum Genders{MALE , FEMALE, OTHER}

//Constructor oluşturuyoruz.
    public GenderSection(WebDriver driver){
        this.driver = driver;
    }
//Methodları oluşturuyoruz.
    public void clickRadioButton(Genders gender){
        switch (gender){
            case FEMALE:
                driver.findElement(femaleRadioButton).click();
                break;
            case MALE:
                driver.findElement(maleRadioButton).click();
                break;
            case OTHER:
                driver.findElement(otherRadioButton).click();
                break;

        }
    }

    public boolean isRadioButtonChecked(Genders genders){
        return true;
    }
}
