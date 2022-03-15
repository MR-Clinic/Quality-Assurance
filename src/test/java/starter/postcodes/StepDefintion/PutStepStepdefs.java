package starter.postcodes.StepDefintion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.UpdateDoctor;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class PutStepStepdefs {
    @Steps
    UpdateDoctor updateDoctor;

    @When("update new doctor with name {} and capacity is {}")
    public void updatenewdoctor(String name, String capacity){
        updateDoctor.putDoctor(name, capacity);
    }

    @Then("success update Doctor")
    public void successupdateDoctor(){
//        SerenityRest.then()
//                .statusCode(202);

        seeThatResponse("success update Doctor",
                response -> {
                    response.statusCode(202);
        });

    }}
