package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.GetListPatientToday;
import starter.postcodes.step.PatientGeneralData;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class GetGeneralDataPatientStepdefs {
    @Steps
    PatientGeneralData patientGeneralData;

    @When("user get patient general data with input query params patient_uid {}")
    public void usergetpatientgeneraldatawithinputqueryparamspatient_uid(String patient_uid) {
        patientGeneralData.getPatientGeneraldata(patient_uid);
    }
    @Then("admin get list patient today")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
    }
}
