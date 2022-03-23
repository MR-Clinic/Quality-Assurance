package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.CheckUsernameDoctor;
import starter.postcodes.step.PutInpectionData;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class CheckuserNameDoctorStepdefs {
    @Steps
    CheckUsernameDoctor checkUsernameDoctor;

    @When("user get profile doctor check by userName {}")
    public void usergetprofiledoctorcheck(String userName)  {
        checkUsernameDoctor.checkbyUsernameDoctor(userName);
    }

    @Then("user get profile doctor by userName")
    public void usersuccessupdateinpectiondata(){
//        SerenityRest.then()
//                .statusCode(200);

        seeThatResponse("OK",
                response -> {
                    response.statusCode(200);
                });
    }
}
