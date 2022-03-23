package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class CheckUsernameDoctor {
    public String URLCheckUsernameDoctor="https://faliqadlan.cloud.okteto.net/doctor/profile/";
    public String tokenCheckUsernameDoctor="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMTY2NDEsImtpbmQiOiJkb2N0b3IiLCJ1aWQiOiJIVld3NnJhOFlpdzl2bUFNY1NuVHdkIn0.yNjy5Bm5CRPLH9oIic85yIntJqX31Dqv13nXuypN3lE";

    @Step
    public void checkbyUsernameDoctor(String userName){

        given()
                .header("Authorization", "Bearer "+tokenCheckUsernameDoctor)
                .formParam("userName", userName)
                .when()
                .put(URLCheckUsernameDoctor);
    }
}
