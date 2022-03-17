package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class UpdatePatient {
    public String URLPutPatient="https://faliqadlan.cloud.okteto.net/patient";
    public String tokenupdatePatient="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc4MjE2NDcsInVpZCI6IkY0S1ZSRXptQUpVR1dTSzVnNXpOdEEifQ.txUNAFWmLT083r38OLDchJn-j8vS8EPEiD-cLqVXzGk";

    @Step
    public void putPatient(String password, String gender, String address, String job, String status, String religion, String file){

        given()
                .header("Authorization", "Bearer"+tokenupdatePatient)
                .contentType("multipart/form-data")
                .multiPart("password", password)
                .multiPart("gender", gender)
                .multiPart("address", address)
                .multiPart("job", job)
                .multiPart("status", status)
                .multiPart("religion", religion)
                .multiPart("file", file)
                .when()
                .put(URLPutPatient);
    }
}
