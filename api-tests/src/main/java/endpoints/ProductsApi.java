package endpoints;

import io.restassured.response.Response;

public class ProductsApi extends BasicApi{
    public ProductsApi(String token){
        super(token);
    }

    public Response getProducts(){
        return  getBuilder()
                .get(Urls.PRODUCTS);
    }

}