package org.example.postTest.getTest;

import io.restassured.response.Response;
import org.example.base.BaseTest;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class APIGetTests extends BaseTest
{
    @Test
    public void test()
    {
        Response response= given(requestSpecification).relaxedHTTPSValidation("TLS").get("/books").then().spec(responseSpecification)
                .extract().response();
        System.out.println(response.asString());
    }
}
