package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class Gethistoryofexamination {
    public String URLGetPatientProfile="https://faliqadlan.cloud.okteto.net/visit";
    public String GetPatientProfiletoken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc3ODA3NzksInVpZCI6Ik1uWXF5cFNVUUN3QVFzZzhoSjl0Vk0ifQ.M_9pyp_9ZTG1RMEteeygAlsfZFOdQebwr7jdf_j6LmQ";

    @Step
    public void Gethistoryofexam(String kind, String uid, String status){

        given()
                .header("Authorization", "Bearer "+GetPatientProfiletoken)
                .formParam("kind", kind)
                .formParam("uid", uid)
                .formParam("status", status)
                .when()
                .put(URLGetPatientProfile);
    }

}
