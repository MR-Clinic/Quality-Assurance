package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class CheckemailDoctor {
        public String URLCheckemailDoctor="https://faliqadlan.cloud.okteto.net/doctor/profile/";
        public String tokenCheckemailDoctor="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMTY2NDEsImtpbmQiOiJkb2N0b3IiLCJ1aWQiOiJIVld3NnJhOFlpdzl2bUFNY1NuVHdkIn0.yNjy5Bm5CRPLH9oIic85yIntJqX31Dqv13nXuypN3lE";

        @Step
        public void checkbyemailDoctor(String email){

            given()
                    .header("Authorization", "Bearer "+tokenCheckemailDoctor)
                    .formParam("email", email)
                    .when()
                    .put(URLCheckemailDoctor);
        }
}
