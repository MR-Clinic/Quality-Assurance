package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class PutInpectionData {
    public String URLupdatevisit="https://faliqadlan.cloud.okteto.net/visit/";

    @Step
    public void PutInpecData(String visit_uid, String complaint, String mainDiagnose, String additionDiagnose, String action, String recipe, String bloodPressuse, String heartRate, String o2Saturate, String weight, String height, String bmi, String status){

        given()
                .formParam("visit_uid", visit_uid)
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
