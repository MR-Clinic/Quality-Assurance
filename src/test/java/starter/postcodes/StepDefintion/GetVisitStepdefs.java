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

    @When("user get visit by status {}")
    public void userInsertTheEndpointToGetVisitData(String status) {
        getVisit.getlistofvisit(status);
    }
    @Then("user success get the visit list")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("success get patient profile",
                response -> {
                    response.statusCode(200);
                });
}}
