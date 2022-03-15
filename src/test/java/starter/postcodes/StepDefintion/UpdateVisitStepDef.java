package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.GetVisit;
import starter.postcodes.step.UpdateVisit;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class UpdateVisitStepDef {

    @Steps
    UpdateVisit updateVisit;

        @When("user update visit with input query params visit_uid {} status {}")
        public void userupdatevisitwithinputqueryparams(String QueryParams, String status)  {
            updateVisit.updatevisitList(QueryParams, status);
        }

        @Then("user success update visit status")
        public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("Accepted",
                response -> {
                    response.statusCode(202);
                });
    }

}
