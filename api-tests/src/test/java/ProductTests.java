import assertions.ProductAssert;
import endpoints.AuthApi;
import endpoints.ProductsApi;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTests {

    ProductsApi productsApi;

    @BeforeEach
    void getAuthToken() {
        String token = AuthApi.loginUser("IvanIvanov", "1234").jsonPath().getString("access_token");
        productsApi = new ProductsApi(token);
    }

    @Test
    void checkProductById() {
        Response response = productsApi.getProductWithoutAuth("1");
        ProductAssert.assertThat(response)
                .checkProductResponse("Electronics", 10.0, 1, "HP Pavilion Laptop", 10.99);
    }

    @Test
    void checkQuantityOfProductsInList() {
        Response response = productsApi.getProductsWithoutAuth();
        ProductAssert.assertThat(response)
                .checkProductsResponse(16);
    }

}