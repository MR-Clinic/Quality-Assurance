package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.RegisterPatient;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class RegisterPatientMyStepdefs {
        @Steps
        RegisterPatient registerPatient;

        @When("patient register with username {} email is {} password is {} nik {} name {} gender {} address {} placeBrith {} dob {} job {} status {} religion {}")
        public void updatenewpatient(String userName, String email, String password, String nik, String name, String gender, String address, String placeBrith, String dob, String job, String status, String religion){
            registerPatient.putPatient(userName, email, password, nik, name, gender, address, placeBrith, dob, job, status, religion);}

        @Then("success add patient")
        public void successaddPatient(){
//                SerenityRest.then()
//                        .statusCode(400);
            seeThatResponse("ok",
                    response -> {
                        response.statusCode(200);
                    });
        }
    }

