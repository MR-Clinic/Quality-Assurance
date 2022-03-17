package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.UpdatePatient;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class UpdatePatientStepdefs {
    @Steps
    UpdatePatient updatePatient;

    @When("update new doctor with password is {string} gender is {string} address is {string} job is {string} status {string} religion {string} file {}")
    public void updateNewDoctorWithUsernameEmailIsPasswordIsGenderIsAddressIsJobIsStatusReligion(String password, String gender, String address, String job, String status, String religion, String file) {
        updatePatient.putPatient(password, gender, address, job, status, religion, file);
    }

    @Then("success update Patient")
    public void successupdatePatient(){
//        SerenityRest.then()
//                .statusCode(500);

        seeThatResponse("success update Patient",
                response -> {
                    response.statusCode(202);
                });

    }
}
