package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Condition.visible;

public class DropdownPageAssert extends AbstractAssert<DropdownPageAssert, DropdownPage> {

    public DropdownPageAssert(DropdownPage actual) {
        super(actual, DropdownPageAssert.class);
    }

    public static DropdownPageAssert assertThat(DropdownPage actual) {
        return new DropdownPageAssert(actual);
    }

    public DropdownPage page() {
        return actual;
    }

    @Step("Выпадающий список отображается")
    public DropdownPageAssert dropdownIsVisible() {
        actual.dropdown.shouldBe(visible);

        return this;
    }

    @Step("Провеирть что в выпадающем списке выбрано значение '{value}'")
    public DropdownPageAssert checkSelectedValue(String value) {
        Assertions.assertThat(actual.dropdown.getSelectedOptionText())
                .as("В выпадающем списке не выбрано значение " + value)
                .isEqualTo(value);

        return this;
    }

}