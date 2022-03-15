package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetAllPatientList {

    public String URLgetAllPatient="https://faliqadlan.cloud.okteto.net/visit";
    public String getAllPatienttoken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc3ODA3NzksInVpZCI6Ik1uWXF5cFNVUUN3QVFzZzhoSjl0Vk0ifQ.M_9pyp_9ZTG1RMEteeygAlsfZFOdQebwr7jdf_j6LmQ";

    @Step
    public void getAllPatient(String kind, String uid, String grouped){

        given()
                .header("Authorization", "Bearer "+getAllPatienttoken)
                .formParam("kind", kind)
                .formParam("uid", uid)
                .formParam("grouped", grouped)
                .when()
                .put(URLgetAllPatient);
    }
}
