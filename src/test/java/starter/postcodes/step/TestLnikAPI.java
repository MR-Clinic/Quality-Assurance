package starter.postcodes.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class TestLnikAPI {
    public String URLtest="https://faliqadlan.cloud.okteto.net/test";
    public String testlinkToken=" eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc0MjU1ODMsInVpZCI6Img4VXdjZHE5Y1dZbUxQOUxuQ0Z2elkifQ.lM5Hz1KjCroclsUd4I8eV38tzpQuIRE5TooY8Gt4X1c";
    @Step
    public void testlink(String userName, String email, String password){
        JSONObject data = new JSONObject();
        data.put("userName", userName);
        data.put("email", email);
        data.put("password", password);

        SerenityRest.given()
                .header("Authorization", "Bearer Token"+ testlinkToken)
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .post(URLtest);
    }
}
