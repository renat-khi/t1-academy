package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$$x;


public class DisappearingElementsPage {

    ElementsCollection elements = $$x(".//li");

    public DisappearingElementsPageAssert check() {
        return DisappearingElementsPageAssert.assertThat(this);
    }

    @Step("Обновить страницу")
    public DisappearingElementsPage refreshPage() {
        Selenide.refresh();

        return this;
    }

}