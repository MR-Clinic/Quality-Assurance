package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class PatientGeneralData {
    public String URLgetgeneraldataofpatient="https://faliqadlan.cloud.okteto.net/patient/profile";
    public String getgeneraldataofpatienttoken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc4NzYyMzQsInVpZCI6IjRpQ1VQNFJFZnFIblRKckR2ZGZpcm0ifQ.Pf_TUTxOxaqJtBnIp2J_ymNxZhMJ8FD2Se8MlYLzjEA";

    @Step
    public void getPatientGeneraldata(String patient_uid){

        given()
                .header("Authorization", "Bearer "+getgeneraldataofpatienttoken)
                .formParam("patient_uid", patient_uid)
                .when()
                .get(URLgetgeneraldataofpatient);
    }
}
