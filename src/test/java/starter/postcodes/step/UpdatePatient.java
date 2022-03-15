package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class UpdatePatient {
    public String URLPutPatient="https://faliqadlan.cloud.okteto.net/patient";
    public String tokenupdatePatient="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc4MjE2NDcsInVpZCI6IkY0S1ZSRXptQUpVR1dTSzVnNXpOdEEifQ.txUNAFWmLT083r38OLDchJn-j8vS8EPEiD-cLqVXzGk";

    @Step
    public void putPatient(String userName, String email,String password, String gender, String address, String job, String status, String religion){

        given()
                .header("Authorization", "Bearer"+tokenupdatePatient)
                .contentType("multipart/form-data")
                .multiPart("userName", userName)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("gender", gender)
                .multiPart("address", address)
                .multiPart("job", job)
                .multiPart("status", status)
                .multiPart("religion", religion)
                .when()
                .put(URLPutPatient);
    }
}
