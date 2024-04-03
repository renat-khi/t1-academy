package assertions;

import io.restassured.response.Response;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class BasicAssert extends AbstractAssert<BasicAssert, Response> {

    public BasicAssert(Response actual) {
        super(actual, BasicAssert.class);
    }

    public static BasicAssert assertThat(Response actual) {
        return new BasicAssert(actual);
    }

    public BasicAssert statusCodeIsEqual(int expectedCode) {
        Assertions.assertThat(actual.getStatusCode())
                .as("Код ответа не равен " + expectedCode)
                .isEqualTo(expectedCode);

        return this;
    }

}