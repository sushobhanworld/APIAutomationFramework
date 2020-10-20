package org.example.base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.Configs.HeaderConfigs;
import org.example.Configs.RequestParams;
import org.example.Configs.pojo.AddPlace;
import org.example.Configs.utils.FileandEnv;
import org.testng.annotations.BeforeClass;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class BaseTest
{
    protected RequestSpecification requestSpecification;
    protected ResponseSpecification responseSpecification;
    protected PrintStream printStream;
    HeaderConfigs headerConfigs= new HeaderConfigs();
    @BeforeClass
    public void commonTest() throws Exception
    {
        PrintStream log =new PrintStream(new FileOutputStream(System.getProperty("user.dir")+"/logs/LogFile.log"));
        requestSpecification= new RequestSpecBuilder()
                .addFilter(RequestLoggingFilter.logRequestTo(log))
                .addFilter(ResponseLoggingFilter.logResponseTo(log))
                .setBaseUri(FileandEnv.ReadFile().get("ServerURL"))
                .setContentType(ContentType.JSON)
                .addHeaders(headerConfigs.defaultHeaders())
                .build();

        responseSpecification= new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
    }
}
