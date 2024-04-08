import org.junit.jupiter.api.Test;

public class CheckboxesTest extends BasicTest {

    @Test
    public void checkWorkCheckboxes() {
        internetMainPage
                .check()
                .checkboxesButtonIsVisible()
                .page()
                .clickCheckboxesButton();
        checkboxesPage
                .clickOnFirstCheckbox()
                .clickOnSecondCheckbox()
                .check()
                .firstCheckboxIsChecked()
                .secondCheckboxIsNotChecked();
    }

}