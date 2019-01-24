package positive;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.NavigatingUser;

@RunWith(SerenityRunner.class)
public class PublicApiPositive {

    @Steps
    NavigatingUser navigatingUser;

    @Test
    public void test1(){

        navigatingUser.doRequestForPublicApi(200);

    }
}
