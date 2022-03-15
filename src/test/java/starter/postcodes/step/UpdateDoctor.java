package starter.postcodes.step;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class UpdateDoctor {

    public String URLPutDoctor="https://faliqadlan.cloud.okteto.net/doctor";
    public String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc2MjU5MTgsInVpZCI6InhGbmt3Vzh0RG9FTWRBNlo4NlduSEoifQ.X4OQb8Q9UmIYLjYBTzMZljfNxqHuPOaEyAacGayWCjI";

    @Step
    public void putDoctor(String name, String capacity){

        given()
                .header("Authorization", "Bearer "+token)
                .contentType("multipart/form-data")
                .multiPart("name",name)
                .multiPart("capacity",capacity)
                .when()
                .put(URLPutDoctor);
    }
}
