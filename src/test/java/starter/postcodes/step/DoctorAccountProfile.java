package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class DoctorAccountProfile {
    public String URLDoctorAccountProfile="https://faliqadlan.cloud.okteto.net/doctor/all";
    public String doctoraccountprofile="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc4NzQ2OTksInVpZCI6InltZURKSmpHWExmZHJkTU1EU01NelEifQ.7RL2M42PSLg9cAK9RYlwNB1DzMXi8I-zJ0RzGpXkp_s";
    @Step
    public void getDoctorAccount(){

        given()
                .header("Authorization", "Bearer "+doctoraccountprofile)
                .when()
                .get(URLDoctorAccountProfile);
    }
}
