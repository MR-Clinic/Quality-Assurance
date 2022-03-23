package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class CheckemailPatient {
    public String URLCheckemailDoctor="https://faliqadlan.cloud.okteto.net/patient/profile/";
    public String tokenCheckemailPatient="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMTcwMjgsImtpbmQiOiJwYXRpZW50IiwidWlkIjoiMjc4MjMxMDc0MiJ9.M1p15DS2jlL_uXwx3UTI47ghgHkgd3cmjlJQEeuKTl0";

    @Step
    public void checkbyemailPatient(String email){

        given()
                .header("Authorization", "Bearer "+tokenCheckemailPatient)
                .formParam("email", email)
                .when()
                .put(URLCheckemailDoctor);
    }
}
