package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kotlin.jvm.Throws;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.io.FileUtils;
import starter.postcodes.step.EditDoctorAccount;
import starter.postcodes.step.PutInpectionData;

import java.io.IOException;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class EditDoctorAccountStepdefs {
    @Steps
    EditDoctorAccount editDoctorAccount;

    @When("user edit doctor account with input several body form-data contain name {} address {} status {} openDay {} closeDay {} capacity {} and file {}")
    public void usereditdoctoraccountwitinputseveralbodyformdatacontainemail(String name, String address,  String status, String openDay, String closeDay, String capacity, String file) {
        editDoctorAccount.PutInpecData(name, address, status, openDay, closeDay, capacity, file);
    }

    @Then("user success edit Doctor Profile Account")
    public void usersuccesseditDoctorProfileAccount(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("Accepted",
                response -> {
                    response.statusCode(202);
                });
}}
