package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.GetVisit;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetVisitStepdefs {
    @Steps
    GetVisit getVisit;

    @When("admin want to get visit Queue by in several of query params containt kind {} uid {} and status {}")
    public void userInsertTheEndpointToGetVisitData(String kind, String uid, String status) {
        getVisit.getlistofvisit(kind, uid, status);
    }
    @Then("admin want to success get the visit queue list")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
}}
