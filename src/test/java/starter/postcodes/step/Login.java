package starter.postcodes.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class Login {

    public String URLLogin="https://faliqadlan.cloud.okteto.net/login";
    @Step
    public void postUser(String userName, String password){
        JSONObject data = new JSONObject();
        data.put("userName", userName);
        data.put("password", password);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .post(URLLogin);
    }
}
