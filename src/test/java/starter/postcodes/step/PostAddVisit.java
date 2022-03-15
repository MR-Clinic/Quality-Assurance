package starter.postcodes.step;

import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.given;

public class PostAddVisit {
        public String URLpostvisit="https://faliqadlan.cloud.okteto.net/visit";
        public String postVisittoken="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdXRoIjp0cnVlLCJleHAiOjE2NDc4NzUwOTgsInVpZCI6InY5TlFhbUE5dlhBWlNCVlFhd3JjbU0ifQ.aRjBCoIlU1-Q7G5QLftkf7ys1BctsBncqPx3zzGEWow";

        @Step
        public void postVisit(String doctor_uid, String date, String complaint){

            given()
                    .header("Authorization", "Bearer "+postVisittoken)
                    .contentType("multipart/form-data")
                    .multiPart("doctor_uid", doctor_uid)
                    .multiPart("date", date)
                    .multiPart("complaint", complaint)
                    .when()
                    .put(URLpostvisit);
}}
