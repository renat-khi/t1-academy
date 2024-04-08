package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class InputsPage {

    SelenideElement input = $x(".//input[@type='number']");

    public InputsPageAssert check() {
        return InputsPageAssert.assertThat(this);
    }

    @Step("Введено значение '{value}'")
    public InputsPage enterValue(String value) {
        input.sendKeys(value);

        return this;
    }

}