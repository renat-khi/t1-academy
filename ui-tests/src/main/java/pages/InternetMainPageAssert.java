package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.Condition.visible;

public class InternetMainPageAssert extends AbstractAssert<InternetMainPageAssert, InternetMainPage> {

    public InternetMainPageAssert(InternetMainPage actual) {
        super(actual, InternetMainPageAssert.class);
    }

    public static InternetMainPageAssert assertThat(InternetMainPage actual) {
        return new InternetMainPageAssert(actual);
    }

    public InternetMainPage page() {
        return actual;
    }

    @Step("Пользователь видит кнопку 'Checkboxes'")
    public InternetMainPageAssert checkboxesButtonIsVisible() {
        actual.checkboxesButton.shouldBe(visible);

        return this;
    }

    @Step("Пользователь видит кнопку 'Dropdown'")
    public InternetMainPageAssert dropdownButtonIsVisible() {
        actual.dropdownButton.shouldBe(visible);

        return this;
    }

    @Step("Пользователь видит кнопку 'Disappearing Elements'")
    public InternetMainPageAssert disappearingElementsButtonIsVisible() {
        actual.disappearingElementsButton.shouldBe(visible);

        return this;
    }

    @Step("Пользователь видит кнопку 'Inputs'")
    public InternetMainPageAssert inputsButtonIsVisible() {
        actual.inputsButton.shouldBe(visible);

        return this;
    }

}