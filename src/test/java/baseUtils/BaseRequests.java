package baseUtils;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;

public class BaseRequests extends Credentials{

    protected Response response;

    protected void requestForPublicApi() {

        response = SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get(Requests.REQUEST_TO_GET_TRADE_PAIRS);
        response.body().print();

    }


    protected void isStatusCode(int statusCode) {

        response.then()
                .assertThat().statusCode(statusCode);
    }
}
