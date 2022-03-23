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

    @When("update new doctor with nik {} name {} gender {} address {} job {} status {} religion {} placeBirth {} dob {}")
    public void updateNewDoctorWithUsernameEmailIsPasswordIsGenderIsAddressIsJobIsStatusReligion(String nik, String name, String gender, String address, String job, String status, String religion, String placeBirth, String dob) {
        updatePatient.putPatient(nik, name, gender, address, job, status, religion, placeBirth, dob);
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
