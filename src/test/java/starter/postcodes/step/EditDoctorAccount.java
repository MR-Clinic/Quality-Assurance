package starter.postcodes.step;

import net.thucydides.core.annotations.Step;
import org.jruby.gen.org$jruby$ext$ffi$io$FileDescriptorIO$POPULATOR;

import static net.serenitybdd.rest.SerenityRest.given;

public class EditDoctorAccount {
    public String URLupdatevisit="https://faliqadlan.cloud.okteto.net/doctor";
    public String editdoctoraccountToken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgwMzIzOTksInVpZCI6IjV6MmpuODRSTEJ3VzhUN1g0NGhFSlEifQ.NuFjuUAbLZtTBozzZ4f9fzyB-VtQpYC-3j7miSVEfZ0";

    @Step
    public void PutInpecData(String name, String address,  String status, String openDay, String closeDay, String capacity, String file){

        given()
                .header("Authorization", "Bearer "+editdoctoraccountToken)
                .contentType("multipart/form-data")
                .multiPart("name", name)
                .multiPart("address", address)
                .multiPart("status", status)
                .multiPart("openDay", openDay)
                .multiPart("closeDay", closeDay)
                .multiPart("capacity", capacity)
                .multiPart("file", file)
                .when()
                .put(URLupdatevisit);
    }
}
