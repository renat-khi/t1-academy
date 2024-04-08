import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;
import utils.Configurations;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class BasicTest {

    Configurations configurations = ConfigFactory.create(Configurations.class);
    protected InternetMainPage internetMainPage = new InternetMainPage();
    protected CheckboxesPage checkboxesPage = new CheckboxesPage();
    protected DropdownPage dropdownPage = new DropdownPage();
    protected DisappearingElementsPage disappearingElementsPage = new DisappearingElementsPage();
    protected InputsPage inputsPage = new InputsPage();

    @BeforeEach
    @Step("Открыть сайт ")
    public void setUp() {
        open(configurations.baseUrl());
        Configuration.timeout = 10000;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));
    }

    @AfterEach
    @Step("Закрыть драйвер")
    public void tearDown() {
        closeWindow();
    }

}