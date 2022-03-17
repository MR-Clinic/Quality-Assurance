package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.DeleteVisit;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class DeleteVisitStepdefs {
    @Steps
    DeleteVisit deleteVisit;

    @When("user delete visit with insert query params visit_uid {} and insert body form-data status {}")
    public void userupdatevisitwithinputqueryparams(String QueryParams, String status)  {
        deleteVisit.deleteVisitlist(QueryParams, status);
    }

    @Then("user success delete visit")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("Accepted",
                response -> {
                    response.statusCode(202);
                });
    }

}
