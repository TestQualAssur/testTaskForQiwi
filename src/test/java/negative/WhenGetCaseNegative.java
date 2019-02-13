package negative;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.NavigatingUser;

@RunWith(SerenityRunner.class)
public class WhenGetCaseNegative  {

    @Steps
    NavigatingUser navigatingUser;

    @Test
    public void shouldGetInvalidStatusCode(){

        navigatingUser.doRequestToGetCase(400, "");//не заполняю userId
        navigatingUser.doRequestToGetCase(400, "999");// передаю значение userId, выходя за первое ближайщее значение за границей существующих юзеров
        navigatingUser.doRequestToGetCase(403, "2");//тут в идеале нужно проверить помимо 400-ого кода, еще и 403 - попробовав дернуть этот метод на проект, на который не доступа у этого юзера

    }
}
