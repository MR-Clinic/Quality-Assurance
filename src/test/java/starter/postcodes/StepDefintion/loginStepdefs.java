package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.Login;

public class loginStepdefs {

    @Steps
    Login login;

   @When("user login with username {string} and password is {string}")
    public void userlogin(String userName, String password){
       login.postUser(userName, password);
    }

   @Then("user success login")
    public void usersucceslogin(){
       SerenityRest.then()
               .statusCode(200);
   }

}
