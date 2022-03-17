package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetListPatientToday {
    public String URLgetlistpatienttoday="https://faliqadlan.cloud.okteto.net/visit";
    public String Getlistpatienttodaytoken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc3ODA3NzksInVpZCI6Ik1uWXF5cFNVUUN3QVFzZzhoSjl0Vk0ifQ.M_9pyp_9ZTG1RMEteeygAlsfZFOdQebwr7jdf_j6LmQ";

    @Step
    public void getAllPatienttoday(String kind, String uid, String date, String grouped){

        given()
                .header("Authorization", "Bearer "+Getlistpatienttodaytoken)
                .formParam("kind", kind)
                .formParam("uid", uid)
                .formParam("date", date)
                .formParam("grouped", grouped)
                .when()
                .put(URLgetlistpatienttoday);
    }
}
