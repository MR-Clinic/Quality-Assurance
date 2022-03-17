package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.RegistrationDoctor;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class DoctorRegistrationStepdefs {
    @Steps
    RegistrationDoctor registrationDoctor;

    @When("user register with username {} email is {} password is {} name {} address {} status {} openDay {} closeDay {} capacity {}")
    public void doctorRegister(String userName, String email, String password, String name, String address, String status, String openDay, String closeDay, String capacity){
        registrationDoctor.postRegistDoctor(userName, email, password, name, address, status, openDay, closeDay, capacity);
    }

    @Then("success add Doctor")
    public void successaddDoctor(){
//        SerenityRest.then()
//                .statusCode(400);
        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
}
};

