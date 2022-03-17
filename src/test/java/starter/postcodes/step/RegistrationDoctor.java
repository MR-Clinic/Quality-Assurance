package starter.postcodes.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class RegistrationDoctor {
    public String URLRegisterDoctor="https://faliqadlan.cloud.okteto.net/doctor";
    @Step
    public void postRegistDoctor(String userName, String email, String password, String name, String address, String status, String openDay, String closeDay, String capacity){
        SerenityRest.given()
                .contentType("multipart/form-data")
                .multiPart("userName", userName)
                .multiPart("email", email)
                .multiPart("password", password)
                .multiPart("name", name)
                .multiPart("address", address)
                .multiPart("status", status)
                .multiPart("openDay", openDay)
                .multiPart("closeDay", closeDay)
                .multiPart("capacity", capacity)
                .log().all()
                .when()
                .post(URLRegisterDoctor);
    }
}
