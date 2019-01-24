package positive;

import baseUtils.RunningConditions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.NavigatingUser;

@RunWith(SerenityRunner.class)
public class PublicApiPositive {

    @Steps
    NavigatingUser navigatingUser;

    @Test
    public void test1(){
        //Assume.assumeTrue(RunningConditions.dontRunOnDev());
        navigatingUser.doRequestForPublicApi(200);

    }
}
