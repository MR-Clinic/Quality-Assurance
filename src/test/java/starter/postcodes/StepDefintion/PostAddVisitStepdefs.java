package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.PostAddVisit;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class PostAddVisitStepdefs {
    @Steps
    PostAddVisit postAddVisit;

    @When("post add visit with insert body form-data doctor_uid {} date {} complaint {}")
    public void postaddvisitwithinsertdoctor_uid(String doctor_uid, String date, String complaint){
        postAddVisit.postVisit(doctor_uid, date, complaint);
    }

    @Then("success add visit")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("Created",
                response -> {
                    response.statusCode(201);
                });
    }
}
