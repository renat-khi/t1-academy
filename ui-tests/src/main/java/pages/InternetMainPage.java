package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class InternetMainPage {

    SelenideElement checkboxesButton = $x(".//a[@href='/checkboxes']");
    SelenideElement dropdownButton = $x(".//a[@href='/dropdown']");
    SelenideElement disappearingElementsButton = $x(".//a[@href='/disappearing_elements']");
    SelenideElement inputsButton = $x(".//a[@href='/inputs']");

    public InternetMainPageAssert check() {
        return InternetMainPageAssert.assertThat(this);
    }

    public InternetMainPage clickCheckboxesButton() {
        checkboxesButton.shouldBe(visible).click();

        return this;
    }

    public InternetMainPage clickDropdownButton() {
        dropdownButton.shouldBe(visible).click();

        return this;
    }

    public InternetMainPage clickDisappearingElementsButton() {
        disappearingElementsButton.shouldBe(visible).click();

        return this;
    }

    public InternetMainPage clickInputsButton() {
        inputsButton.shouldBe(visible).click();

        return this;
    }

}