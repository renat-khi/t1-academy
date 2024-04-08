package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropdownPage {

    SelenideElement dropdown = $(By.id("dropdown"));

    public DropdownPageAssert check() {
        return DropdownPageAssert.assertThat(this);
    }

    @Step("В выпадающем списке выбрать значение '{value}'")
    public DropdownPage selectValue(String value) {
        dropdown.selectOption(value);

        return this;
    }

}