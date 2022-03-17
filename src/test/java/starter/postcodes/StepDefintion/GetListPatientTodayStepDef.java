package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.GetListPatientToday;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetListPatientTodayStepDef {
    @Steps
    GetListPatientToday getListPatientToday;

    @When("user want to Get all list patient with input several of query params contain kind {} uid {} and day of this day {} and grouped {}")
    public void adminwanttoGetalllistpatienttoday(String kind, String uid, String date, String grouped) {
        getListPatientToday.getAllPatienttoday(kind, uid, date, grouped);
    }
    @Then("user get list patient today")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
    }
}
