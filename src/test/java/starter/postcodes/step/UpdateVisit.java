package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class UpdateVisit {
    public String URLupdatevisit="https://faliqadlan.cloud.okteto.net/visit/";
    public String updateVisittoken="eeyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc2MjQ5NDUsInVpZCI6IktDY1o3QlU5MkRTeXJhTEU5ZHBxaWoifQ.TVE5duspPLlGqKga2SZPh3ywKfr2ReKJDJZ3Mgq9w68";

    @Step
    public void updatevisitList(String QueryParams, String status){

        given()
                .header("Authorization", "Bearer "+updateVisittoken)
                .formParam("visit_uid", QueryParams)
                .contentType("multipart/form-data")
                .multiPart("status", status)
                .when()
                .put(URLupdatevisit);
    }
}
