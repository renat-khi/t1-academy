package endpoints;

import dto.request.DTOUser;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import utils.RestApiBuilder;

public class AuthApi {

    @Step("Зарегистрировать нового пользователя 'login'")
    public static Response registerNewUser(String login, String password) {
        return new RestApiBuilder("http://9b142cdd34e.vps.myjino.ru:49268").build()
                .body(new DTOUser(login, password))
                .post(Urls.REGISTER);
    }

    @Step("Авторизоваться под пользователем 'login'")
    public static Response loginUser(String login, String password) {
        return new RestApiBuilder("http://9b142cdd34e.vps.myjino.ru:49268").build()
                .body(new DTOUser(login, password))
                .post(Urls.LOGIN);
    }

}