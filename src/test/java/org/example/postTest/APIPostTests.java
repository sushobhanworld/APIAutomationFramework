package org.example.postTest;

import io.restassured.response.Response;
import org.example.Configs.pojo.AuthPayLoad;
import org.example.Configs.utils.JsonParsar;
import org.example.base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APIPostTests extends BaseTest
{
    AuthPayLoad authPayLoad= new AuthPayLoad();
    @Test
    public void test() throws Exception {
        authPayLoad.setUsername("admin");
        authPayLoad.setPassword("password123");
        Response response= given(requestSpecification).relaxedHTTPSValidation("TLS").body(authPayLoad).post("auth").then().spec(responseSpecification).extract().response();
        System.out.println(response.asString());
        String token= JsonParsar.parse(response.asString(), "token");
        System.out.println(token);
    }
}
