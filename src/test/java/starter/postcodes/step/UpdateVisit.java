package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class UpdateVisit {
    public String URLupdatevisit="https://faliqadlan.cloud.okteto.net/visit/:visit_uid";
    public String updateVisittoken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc2MjQ5NDUsInVpZCI6IktDY1o3QlU5MkRTeXJhTEU5ZHBxaWoifQ.TVE5duspPLlGqKga2SZPh3ywKfr2ReKJDJZ3Mgq9w68";

    @Step
    public void updatevisitList(String QueryParams, String complaint, String mainDiagnose, String additionDiagnose, String action, String recipe, String bloodPressuse, String heartRate, Integer o2Saturate, String weight, String height, String bmi, String status){

        given()
                .header("Authorization", "Bearer "+updateVisittoken)
                .formParam("visit_uid", QueryParams)
                .contentType("multipart/form-data")
                .multiPart("complaint", complaint)
                .multiPart("mainDiagnose", mainDiagnose)
                .multiPart("additionDiagnose", additionDiagnose)
                .multiPart("action", action)
                .multiPart("recipe", recipe)
                .multiPart("bloodPressuse", bloodPressuse)
                .multiPart("heartRate", heartRate)
                .multiPart("o2Saturate", o2Saturate)
                .multiPart("weight", weight)
                .multiPart("height", height)
                .multiPart("bmi", bmi)
                .multiPart("status", status)
                .when()
                .put(URLupdatevisit);
    }
}
