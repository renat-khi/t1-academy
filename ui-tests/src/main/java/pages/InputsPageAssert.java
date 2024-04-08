package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Condition.visible;

public class InputsPageAssert extends AbstractAssert<InputsPageAssert, InputsPage> {

    public InputsPageAssert(InputsPage actual) {
        super(actual, InputsPageAssert.class);
    }

    public static InputsPageAssert assertThat(InputsPage actual) {
        return new InputsPageAssert(actual);
    }

    public InputsPage page() {
        return actual;
    }

    @Step("Поле ввода отображается")
    public InputsPageAssert inputIsVisible() {
        actual.input.shouldBe(visible);

        return this;
    }

    @Step("Поле ввода заполнено значением '{value}'")
    public InputsPageAssert checkInputValue(String value) {
        actual.input.shouldHave(value(value));

        return this;
    }

}