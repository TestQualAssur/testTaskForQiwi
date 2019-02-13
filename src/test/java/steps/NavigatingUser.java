package steps;

import baseUtils.BaseRequests;
import net.thucydides.core.annotations.Step;

public class NavigatingUser extends BaseRequests {


    @Step
    public void doRequestToGetCase(int statusCode, String userId) {

        requestToGetCase(userId);
        isStatusCode(statusCode);
    }


    @Step
    public void verifyIsResponseBodyContain(String key, int value) {

        responseBodyContain(key, value);
    }

    @Step
    public void verifyIsResponseBodyContain(String key, String value) {

        responseBodyContain(key, value);
    }


}
