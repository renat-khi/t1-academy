package assertions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.assertj.core.api.AbstractAssert;

public class CartAssert extends AbstractAssert<BasicAssert, Response> {

    public CartAssert(Response actual) {
        super(actual, CartAssert.class);
    }

    public static CartAssert assertThat(Response actual) {
        return new CartAssert(actual);
    }

    @Step("Проверить что значение 'total_price' в корзине равно '{value}'")
    public CartAssert checkTotalPriceInCartResponse(double totalPrice) {
        BasicAssert.assertThat(actual)
                .statusCodeIsEqual(200)
                .responseFieldIsEqual("total_price", totalPrice);

        return this;
    }

}