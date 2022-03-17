package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class DeleteDoctor {
    public String URLdeletedoctor="https://faliqadlan.cloud.okteto.net/doctor";
    public String deletedoctorToken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgwMzIzOTksInVpZCI6IjV6MmpuODRSTEJ3VzhUN1g0NGhFSlEifQ.NuFjuUAbLZtTBozzZ4f9fzyB-VtQpYC-3j7miSVEfZ0";

    @Step
    public void deleteDoctorName(String name){

        given()
                .header("Authorization", "Bearer "+deletedoctorToken)
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .when()
                .delete(URLdeletedoctor);
    }
}
