import org.junit.jupiter.api.Test;

public class InputsTest extends BasicTest {

    @Test
    public void checkInputField() {
        internetMainPage
                .check()
                .inputsButtonIsVisible()
                .page()
                .clickInputsButton();
        inputsPage
                .check()
                .inputIsVisible()
                .page()
                .enterValue("123")
                .check()
                .checkInputValue("123");
    }

}