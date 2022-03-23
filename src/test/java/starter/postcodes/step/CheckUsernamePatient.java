package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class CheckUsernamePatient {
    public String URLCheckUsernamePatient="https://faliqadlan.cloud.okteto.net/patient/profile/";
    public String tokenCheckUsernamePatient="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgyMTcwMjgsImtpbmQiOiJwYXRpZW50IiwidWlkIjoiMjc4MjMxMDc0MiJ9.M1p15DS2jlL_uXwx3UTI47ghgHkgd3cmjlJQEeuKTl0";

    @Step
    public void checkbyUsernamePatient(String userName){

        given()
                .header("Authorization", "Bearer "+tokenCheckUsernamePatient)
                .formParam("userName", userName)
                .when()
                .put(URLCheckUsernamePatient);
    }
}
