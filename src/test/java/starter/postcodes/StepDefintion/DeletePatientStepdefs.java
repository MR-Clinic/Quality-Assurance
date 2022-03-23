package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.DeleteDoctor;
import starter.postcodes.step.DeletePatient;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class DeletePatientStepdefs {
    @Steps
    DeletePatient deletePatient;

    @When("user want to delete patient account with insert the endpoint and bearer token")
    public void userwanttodeletepatient() {
        deletePatient.deletePatientName();
    }

    @Then("user success delete patient")
    public void usersuccessdeletepatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("Accepted",
                response -> {
                    response.statusCode(202);
                });
    }
}
