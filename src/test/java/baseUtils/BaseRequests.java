package baseUtils;

import io.restassured.response.Response;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.CoreMatchers.equalTo;

public class BaseRequests extends Credentials{

    protected Response response;

    protected void isStatusCode(int statusCode) {

        response.then()
                .assertThat().statusCode(statusCode);
    }

    protected void requestToGetCase(String userId) {

        response = SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get(Requests.REQUEST_TO_GET_CASE+userId);
    }

    protected void responseBodyContain(String key, int value) {

        Ensure.that(key +" is returned", response -> response.body(key, equalTo(value)));
    }

    protected void responseBodyContain(String key, String value) {

        Ensure.that(key +" is returned", response -> response.body(key, equalTo(value)));
    }
}
