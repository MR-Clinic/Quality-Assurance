package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.RegistrationDoctor;

public class DoctorRegistrationStepdefs {
    @Steps
    RegistrationDoctor registrationDoctor;

    @When("user register with username {} email is {} and password is {}")
    public void userlogin(String userName, String email, String password){
        registrationDoctor.postRegistDoctor(userName, email, password);
    }

    @Then("success add Doctor")
    public void successaddDoctor(){
        SerenityRest.then()
                .statusCode(500);
}
};

