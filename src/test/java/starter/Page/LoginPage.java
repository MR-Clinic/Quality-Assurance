package starter.Page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends PageObject {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nik\"]")
    WebElement fieldUserName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"full_name\"]")
    WebElement fieldPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div/div/div[2]/div/div[2]/div[2]/button")
    WebElement login2;
    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div/div/div[2]/div/div[3]/a[1]")
    WebElement daftarsebagaiPaseien;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div/div/div[2]/div/div[3]/a[2]")
    WebElement daftarsebagaiDokter;


    public void inputUsername(){
        fieldUserName.sendKeys("yessica97");
    }
    public void inputPassword(){
        fieldPassword.sendKeys("yessica97");
    }
    public void clickButtonLogin(){
        login2.click();
    }

}
