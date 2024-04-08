package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CheckboxesPage {

    SelenideElement firstCheckbox = $x(".//input[@type='checkbox'][1]");

    SelenideElement secondCheckbox = $x(".//input[@type='checkbox'][2]");

    public CheckboxesPageAssert check() {
        return CheckboxesPageAssert.assertThat(this);
    }

    @Step("Нажать на первый чекбокс")
    public CheckboxesPage clickOnFirstCheckbox() {
        firstCheckbox.shouldBe(visible).click();

        return this;
    }

    @Step("Нажать на второй чекбокс")
    public CheckboxesPage clickOnSecondCheckbox() {
        secondCheckbox.shouldBe(visible).click();

        return this;
    }

}