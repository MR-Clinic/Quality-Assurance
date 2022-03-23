package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.CheckUsernameDoctor;
import starter.postcodes.step.CheckUsernamePatient;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class CheckUserNamePatientStepdefs {
    @Steps
    CheckUsernamePatient checkUsernamePatient;

    @When("user get profile patient check by userName {}")
    public void usergetprofilepatientcheck(String userName)  {
        checkUsernamePatient.checkbyUsernamePatient(userName);
    }

    @Then("user get profile patient by userName")
    public void usersuccessupdateinpectiondata(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("OK",
                response -> {
                    response.statusCode(200);
                });
    }
}
