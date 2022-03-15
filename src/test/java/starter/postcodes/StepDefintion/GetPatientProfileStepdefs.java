package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.GetPatientProfile;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetPatientProfileStepdefs {
    @Steps
    GetPatientProfile getPatientProfile;

    @When("get patient profile with insert form query params patient_uid {}")
    public void getPatientProfileWithInverstFormQueryParamsPatient_uid(String patientUID){
        getPatientProfile.getPatientProf(patientUID);
    }

    @Then("success get patient profile")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("success get patient profile",
                response -> {
                    response.statusCode(200);
                });
}}
