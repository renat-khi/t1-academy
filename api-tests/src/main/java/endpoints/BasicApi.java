package endpoints;

import io.restassured.specification.RequestSpecification;
import utils.RestApiBuilder;

public class BasicApi {
    protected String token;

    public BasicApi(String token) {
        this.token = token;
    }

    public RequestSpecification getBuilder() {
        return new RestApiBuilder("http://9b142cdd34e.vps.myjino.ru:49268")
                .addAuth(token)
                .build();
    }

    public RequestSpecification getBuilderWithoutAuth() {
        return new RestApiBuilder("http://9b142cdd34e.vps.myjino.ru:49268")
                .build();
    }

}