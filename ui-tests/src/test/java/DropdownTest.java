import org.junit.jupiter.api.Test;

public class DropdownTest extends BasicTest {

    @Test
    public void checkWorkDropdown() {
        internetMainPage
                .check()
                .dropdownButtonIsVisible()
                .page()
                .clickDropdownButton();
        dropdownPage
                .check()
                .dropdownIsVisible()
                .page()
                .selectValue("Option 1")
                .check()
                .checkSelectedValue("Option 1")
                .page()
                .selectValue("Option 2")
                .check()
                .checkSelectedValue("Option 2");
    }

}