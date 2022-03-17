package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.PutInpectionData;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class PuInpectionDataStepdefs {
    @Steps
    PutInpectionData putInpectionData;

    @When("user update inpection data with input query params visit_uid {} and body form-data contain complaint {} mainDiagnose {} additionalDiagnose {} action {} recipe {} bloodPressure {} heartRate {} o2Saturate {} weight {} height {} bmi {} status {}")
    public void userupdateinpectiondatawithinputqueryparamsvisit_uid(String visit_uid, String complaint, String mainDiagnose, String additionDiagnose, String action, String recipe, String bloodPressuse, String heartRate, String o2Saturate, String weight, String height, String bmi, String status)  {
        putInpectionData.PutInpecData(visit_uid, complaint, mainDiagnose, additionDiagnose, action, recipe, bloodPressuse, heartRate, o2Saturate, weight, height, bmi, status);
    }

    @Then("user success update inpection data")
    public void usersuccessupdateinpectiondata(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("Accepted",
                response -> {
                    response.statusCode(202);
                });
    }

}
