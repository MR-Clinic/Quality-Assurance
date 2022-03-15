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

        @When("user update visit with input query params visit_uid {} with name of complaint {} with main diagnose penyakit sejuta umat yakni {} and additional diagnose {}  action {} recipe {} bloodPressuse {} heart rate {} O2 saturated {} weight {}  height {} bmi {} status {}")
        public void userupdatevisitwithinputqueryparams(String QueryParams, String complaint, String mainDiagnose, String additionDiagnose, String action, String recipe, String bloodPressuse, String heartRate, Integer o2Saturate, String weight, String height, String bmi, String status)  {
            updateVisit.updatevisitList(QueryParams, complaint, mainDiagnose, additionDiagnose, action, recipe, bloodPressuse, heartRate, o2Saturate, weight, height, bmi, status);
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
