package implementations;

import Utils.RestAssuredMethods;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetEmployeesImpl {
    public ValidatableResponse response;
    RestAssuredMethods restAssuredMethods = new RestAssuredMethods();
    public void  getEmployeesInfo() throws Throwable {

        String host = "http://dummy.restapiexample.com";
        String enpoint = "/api/v1/employees";
        response = restAssuredMethods.getCall(host, enpoint);
        Assert.assertEquals(200,response.extract().statusCode());
        System.out.println("status code from the service is validated successfully!");
        System.out.println(response.extract().body().asString());
        Assert.assertTrue(response.extract().body().asString().contains("Tiger Nixon"));
        System.out.println("validated - the name tiger nixon is available in the employee list");
        Assert.assertFalse(response.extract().body().asString().contains("Satya"));
        System.out.println("validated - the name satya is not available in the employee list");

    }


    public void  createAnEmplee(String name, String salary, String age) throws Throwable {

        String host = "http://dummy.restapiexample.com";
        String enpoint = "/api/v1/create";
        String body = "{\"name\":\""+name+"\",\"salary\":\""+salary+"\",\"age\":\""+age+"\"}";
        System.out.println(body);
        response = restAssuredMethods.postCall(host,enpoint,body);
        Assert.assertEquals(200,response.extract().statusCode());
        System.out.println("status code from the service is validated successfully!");
        System.out.println(response.extract().body().asString());
        Assert.assertTrue(response.extract().body().asString().contains("success"));
        System.out.println("validated - employee as created");


    }

    public void updateanempolyee() throws Throwable {
        String host= "http://dummy.restapiexample.com";
        String endpoint = "/api/v1/update/21";
        String body = "{\"name\":\"test1\",\"salary\":\"1123\",\"age\":\"23\"}";
        response = restAssuredMethods.putCall(host,endpoint,body);
        Assert.assertEquals(200,response.extract().statusCode());
        System.out.println("status code from the service is validated successfully!");
        System.out.println(response.extract().body().asString());
        Assert.assertTrue(response.extract().body().asString().contains("success"));
        System.out.println("validated - employee as   updated");


    }
}
