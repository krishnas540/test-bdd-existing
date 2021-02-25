package implementations;

import Utils.RestAssuredMethods;
import com.jayway.restassured.response.ValidatableResponse;
import cucumber.api.java.cs.A;
import org.junit.Assert;

public class DeleteEmpolyeeserviceIMPL {

    RestAssuredMethods restAssuredMethods = new RestAssuredMethods();
    public ValidatableResponse response;

    public void deleteempolyeeserivecall(int employeeID) throws Throwable {
        String host = "http://dummy.restapiexample.com";
        String endpoint = "/api/v1/delete/"+employeeID;
        String body = "";
        response = restAssuredMethods.deleteCall(host,endpoint,body);
        Assert.assertEquals(200, response.extract().statusCode());

    }
    public void validatetheResponse(String status) throws Throwable {
        System.out.println("here I'm going to validae the response..");
        Assert.assertEquals(200, response.extract().statusCode());
        System.out.println(response.extract().body().asString());
        Assert.assertTrue(response.extract().body().asString().contains(status));
        System.out.println("validated the response successfully..");

    }
}
