package assertions;

import io.restassured.response.Response;
import org.assertj.core.api.AbstractAssert;

public class ProductAssert extends AbstractAssert<BasicAssert, Response> {

    public ProductAssert(Response actual) {
        super(actual, ProductAssert.class);
    }

    public static ProductAssert assertThat(Response actual) {
        return new ProductAssert(actual);
    }

    public ProductAssert checkProductResponse(){
        BasicAssert.assertThat(actual)
                .statusCodeIsEqual(200);

        return this;
    }

}
