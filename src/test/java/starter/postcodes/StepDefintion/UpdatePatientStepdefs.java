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

    @When("update new doctor with username {string} email is {string} password is {string} gender is {string} address is {string} job is {string} status {string} religion {string}")
    public void updateNewDoctorWithUsernameEmailIsPasswordIsGenderIsAddressIsJobIsStatusReligion(String userName, String email,String password, String gender, String address, String job, String status, String religion) {
        updatePatient.putPatient(userName, email, password, gender, address, job, status, religion);
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
