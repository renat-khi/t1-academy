package assertions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class BasicAssert extends AbstractAssert<BasicAssert, Response> {

    public BasicAssert(Response actual) {
        super(actual, BasicAssert.class);
    }

    public static BasicAssert assertThat(Response actual) {
        return new BasicAssert(actual);
    }

    @Step("Проверить что статус код равен '{expectedCode}'")
    public BasicAssert statusCodeIsEqual(int expectedCode) {
        Assertions.assertThat(actual.getStatusCode())
                .as("Код ответа не равен " + expectedCode)
                .isEqualTo(expectedCode);

        return this;
    }

    @Step("Проверить что значение по ключу '{path}' равно '{value}'")
    public BasicAssert responseFieldIsEqual(String path, String value) {
        Assertions.assertThat(actual.jsonPath().getString(path))
                .as("Поле '%s' не равно '%s'".formatted(path, value))
                .isEqualTo(value);

        return this;
    }

    @Step("Проверить что значение по ключу '{path}' равно '{value}'")
    public BasicAssert responseFieldIsEqual(String path, double value) {
        Assertions.assertThat(actual.jsonPath().getDouble(path))
                .as("Поле '%s' не равно '%s'".formatted(path, value))
                .isEqualTo(value);

        return this;
    }

    @Step("Проверить что количество равно '{value}'")
    public BasicAssert responseQuantityIsEqual(int quantity) {
        Assertions.assertThat(actual.jsonPath().getList("").size())
                .as("Количество не равно '%s'".formatted(quantity))
                .isEqualTo(quantity);

        return this;
    }

}