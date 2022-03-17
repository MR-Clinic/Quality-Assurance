package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.DeleteDoctor;
import starter.postcodes.step.EditDoctorAccount;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class DeleteDoctorStepdefs {
    @Steps
    DeleteDoctor deleteDoctor;

    @When("user delete doctor with name {}")
    public void userdeletedoctorwithname(String name) {
        deleteDoctor.deleteDoctorName(name);
    }

    @Then("user success delete doctor")
    public void usersuccessdeletedoctor(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("Accepted",
                response -> {
                    response.statusCode(202);
                });
    }
}
