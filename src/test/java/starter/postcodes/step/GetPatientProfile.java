package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetPatientProfile {
    public String URLGetPatientProfile="https://faliqadlan.cloud.okteto.net/patient/profile";
    public String GetPatientProfiletoken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc4MjQ5ODIsInVpZCI6IkY0S1ZSRXptQUpVR1dTSzVnNXpOdEEifQ.3qPmgU2afCXIIADtRWoHMO2bsaaRcRWKqEgfP4hsv4Y";

    @Step public void getPatientProf(String patientUID){

        given()
                .header("Authorization", "Bearer "+GetPatientProfiletoken)
                .formParam("patient_uid", patientUID)
                .when()
                .put(URLGetPatientProfile);
    }
}
