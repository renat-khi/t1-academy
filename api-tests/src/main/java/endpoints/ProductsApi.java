package endpoints;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class ProductsApi extends BasicApi {

    public ProductsApi(String token) {
        super(token);
    }

    @Step("Получить список продуктов без авторизации")
    public Response getProductsWithoutAuth() {
        return getBuilderWithoutAuth()
                .get(Urls.PRODUCTS);
    }

    @Step("Получить продукт без авторизации")
    public Response getProductWithoutAuth(String id) {
        return getBuilderWithoutAuth()
                .get(Urls.PRODUCTS + "/" + id);
    }

}