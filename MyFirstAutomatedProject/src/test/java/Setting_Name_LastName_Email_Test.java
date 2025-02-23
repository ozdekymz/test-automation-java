import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Setting_Name_LastName_Email_Test extends BaseTest{

    //Methodların üzerine test anotasyonu koyulursa bu methodlar artık test methodu olacaktır.
    @Test
    public void setName() throws InterruptedException {

        FormPage formPage = new FormPage(driver);
        formPage.setName("Özde"); //alanı bul yerine özde yaz.
        Thread.sleep(5000);
        Assertions.assertEquals("Özde",formPage.getName(),"Name value is not correct.");


    }
    @Test
    public void setLastName() throws InterruptedException{
        FormPage formPage = new FormPage(driver);
        formPage.setLastName("Kaymaz"); //alanı bul yerine kaymaz yaz.
        Assertions.assertEquals("Kaymaz",formPage.getLastName(),"Last name value is not correct.");
    }
    @Test
    public void setUserEmail() throws InterruptedException {
        FormPage formPage = new FormPage(driver);
        formPage.setUserEmail("ozdenaz.kaymaz@sandbox.com"); //alanı bul yerine e mail adress yaz.
        Assertions.assertEquals("ozdenaz.kaymaz@sandbox.com",formPage.getUserEmail(),"E mail value is not correct.");

    }

}
