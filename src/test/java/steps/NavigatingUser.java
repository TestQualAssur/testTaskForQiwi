package steps;

import baseUtils.BaseRequests;
import net.thucydides.core.annotations.Step;

public class NavigatingUser extends BaseRequests {

    @Step
    public void doRequestForPublicApi(int statusCode) {

        requestForPublicApi();
        isStatusCode(statusCode);
    }



}
