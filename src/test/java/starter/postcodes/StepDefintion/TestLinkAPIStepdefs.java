package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.TestLnikAPI;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class TestLinkAPIStepdefs {
    @Steps
    TestLnikAPI testLnikAPI;

    @When("user test API link with input several body userName {} email {} and password {}")
    public void usertestAPIlink(String userName, String email, String password){
        testLnikAPI.testlink(userName, email, password);
    }

    @Then("user success test link API")
    public void usersuccesstestlinkAPI(){
//        SerenityRest.then()
//                .statusCode(200);
        seeThatResponse("ok",
                response -> {
                    response.statusCode(200);
                });
    }
}
