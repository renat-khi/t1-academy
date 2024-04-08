package pages;

import io.qameta.allure.Step;
import org.assertj.core.api.AbstractAssert;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;

public class DisappearingElementsPageAssert extends AbstractAssert<DisappearingElementsPageAssert, DisappearingElementsPage> {

    public DisappearingElementsPageAssert(DisappearingElementsPage actual) {
        super(actual, DisappearingElementsPageAssert.class);
    }

    public static DisappearingElementsPageAssert assertThat(DisappearingElementsPage actual) {
        return new DisappearingElementsPageAssert(actual);
    }

    public DisappearingElementsPage page() {
        return actual;
    }

    @Step("Проверить что на странице 5 видимых элементов")
    public DisappearingElementsPageAssert checkThatFiveElementsIsVisible() {
        actual.elements.shouldHave(size(5))
                .forEach(element -> element.shouldBe(visible));

        return this;
    }

}