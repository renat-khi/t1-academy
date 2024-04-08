package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.Condition.checked;

public class CheckboxesPageAssert extends AbstractAssert<CheckboxesPageAssert, CheckboxesPage> {

    public CheckboxesPageAssert(CheckboxesPage actual) {
        super(actual, CheckboxesPageAssert.class);
    }

    public static CheckboxesPageAssert assertThat(CheckboxesPage actual) {
        return new CheckboxesPageAssert(actual);
    }

    public CheckboxesPage page() {
        return actual;
    }

    @Step("Первый чекбокс автивирован")
    public CheckboxesPageAssert firstCheckboxIsChecked() {
        actual.firstCheckbox.shouldBe(checked);

        return this;
    }

    @Step("Второй чекбокс не автивирован")
    public CheckboxesPageAssert secondCheckboxIsNotChecked() {
        actual.secondCheckbox.shouldNotBe(checked);

        return this;
    }

}