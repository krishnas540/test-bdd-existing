package Utils;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Cookie;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;
import javafx.util.Builder;
import org.apache.http.client.methods.RequestBuilder;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;

public class RestAssuredMethods {
    public ValidatableResponse response;
    public  RequestSpecBuilder requestSpecBuilder;
    public RequestSpecification requestSpecification;

    public RequestSpecification getRequestSpecification() {
        requestSpecification = given().config(RestAssured.config().sslConfig(new SSLConfig().relaxedHTTPSValidation().allowAllHostnames()));
        return requestSpecification;
    }

    public ValidatableResponse getCall(String host, String endpoint) throws  Throwable{
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(host);
        requestSpecBuilder.setBasePath(endpoint);
        requestSpecBuilder.setAccept(ContentType.JSON);
        RequestSpecification requestSpecification = requestSpecBuilder.build();
        response = given().spec(requestSpecification).get().then().log().status();
        return  response;
    }

    public ValidatableResponse postCall(String host, String endpoint, String payLoad) throws  Throwable{
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(host);
        requestSpecBuilder.setBasePath(endpoint);
        requestSpecBuilder.setBody(payLoad);
        RequestSpecification requestSpecification = requestSpecBuilder.build();
        response = given().spec(requestSpecification).post().then().log().status();
        return  response;
        /*if some service uses heardes we need to define as Hashmap
                HashMap headers = new HashMap();
        headers.put("Autherization", "abcd");
        response = given().spec(requestSpecification).header(headers).post().then().log().status();*/
    }

    public ValidatableResponse putCall(String host, String endpoint, String payLoad) throws  Throwable{
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(host);
        requestSpecBuilder.setBasePath(endpoint);
        requestSpecBuilder.setBody(payLoad);
        RequestSpecification requestSpecification = requestSpecBuilder.build();
        response = given().spec(requestSpecification).put().then().log().status();
        return  response;
    }

    public String patchCall(String host, String endpoint, String payLoad) throws  Throwable{
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(host);
        requestSpecBuilder.setBasePath(endpoint);
        requestSpecBuilder.setBody(payLoad);
        RequestSpecification requestSpecification = requestSpecBuilder.build();
        response = given().spec(requestSpecification).patch().then().log().status();
        return  response.extract().body().toString();
    }

    public ValidatableResponse deleteCall(String host, String endpoint, String payLoad) throws  Throwable{
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(host);
        requestSpecBuilder.setBasePath(endpoint);
        requestSpecBuilder.setBody(payLoad);
        RequestSpecification requestSpecification = requestSpecBuilder.build();
        response = given().spec(requestSpecification).delete().then().log().status();
        return  response;
    }

    public String deleteCallWithoutBoyd(String host, String endpoint) throws  Throwable{
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(host);
        requestSpecBuilder.setBasePath(endpoint);
        RequestSpecification requestSpecification = requestSpecBuilder.build();
        response = given().spec(requestSpecification).delete().then().log().status();
        return  response.extract().body().toString();
    }
}
