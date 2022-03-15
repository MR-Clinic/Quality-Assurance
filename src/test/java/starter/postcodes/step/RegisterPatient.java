package starter.postcodes.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class RegisterPatient {
    public String URLRegisterPatient="https://faliqadlan.cloud.okteto.net/patient";
    @Step
    public void putPatient(String userName, String email, String password, String nik, String name, String gender, String address, String placeBrith, String dob, String job, String status, String religion){
        JSONObject data = new JSONObject();
        data.put("userName", userName);
        data.put("email", email);
        data.put("password", password);
        data.put("nik", nik);
        data.put("name", name);
        data.put("gender", gender);
        data.put("address", address);
        data.put("placeBrith", placeBrith);
        data.put("dob", dob);
        data.put("job", job);
        data.put("status", status);
        data.put("religion", religion);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .post(URLRegisterPatient);

}}
