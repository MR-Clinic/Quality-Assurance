package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.LoginPasienStep;

public class LoginPasienStepDef {

    @Steps
    LoginPasienStep loginPasienStep;

    @Given("User open the mr clinic homepage")
    public void userOpenTheMrClinicHomepage() {
        loginPasienStep.userOpenTheMrClinicHomepage();
    }

    @When("User click login button")
    public void userClickLoginButton() {
        loginPasienStep.userClickLoginButton();
    }

    @And("user input username dan password")
    public void userInputUsernameDanPassword() {
        loginPasienStep.userInputUsernameDanPassword();
    }

    @And("user input username")
    public void userInputUsername() {
        loginPasienStep.userInputUsername();
    }

    @And("user input password")
    public void userInputPassword() {
        loginPasienStep.userInputPassword();
    }

    @And("user click button login")
    public void userClickButtonLogin() {
        loginPasienStep.userClickButtonLogin();
    }

    @Then("user direct to dashboard")
    public void userDirectToDashboard() {
        loginPasienStep.userDirectToDashboard();
    }

    @Then("user direct pop up error massage")
    public void userDirectPopUpErrorMassage() {
        loginPasienStep.userDirectPopUpErrorMassage();
    }
}
