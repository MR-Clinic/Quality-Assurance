package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.CheckemailDoctor;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class CheckemailDoctorStepdefs {
    @Steps
    CheckemailDoctor checkemailDoctor;

    @When("user get profile doctor check by email {}")
    public void usergetprofiledoctorcheckemail(String email)  {
        checkemailDoctor.checkbyemailDoctor(email);
    }

    @Then("user get profile doctor by email")
    public void usergetprofiledoctorbyemail(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("OK",
                response -> {
                    response.statusCode(200);
                });
    }
}
