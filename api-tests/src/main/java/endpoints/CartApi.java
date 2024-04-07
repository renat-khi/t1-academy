package endpoints;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class CartApi extends BasicApi {
    public CartApi(String token) {
        super(token);
    }

    @Step("Получить корзину")
    public Response getCart() {
        return getBuilder()
                .get(Urls.CART);
    }

}