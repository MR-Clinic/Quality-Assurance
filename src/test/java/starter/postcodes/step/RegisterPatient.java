package starter.postcodes.step;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class RegisterPatient {
    public String URLRegisterPatient="https://faliqadlan.cloud.okteto.net/patient";
    @Step
    public void putPatient(String userName, String email, String password, String nik, String name, String gender, String address, String placeBrith, String dob, String job, String status, String religion){

        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("userName", userName)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("nik", nik)
                .multiPart("name", name)
                .multiPart("gender", gender)
                .multiPart("address", address)
                .multiPart("placeBrith", placeBrith)
                .multiPart("dob", dob)
                .multiPart("job", job)
                .multiPart("status", status)
                .multiPart("religion", religion)
                .log().all()
                .when()
                .post(URLRegisterPatient);

}}
