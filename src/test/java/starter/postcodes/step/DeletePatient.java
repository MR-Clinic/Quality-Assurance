package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class DeletePatient {
    public String URLdeletepatient="https://faliqadlan.cloud.okteto.net/patient";
    public String deletepatientToken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDgxMjI0NTIsInVpZCI6IjRpQ1VQNFJFZnFIblRKckR2ZGZpcm0ifQ.29ruNiHy9Yco_ZqLho3OhY2s2yLyrRUdndxDIpMYwcs";

    @Step
    public void deletePatientName(){

        given()
                .header("Authorization", "Bearer "+deletepatientToken)
                .when()
                .delete(URLdeletepatient);
    }
}
