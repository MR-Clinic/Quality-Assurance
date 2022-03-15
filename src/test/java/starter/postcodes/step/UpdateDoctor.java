package starter.postcodes.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class UpdateDoctor {

    public String URLPutDoctor="https://faliqadlan.cloud.okteto.net/doctor";
           String Token="";
    @Step
    public void putDoctor(String name, String capacity){
        JSONObject data = new JSONObject();
        data.put("name", name);
        data.put("capacity", capacity);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .post(URLPutDoctor);
    }
}
