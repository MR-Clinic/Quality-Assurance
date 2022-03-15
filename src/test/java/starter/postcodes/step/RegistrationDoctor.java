package starter.postcodes.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class RegistrationDoctor {
    public String URLRegisterDoctor="https://faliqadlan.cloud.okteto.net/doctor";
    @Step
    public void postRegistDoctor(String userName, String email, String password){
        JSONObject data = new JSONObject();
        data.put("userName", userName);
        data.put("email", email);
        data.put("password", password);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .post(URLRegisterDoctor);
    }
}
