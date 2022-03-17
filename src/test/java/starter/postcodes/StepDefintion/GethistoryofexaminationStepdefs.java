package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.GetVisit;
import starter.postcodes.step.Gethistoryofexamination;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GethistoryofexaminationStepdefs {
    @Steps
    Gethistoryofexamination gethistoryofexamination;

    @When("admin get history of examination and diagnosis with input several query params contain kind {} uid {} status {}")
    public void admingethistoryofexaminationanddiagnosis(String kind, String uid, String status) {
        gethistoryofexamination.Gethistoryofexam(kind, uid, status);
    }
    @Then("admin success get history of examination and diagnosis")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
    }
}
