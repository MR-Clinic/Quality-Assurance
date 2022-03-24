package starter.Page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://mrclinic.netlify.app")
public class MrClinicPage extends PageObject {


    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/main/div/div[1]/div/div[3]/div[1]/button[2]")
    WebElement loginButton;
    public void clickLoginButton(){
        loginButton.click();
    }

}
