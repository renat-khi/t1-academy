import org.junit.jupiter.api.RepeatedTest;

public class DisappearingElementsTest extends BasicTest {

    @RepeatedTest(1)
    public void checkElementsOnPage() {
        internetMainPage
                .check()
                .disappearingElementsButtonIsVisible()
                .page()
                .clickDisappearingElementsButton();
        disappearingElementsPage
                .refreshPage()
                .check()
                .checkThatFiveElementsIsVisible();
    }

}