package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.DoctorAccountProfile;
import starter.postcodes.step.PutInpectionData;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetDoctorProfileStepdefs {
    @Steps
    DoctorAccountProfile doctorAccountProfile;

    @When("user get doctor account profile with insert the endpoint")
    public void usergetdoctoraccountprofilewithinserttheendpoint() {
        doctorAccountProfile.getDoctorAccount();
    }

    @Then("user success Get Doctor Profile Account")
    public void usersuccessGetDoctorProfileAccount(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
    }
}
