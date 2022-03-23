package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.CheckemailDoctor;
import starter.postcodes.step.CheckemailPatient;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class CheckemailPatientStepdefs {
    @Steps
    CheckemailPatient checkemailPatient;

    @When("user get profile patient check by email {}")
    public void usergetprofilepatientcheckemail(String email)  {
        checkemailPatient.checkbyemailPatient(email);
    }

    @Then("user get profile patient by email")
    public void usergetprofilepatientbyemail(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("OK",
                response -> {
                    response.statusCode(200);
                });
    }
}
