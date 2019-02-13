package positive;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.NavigatingUser;

@RunWith(SerenityRunner.class)
public class WhenGetCasePositive {

    @Steps
    NavigatingUser navigatingUser;

    @Test
    public void shouldGetInfoAboutCreatedCase(){

        navigatingUser.doRequestToGetCase(200, "5");
        navigatingUser.verifyIsResponseBodyContain("created_by", 5);
        navigatingUser.verifyIsResponseBodyContain("title", "Change document attributes (author, title, organization)");
        //можно для более плотного покрытия, проверифаить все поля из респонса. (для примера взял эти два поля, но в реальном тесте, прочекал бы все поля)
    }
}
