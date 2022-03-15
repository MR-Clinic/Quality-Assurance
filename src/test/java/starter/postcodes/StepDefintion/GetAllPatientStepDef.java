package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.GetAllPatientList;
import starter.postcodes.step.GetVisit;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetAllPatientStepDef {
    @Steps
    GetAllPatientList getAllPatientList;

    @When("admin want to Get all list patient with input several of query params contain kind {} uid {} and grouped {}")
    public void userInsertTheEndpointToGetVisitData(String kind, String uid, String grouped) {
        getAllPatientList.getAllPatient(kind, uid, grouped);
    }
    @Then("success get all Patient list")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
    }
}
