import assertions.CartAssert;
import endpoints.AuthApi;
import endpoints.CartApi;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartTests {

    CartApi cartApi;

    @BeforeEach
    void getAuthToken() {
        String token = AuthApi.loginUser("IvanIvanov", "1234").jsonPath().getString("access_token");
        cartApi = new CartApi(token);
    }

    @Test
    void checkTotalPriceInCart() {
        Response response = cartApi.getCart();
        CartAssert.assertThat(response)
                .checkTotalPriceInCartResponse(86.93);
    }

}