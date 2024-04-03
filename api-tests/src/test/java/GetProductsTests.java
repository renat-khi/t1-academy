import assertions.ProductAssert;
import endpoints.AuthApi;
import endpoints.ProductsApi;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GetProductsTests {

   ProductsApi productsApi;

   @BeforeEach
    void getAuthToken(){
        String token = AuthApi.loginUser("testUserName", "testPassword").jsonPath().getString("access_token");
        productsApi = new ProductsApi(token);
    }

    @Test
    void test(){
        Response response = productsApi.getProducts();
        ProductAssert.assertThat(response)
                .checkProductResponse();
        
    }

}